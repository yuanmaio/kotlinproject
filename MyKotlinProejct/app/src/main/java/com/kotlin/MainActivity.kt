package com.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.presenter.RecommendPresenter

class MainActivity : AppCompatActivity() {
    /**
     * 初始化presenter;
     */
    private  val recommendpresenter: RecommendPresenter by lazy {
        RecommendPresenter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
    }
    fun loadData(){
        recommendpresenter.getrecommend("CA240103AD73B4289206E871072B15F0","1","1527995026")
    }
}
