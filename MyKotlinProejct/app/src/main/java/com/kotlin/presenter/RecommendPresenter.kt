package com.kotlin.presenter

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 */
public class RecommendPresenter:BasePresenter, getRequestRecommend {
    private val recommendModel:RecommendModel by lazy{
        RecommendModel()
    }
    override fun getrecommend(req_key: String, page: String, current_time: String) {
        recommendModel.getreommendlist(req_key,page,current_time).
                subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe({
            result ->
             val lis= result.data
                    //仅为测试
                    for (Item in lis){
                        print(Item.getApp_id())
                        when(Item.getApp_id().equals("xxx")){
                            Item.getApp_id().equals("xxx")-> print("xxxx")

                        }
                    }
           Log.d("response",result.toString())
        }, {
            error ->
            error.printStackTrace()
        }, {
            Log.d("Kotlin", "onComplete")
        }, {
            Log.d("Kotlin", "onStart")
        })


    }



    override fun showsucess() {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showfail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}