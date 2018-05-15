package com.grant.rightslip.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FristActivity extends AppCompatActivity {

    private SlideBackLayout mSlideBackLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        mSlideBackLayout = new SlideBackLayout(this);
        mSlideBackLayout.bind();
    }
}
