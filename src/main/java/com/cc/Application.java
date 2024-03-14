package com.cc;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.cc.pojo.JsonRootBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 读取resources目录下的json.json文件
        String jsonStr = ResourceUtil.readUtf8Str("data_favorite.json");
        jsonStr = jsonStr.replaceAll("\\{\\}", "1");

        // 将JSON字符串转换为JsonRootBean对象
        JsonRootBean bean = JSONUtil.toBean(jsonStr, JsonRootBean.class);
        List<String> videoDescriptions = new ArrayList<>();
        List<String> videos = new ArrayList<>();

        // 解析JsonRootBean对象的数据
        for (int i = 0; i < bean.getAweme_list().size(); i++) {
            videoDescriptions.add("'"+bean.getAweme_list().get(i).getDesc().replace("\n","<br>")+"'");
            downloadVideo(bean.getAweme_list().get(i).getVideo().getPlay_addr().getUrl_list().get(0), "video/"+i+".mp4");
            videos.add("'video/"+i+".mp4'");
        }

        // 生成用于html的数据文件
        FileUtil.writeString("let videoDescriptions = "+Arrays.toString(videoDescriptions.toArray()), "data_videoDescriptions.js", "UTF-8");
        FileUtil.writeString("let videos = "+Arrays.toString(videos.toArray()), "data_videos.js", "UTF-8");
    }

    private static void downloadVideo(String videoUrl, String fileName) {
        HttpUtil.downloadFile(videoUrl, FileUtil.file(fileName));
        System.out.println(fileName+"下载完成");
    }
}