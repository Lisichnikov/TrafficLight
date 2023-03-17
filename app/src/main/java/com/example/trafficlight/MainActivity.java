package com.example.trafficlight;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    public TextView tvInfo;
    public RelativeLayout relativeLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);
        tvInfo = (TextView)findViewById(R.id.textView1);

        Button buttonYellow = (Button)findViewById(R.id.buttonYellow);

        buttonYellow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInfo.setText(R.string.yellow);
                relativeLayout.setBackgroundResource(R.color.yellowColor);
            }
        });
    }

    public void buttonRed_Click(View v)
    {
        tvInfo.setText(R.string.red);
        relativeLayout.setBackgroundResource(R.color.redColor);
    }

    public void buttonGreen_Click(View v)
    {
        tvInfo.setText(R.string.green);
        relativeLayout.setBackgroundResource(R.color.greenColor);
    }
}