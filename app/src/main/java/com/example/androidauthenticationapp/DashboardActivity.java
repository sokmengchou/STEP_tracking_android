package com.example.androidauthenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    private EditText etSearchId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        final String username = getIntent().getStringExtra("username");
        String welcomeText = "Welcome " + getIntent().getStringExtra("username") + "!";
        TextView tvWelcome = findViewById(R.id.tvSubtitle);
        tvWelcome.setText(welcomeText);

        etSearchId = findViewById(R.id.textInputEditText);

        findViewById(R.id.buttonHistory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, HistoryActivity.class).putExtra("username",username));
            }
        });

        findViewById(R.id.buttonProgress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, activity_progress.class).putExtra("username",username));
            }
        });


        findViewById(R.id.imageProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ProfileActivity.class).putExtra("username",username));
            }
        });


        findViewById(R.id.searchOriginId).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String originId = etSearchId.getText().toString().trim();
                startActivity(new Intent(DashboardActivity.this, Progress_detail_Activity.class).putExtra("username",username).putExtra("originId",originId));
            }
        });
    }
}