package com.example.cyrinehammmi.gps;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
/**
 * Created by Cyrine Hammémi on 30/01/2018.
 */

public interface ApiService {

    @FormUrlEncoded
    @POST("user/update")
    Call<ResponseModel<userModel>> create(@Field("userID") String userID, @Field("latitude") Double latitude,@Field("atitude") Double atitude);

    @GET("callendrier/getAll")
    Call<ResponseModel<ArrayList<userModel>>> getAll();

}
