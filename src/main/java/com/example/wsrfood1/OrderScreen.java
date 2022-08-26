package com.example.wsrfood1;

import android.app.Activity;
import android.os.Bundle;


import com.example.wsrfood1.databinding.ActivityOrderScreenBinding;

public class OrderScreen extends Activity {

    private ActivityOrderScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOrderScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}