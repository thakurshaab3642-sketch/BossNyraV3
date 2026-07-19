package com.bossnyra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("🤖 Welcome to BossNyra V3\n\nBoss + Nyra is Ready!");
        text.setTextSize(22);

        setContentView(text);
    }
}
