package com.bossnyra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(v -> {
            Toast.makeText(
                    this,
                    "API Key Loaded: " + ApiKey.GEMINI_API_KEY.substring(0, 10) + "...",
                    Toast.LENGTH_LONG
            ).show();
        });
    }
}