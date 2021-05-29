package com.example.androidauthenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        fetchData();
    }

    private void fetchData() {
        final String username = getIntent().getStringExtra("username");
        retrofit2.Call<User> call = RetrofitClient
                .getInstance()
                .getAPI()
                .getUsersByUsername(username,"Bearer "+ User.token);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(retrofit2.Call<User> call, Response<User> response) {
                String phone1 = "";
                String address1 = "";

                if (response.body() != null) {
                    phone1 = response.body().getTelephone();
                    address1=response.body().getAddress();
                    String userName = response.body().getUsername();
                    String email = response.body().getEmail();
                    String phone = response.body().getTelephone();
                    String Address = response.body().getAddress();

                    TextView tvUserName = findViewById(R.id.tvUserName);
                    TextView tvUserNameMain = findViewById(R.id.tvUserNameMain);
                    tvUserName.setText(userName);
                    tvUserNameMain.setText(userName);

                    TextView tvEmail = findViewById(R.id.tvEmail);
                    tvEmail.setText(email);

                    TextView tvPhone = findViewById(R.id.tvPhone);
                    tvPhone.setText(phone);

                    TextView tvAddress = findViewById(R.id.tvAddress);
                    tvAddress.setText(Address);


                }
                if (phone1.isEmpty()) {

                    TextView tvPhone = findViewById(R.id.tvPhone);
                    tvPhone.setText("012345678");

                }
                if (address1.isEmpty()){
                    TextView tvAddress = findViewById(R.id.tvAddress);
                    tvAddress.setText("#123, st 63, Chamkamun, Phnom Phenh");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

    }

}