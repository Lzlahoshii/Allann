package com.example.intentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login_activity : AppCompatActivity() {
    private public: Any

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)
        val TextView btn = findViewById(R.id.textViewSignUp)

        val btn.setOnClickListener(new View.OnClickListener()run {
            @Override
            val public void onClick(View v) {
                val new
            startActivity(new Intent(LoginActivity.this.RegisterActivity.class)
            }
        }
        )}

    }
}