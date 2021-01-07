package com.tzuhung.android19thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TV_msg= (TextView)findViewById(R.id.TV_msg);
        TV_msg.setText("Got Message");
        Handler handler = new Handler();
        handler.postDelayed(runTimer, 2000);
    }
    private final Runnable runTimer = new Runnable() {
        @Override
        public void run() {
            Message msg = new Message();
            msg.obj = "Got it";
            Handler handler = new Handler();
            TextView TV_msg = (TextView)findViewById(R.id.TV_msg);
            handler.sendMessage(msg);
            TV_msg.setText("Got it");
        }
    };
}