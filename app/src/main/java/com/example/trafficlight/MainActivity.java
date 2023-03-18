package com.example.trafficlight;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    public LinearLayout linearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
    }

    public void buttonRed_Click(View v)
    {
        linearLayout.setBackgroundResource(R.color.redColor);
    }
    public void buttonGreen_Click(View v)
    {
        linearLayout.setBackgroundResource(R.color.greenColor);
    }
     public void buttonYellow_Click(View v)
    {
        linearLayout.setBackgroundResource(R.color.yellowColor);
    }
}