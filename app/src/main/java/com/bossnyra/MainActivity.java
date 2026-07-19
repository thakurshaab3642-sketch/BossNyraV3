package com.bossnyra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("🤖 BossNyra AI\n\nWelcome!");
        tv.setTextSize(24);
        tv.setPadding(50, 100, 50, 50);

        setContentView(tv);
    }
}