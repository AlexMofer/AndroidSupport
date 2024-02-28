package io.github.alexmofer.android.support.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import io.github.alexmofer.android.support.app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ActivityMainBinding.inflate(getLayoutInflater()).getRoot());
        TestApplicationData.getInstance().toast(this);
    }
}