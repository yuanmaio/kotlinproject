package com.kotlin.presenter

import com.kotlin.bean.EntityBean
import com.kotlin.http.HttpManager
import io.reactivex.Observable

/**

 * 作者：温澜 on 2018-06-08 14:42

 * 邮箱：826332775@qq.com

 */
public class RecommendModel{

    fun getreommendlist(req_key:String,page:String,current_time:String): Observable<EntityBean>{
        return  HttpManager.INSTANCE.service.getrecommendList(req_key,page,current_time)
    }
}