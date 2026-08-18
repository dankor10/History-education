package com.example.historyeducation;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class servermanager {
    private static final String SERVER_URL = "https://api.cikava.lectoria.by/auth/api/auth/login";

    public static boolean login(String login, String password) {

        OkHttpClient client = new OkHttpClient();


        JSONObject jsonBody = new JSONObject();
        try {
            jsonBody.put("login", login);
            jsonBody.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonBody.toString());
        Request request = new Request.Builder()
                .url(SERVER_URL)
                .post(body)
                .build();

    //    try {
      //      Response response = client.newCall(request).execute();
        //    if (response.isSuccessful()) {

                String accessToken = tokenstorage.getAccessToken();
                String refreshToken = tokenstorage.getRefreshToken();

                //                tokenstorage.saveTokens(accessToken, refreshToken);

                return true;
          //  } else {

          //      return false;
           // }
       // } catch (IOException | JSONException e) {
         //   e.printStackTrace();
        //    return false;

         //   tokenstorage tokenstorage = new tokenstorage(this);
        //    tokenstorage.saveAccessToken("access_token");//сохр access токен
        //    tokenstorage.saveRefreshToken("refresh_token");//сохр refresh токен

      //  }
    }
}