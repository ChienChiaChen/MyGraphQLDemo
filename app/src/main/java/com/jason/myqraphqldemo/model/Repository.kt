package com.jason.myqraphqldemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Repository {
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("forkCount")
    @Expose
    var forkCount: Int? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
}