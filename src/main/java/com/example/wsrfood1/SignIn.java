package com.example.wsrfood1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wsrfood1.databinding.ActivitySignInBinding;

public class SignIn extends Activity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    public void OrderScreenButton(View v) {
        Intent intent = new Intent(this, OrderScreen.class);
        startActivity(intent);
    }
}