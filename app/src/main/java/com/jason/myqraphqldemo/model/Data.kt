package com.jason.myqraphqldemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {
    @SerializedName("repository")
    @Expose
    var repository: Repository? = null
}
