package com.example.wsrfood1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wsrfood1.databinding.SplashScreenBinding;

public class SplashScreen extends Activity {

    private SplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = SplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    public void SignInButton(View v) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}
