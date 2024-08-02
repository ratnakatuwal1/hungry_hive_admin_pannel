package com.ratna.hungryhiveadmin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    Button adminLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        adminLoginButton = findViewById(R.id.adminLoginButton);
        adminLoginButton.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, AdminDashboardActivity.class);
            startActivity(intent);
        });
    }
}