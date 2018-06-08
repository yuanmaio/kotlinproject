package com.kotlin.bean

/**
 */
public class List_details{
    private var id:String?=null
    private var color:String?=null
    private var name:String?=null
    private var level:String?=null
    fun getId(): String? {
        return id
    }

    fun setId(_id: String) {
        this.id = _id
    }
    fun getColor(): String? {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }
    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }
    fun getLevel(): String? {
        return level
    }

    fun setLevel(level: String) {
        this.level = level
    }
    }