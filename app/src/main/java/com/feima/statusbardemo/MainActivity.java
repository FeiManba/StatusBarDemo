package com.feima.statusbardemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.feima.statusbardemo.eyes.Eyes;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * status_blue
     */
    private Button mBtnStatusBlue;
    /**
     * status_red
     */
    private Button mBtnStatusRed;
    /**
     * status_while
     */
    private Button mBtnStatusWhile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnStatusBlue = (Button) findViewById(R.id.btn_status_blue);
        mBtnStatusBlue.setOnClickListener(this);
        mBtnStatusRed = (Button) findViewById(R.id.btn_status_red);
        mBtnStatusRed.setOnClickListener(this);
        mBtnStatusWhile = (Button) findViewById(R.id.btn_status_while);
        mBtnStatusWhile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn_status_blue:
                Eyes.setStatusBarLightMode(this, Color.BLUE);
                break;
            case R.id.btn_status_red:
                Eyes.setStatusBarLightMode(this, Color.RED);
                break;
            case R.id.btn_status_while:
                Eyes.setStatusBarLightMode(this,Color.WHITE);
                break;
        }
    }
}