package com.example.vjm.Retrofit;

import com.example.vjm.POJO.CategoryFields;
import com.example.vjm.POJO.NoticeFields;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("fetchNotice.php")
    Call<List<NoticeFields>> fetchNotice();

    @GET("fetchCategory.php")
    Call<List<CategoryFields>> fetchCategory();
}
