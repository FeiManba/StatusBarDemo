package com.feima.statusbardemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.feima.statusbardemo.eyes.StatusBarUtils;

/**
 * @author mr.zang
 * desc 沉浸式 状态栏
 */
public class ImmersiveStatusBarActivity extends AppCompatActivity {
    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immersive_status_bar);
        initView();
    }

    private void initView() {
        mToolBar = (Toolbar) findViewById(R.id.tool_bar);
        mToolBar.setNavigationIcon(R.mipmap.icon_title_return);

        //获取状态栏的高度 设置 toolbar margins
        int statusBarHeight = StatusBarUtils.getStatusBarHeight(this);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) mToolBar.getLayoutParams();
        params.setMargins(0, statusBarHeight, 0, 0);
        mToolBar.setLayoutParams(params);
    }
}
