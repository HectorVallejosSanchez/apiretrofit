package com.example.android.retrofit.api;

import android.media.Image;

import com.example.android.retrofit.model.Basic;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hector on 26/06/16.
 */
public interface Imgur {
    String IMGUR_BASE_URL = "https://api.Imgur.com";
    String IMGUR_CLIENT_ID = "4244aa3109b0e78";
    String AUTHORIZATION_URL = "https://api.Imgur.com/oauth2/authorize?client_id=" + IMGUR_CLIENT_ID + "&response_type=token";
    String REDIRECT_URL = "https://appretrofit:88";

    interface Auth {
        @GET("3/account/{username}/images/{page}")
        Call<Basic<ArrayList<Image>>>images(@Path("username") String username,
                                            @Path("page") int page);
    }

}