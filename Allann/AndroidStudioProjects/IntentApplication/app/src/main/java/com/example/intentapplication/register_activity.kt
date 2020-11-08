package com.example.intentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activity)

        val TextView btn = findViewById(R.id.alreadyHaveAccount)

        val btn.setOnClickListener(new View.OnClickListener()run {
            @Override
            val public void onClick(View v) {
            val new
            startActivity(new Intent(LoginActivity.this.LoginActivity.class)
        }
        }
        )}
    }
}