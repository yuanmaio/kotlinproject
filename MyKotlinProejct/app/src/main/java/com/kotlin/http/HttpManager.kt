package com.kotlin.http

import android.util.Log
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.kotlin.AppContext
import com.kotlin.api.HttpApi
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus


public class  HttpManager private constructor(){
   private var retrofit: Retrofit? = null
    private var base_url = "http://www.7k.cn/api/"
    private var DEFAULT_TIMEOUT = 5
    private var apiService: HttpApi? = null
    private var client: OkHttpClient? = null
  val service: HttpApi by lazy { getRetrofit()!!.create(HttpApi::class.java)}
    init { }
    companion object {
        val INSTANCE = HttpManager()
    }
   private val appcontext:AppContext by lazy {
       AppContext()
   }
    private fun getRetrofit(): Retrofit? {
             if(retrofit==null){
                 synchronized(HttpManager::class.java){
                     if (retrofit == null) {
                         //添加一个log拦截器,打印所有的log
                         val httpLoggingInterceptor = HttpLoggingInterceptor()
                         //可以设置请求过滤的水平,body,basic,headers
                         httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

                         //设置 请求的缓存的大小跟位置
                      //   val cacheFile = File(appcontext!!.cacheDir, "cache")
                       //  val cache = Cache(cacheFile, 1024 * 1024 * 50) //50Mb 缓存的大小

                         client = OkHttpClient.Builder()
                                 // .addInterceptor(addQueryParameterInterceptor())  //参数添加
                                 //  .addInterceptor(addHeaderInterceptor()) // token过滤
//                            .addInterceptor(addCacheInterceptor())
                                 .addInterceptor(httpLoggingInterceptor) //日志,所有的请求响应度看到
                             //    .cache(cache)  //添加缓存
                                 .connectTimeout(60L, TimeUnit.SECONDS)
                                 .readTimeout(60L, TimeUnit.SECONDS)
                                 .writeTimeout(60L, TimeUnit.SECONDS)
                                 .build()

                         // 获取retrofit的实例
                         retrofit = Retrofit.Builder()
                                 .baseUrl(base_url)  //自己配置
                                 .client(client!!)
                                 .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                                 .addConverterFactory(GsonConverterFactory.create())
                                 .build()
                     }
                 }
             }


        return retrofit
    }
}