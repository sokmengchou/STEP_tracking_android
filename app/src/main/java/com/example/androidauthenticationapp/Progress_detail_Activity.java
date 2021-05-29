package com.example.androidauthenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Progress_detail_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_detail_);
        final String username = getIntent().getStringExtra("username");

        fetchData();

        findViewById(R.id.textView11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Progress_detail_Activity.this, TrackActivity.class));
            }
        });

    }

    private void fetchData() {
        final String originId = getIntent().getStringExtra("originId");
        retrofit2.Call<PackageOrigin> call = RetrofitClient
                .getInstance()
                .getAPI()
                .getOrigin(originId,"Bearer "+ User.token);

        call.enqueue(new Callback<PackageOrigin>() {
            @Override
            public void onResponse(retrofit2.Call<PackageOrigin> call, Response<PackageOrigin> response) {
                   if(response.isSuccessful()) {
                       if (response.body() != null) {
                           String TrackingID = response.body().getOriginTrackingNumber();
                           String PackageCode = response.body().getPackageCode();
                           String Name = response.body().getName();
                           String Desc = response.body().getDescription();
                           String Weight = response.body().getWeight().toString();
                           String Price = response.body().getPrice().toString();
                           String Status = response.body().getStatus();

                           TextView tvPackageCode = findViewById(R.id.textViewPackageCode);
                           tvPackageCode.setText(PackageCode);

                           TextView tvTrackingID = findViewById(R.id.textViewTrackingId);
                           tvTrackingID.setText(TrackingID);

                           TextView tvName = findViewById(R.id.textViewName);
                           tvName.setText(Name);

                           TextView tvDesc = findViewById(R.id.textViewDesc);
                           tvDesc.setText(Desc);

                           TextView tvWeight = findViewById(R.id.textViewWeight);
                           tvWeight.setText(Weight);

                           TextView tvPrice = findViewById(R.id.textViewPrice);
                           tvPrice.setText(Price);

                           TextView tvStatus = findViewById(R.id.textViewStatus);
                           tvStatus.setText(Status);
                       }
                   } else {
                }
            }

            @Override
            public void onFailure(Call<PackageOrigin> call, Throwable t) {
            }
        });

    }
}