package com.kotlin.bean

/**


 */
public class RecommendList{
 //   private var type: Int = 0
    private var data: List<Recommend>? = null

//    fun getType(): Int {
//        return type
//    }
//
//    fun setType(type: Int) {
//        this.type = type
//    }

    fun getData(): List<Recommend>? {
        return data
    }

    fun setData(data: List<Recommend>) {
        this.data = data
    }

}