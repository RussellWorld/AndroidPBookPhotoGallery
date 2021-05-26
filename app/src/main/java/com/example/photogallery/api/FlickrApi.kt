package com.example.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=97d10d9e120e93f49eef59d8a7e6e729" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>
}