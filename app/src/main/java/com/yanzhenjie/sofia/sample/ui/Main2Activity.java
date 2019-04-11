package com.yanzhenjie.sofia.sample.ui;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.yanzhenjie.sofia.Bar;
import com.yanzhenjie.sofia.Sofia;
import com.yanzhenjie.sofia.sample.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setImmersiveStatusBar();
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private void setImmersiveStatusBar() {
        Bar bar = Sofia.with(this);
        // Sofia 会重新绘制根布局
        View layoutView = ((ViewGroup) findViewById(R.id.content)).getChildAt(0);
        if (layoutView.getBackground() != null) {
            bar.statusBarBackgroundAlpha(0).invasionStatusBar();
        } else {
            bar.statusBarBackground(Color.RED);
        }

        bar.navigationBarBackground(Color.GREEN);
    }
}
