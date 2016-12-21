package com.example.khiemnv.testcrosswalk;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by quannt on 10/19/2016.
 * Description: ApiInterface for Retrofit
 */

interface ApiInterface {

    //Api get web token
    @FormUrlEncoded
    @POST(Define.API.API_WEB_TOKEN)
    Call<ApiWebTokenResponse> getWebToken(@Field(Define.Fields.FIELD_ID) String id, @Field(Define.Fields.FIELD_PASS) String pass);

}
