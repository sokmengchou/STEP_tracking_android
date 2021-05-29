package com.example.androidauthenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class activity_progress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        final String username = getIntent().getStringExtra("username");

        listData();
    }


//    private void fetchData() {
//        Call<ResponseBody> call = RetrofitClient
//                .getInstance()
//                .getAPI()
////        .getOrigin()
//    call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                String s = "";
//                try {
//                    if (response.body() != null) {
//                        response.body().string();
//                        s = response.headers().get("Authorization").replaceAll("Bearer ", "");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                if (!s.isEmpty()) {
//                    User.token = s;
////                    Toast.makeText(LoginActivity.this, "User logged in!", Toast.LENGTH_LONG).show();
////                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class).putExtra("username", username));
//                } else {
////                    Toast.makeText(LoginActivity.this, "Incorrect Credentials! Try again!", Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
////                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        });
//
//    }
    private void listData(){
        final String[] str = {"one", "two", "three", "asdfgf"};
        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        final TextView[] tv = new TextView[10];

        for (int i = 0; i < str.length; i++) {
            tv[i] = new TextView(this);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams
                    ((int) RelativeLayout.LayoutParams.WRAP_CONTENT, (int) LinearLayout.LayoutParams.WRAP_CONTENT);
            params.leftMargin = 50;
            params.topMargin = i * 50;
            tv[i].setText(str[i]);
            tv[i].setTextSize((float) 20);
            tv[i].setPadding(20, 50, 20, 50);
            tv[i].setLayoutParams(params);
            rl.addView(tv[i]);
        }
    }
}
