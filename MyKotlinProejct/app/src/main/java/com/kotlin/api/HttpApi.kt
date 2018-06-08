package com.kotlin.api

import com.kotlin.bean.EntityBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**


 */
interface  HttpApi{
    @GET("recommend/getRand?request_source=android")
    fun getrecommendList(@Query("req_key") req_key:String , @Query("page")page:String , @Query("current_time") current_time:String): Observable<EntityBean>
}