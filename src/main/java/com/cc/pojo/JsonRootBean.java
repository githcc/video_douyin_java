/**
  * Copyright 2024 bejson.com 
  */
package com.cc.pojo;
import java.util.List;

/**
 * Auto-generated: 2024-03-14 18:53:50
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private int status_code;
    private List<Aweme_list> aweme_list;
    private Log_pb log_pb;
    private long max_cursor;
    private int has_more;
    public void setStatus_code(int status_code) {
         this.status_code = status_code;
     }
     public int getStatus_code() {
         return status_code;
     }

    public void setAweme_list(List<Aweme_list> aweme_list) {
         this.aweme_list = aweme_list;
     }
     public List<Aweme_list> getAweme_list() {
         return aweme_list;
     }

    public void setLog_pb(Log_pb log_pb) {
         this.log_pb = log_pb;
     }
     public Log_pb getLog_pb() {
         return log_pb;
     }

    public void setMax_cursor(long max_cursor) {
         this.max_cursor = max_cursor;
     }
     public long getMax_cursor() {
         return max_cursor;
     }

    public void setHas_more(int has_more) {
         this.has_more = has_more;
     }
     public int getHas_more() {
         return has_more;
     }

}