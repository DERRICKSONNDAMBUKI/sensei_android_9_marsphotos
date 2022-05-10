package com.example.android.marsphotos.overview

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter
fun bindImage(imgView: ImageView, imgUrl:String?){
    imgUrl?.let {
        val imgUrl = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUrl)
    }
}