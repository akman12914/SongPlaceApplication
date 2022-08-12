package com.example.songplaceapplication;

import com.example.songplaceapplication.data.User;
import retrofit2.Call;
import retrofit2.http.*;

public interface RetrofitAPI {

    //get - 서버에서 받아옴
    //post - 여기서 보냄
    @POST("login")
    Call<String> getLoginResponce(@Body User user);

}
