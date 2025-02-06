package com.example.myapplication.manager;


import com.example.myapplication.data.DataClass;

import retrofit2.Call;
import retrofit2.http.*;

public interface RetrofitInterface {
    @GET("/asdf")
    Call<DataClass> hello(@Query("어떻게 되야하지?") String wow);
    @POST("/qwer")
    Call<DataClass> kkkk( @Field("필드작성") String exmple );
}
