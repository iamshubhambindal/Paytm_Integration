package com.example.myflipkart;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface VerifyApi {

    String BASE_URL = "http://xxxxxx.ngrok.io/";
    @FormUrlEncoded
    @POST("/paytm/verifyChecksum.php")
    Call<Checksum> verifyChecksum();

}
