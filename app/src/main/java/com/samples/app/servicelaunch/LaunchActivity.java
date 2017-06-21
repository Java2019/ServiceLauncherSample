package com.samples.app.servicelaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_Start:
                startService(new Intent(LaunchActivity.this, PlayService.class));
                break;
            case R.id.btn_Stop:
                stopService(new Intent(LaunchActivity.this, PlayService.class));
                break;
        }
    }
}
