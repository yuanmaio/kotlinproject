package com.kotlin.bean

/**

 * 作者：温澜 on 2018-06-07 16:17

 * 邮箱：826332775@qq.com

 */
public class Recommend{
    private var app_id: String? = null
    private var app_name: String? = null
    private var user_id: String? = null
    private var user_name: String? = null
    private var icon: String? = null
    private var date: String? = null
    private var date_v1: String? = null
    private var pic_of_intro: String? = null
    private var video: String? = null
    private var mark_score: String? = null
    private var download_times: String? = null
    private var video_pic: String? = null
    private var recommend_words: String? = null
    private var tag_list: List<String>? = null
    private var tag_list_details: List<List_details>? = null
    fun getApp_id(): String? {
        return app_id
    }

    fun setApp_id(app_id: String) {
        this.app_id = app_id
    }

    fun getApp_name(): String? {
        return app_name
    }

    fun setApp_name(app_name: String) {
        this.app_name = app_name
    }

    fun getUser_id(): String?{
        return user_id
    }

    fun setUser_id(user_id: String) {
        this.user_id = user_id
    }

    fun getUser_name(): String? {
        return user_name
    }

    fun setUser_name(user_name: String) {
        this.user_name = user_name
    }

    fun getIcon(): String? {
        return icon
    }

    fun setIcon(icon: String) {
        this.icon = icon
    }

    fun getDate(): String? {
        return date
    }

    fun setDate(date: String) {
        this.date = date
    }

    fun getDate_v1(): String ?{
        return date_v1
    }

    fun setDate_v1(date_v1: String) {
        this.date_v1 = date_v1
    }

    fun getPic_of_intro(): String? {
        return pic_of_intro
    }

    fun setPic_of_intro(pic_of_intro: String) {
        this.pic_of_intro = pic_of_intro
    }

    fun getVideo(): String ?{
        return video
    }

    fun setVideo(video: String) {
        this.video = video
    }

    fun getMark_score(): String ?{
        return mark_score
    }

    fun setMark_score(mark_score: String) {
        this.mark_score = mark_score
    }

    fun getDownload_times(): String? {
        return download_times
    }

    fun setDownload_times(download_times: String) {
        this.download_times = download_times
    }

    fun getVideo_pic(): String? {
        return video_pic
    }

    fun setVideo_pic(video_pic: String) {
        this.video_pic = video_pic
    }

    fun getRecommend_words(): String? {
        return recommend_words
    }

    fun setRecommend_words(recommend_words: String) {
        this.recommend_words = recommend_words
    }

    fun getTag_list(): List<String>? {
        return tag_list
    }

    fun setTag_list(tag_list: List<String>) {
        this.tag_list = tag_list
    }

    fun getTag_list_details(): List<List_details>? {
        return tag_list_details
    }

    fun setTag_list_details(tag_list_details: List<List_details>) {
        this.tag_list_details = tag_list_details
    }

}