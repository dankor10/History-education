package com.example.historyeducation;

import android.content.Context;
import android.content.SharedPreferences;

public class tokenstorage {

        private static SharedPreferences sharedPreferences;

    public tokenstorage() {
        Context context = null;
        sharedPreferences = context.getSharedPreferences("TokenManager", Context.MODE_PRIVATE);
        }

        // Метод для сохранения access токена
        public void saveAccessToken(String token) {
            sharedPreferences.edit().putString("access_token", token).apply();
        }

        // Метод для сохранения refresh токена
        public void saveRefreshToken(String token) {
            sharedPreferences.edit().putString("refresh_token", token).apply();
        }

        // Метод для получения access токена
        public static String getAccessToken() {
            return sharedPreferences.getString("access_token", null);
        }

        // Метод для получения refresh токена
        public static String getRefreshToken() {
            return sharedPreferences.getString("refresh_token", null);
        }
    }
