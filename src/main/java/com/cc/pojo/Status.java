/**
  * Copyright 2024 bejson.com 
  */
package com.cc.pojo;

/**
 * Auto-generated: 2024-03-14 18:53:50
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Status {

    private int part_see;
    private boolean is_prohibited;
    private boolean in_reviewing;
    private boolean allow_share;
    private Review_result review_result;
    private int listen_video_status;
    private int private_status;
    private boolean is_delete;
    public void setPart_see(int part_see) {
         this.part_see = part_see;
     }
     public int getPart_see() {
         return part_see;
     }

    public void setIs_prohibited(boolean is_prohibited) {
         this.is_prohibited = is_prohibited;
     }
     public boolean getIs_prohibited() {
         return is_prohibited;
     }

    public void setIn_reviewing(boolean in_reviewing) {
         this.in_reviewing = in_reviewing;
     }
     public boolean getIn_reviewing() {
         return in_reviewing;
     }

    public void setAllow_share(boolean allow_share) {
         this.allow_share = allow_share;
     }
     public boolean getAllow_share() {
         return allow_share;
     }

    public void setReview_result(Review_result review_result) {
         this.review_result = review_result;
     }
     public Review_result getReview_result() {
         return review_result;
     }

    public void setListen_video_status(int listen_video_status) {
         this.listen_video_status = listen_video_status;
     }
     public int getListen_video_status() {
         return listen_video_status;
     }

    public void setPrivate_status(int private_status) {
         this.private_status = private_status;
     }
     public int getPrivate_status() {
         return private_status;
     }

    public void setIs_delete(boolean is_delete) {
         this.is_delete = is_delete;
     }
     public boolean getIs_delete() {
         return is_delete;
     }

}