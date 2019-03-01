package com.up.lhm.oktools;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author lianghaimiao
 * @date 2019/3/1
 * @function
 */

public class TextActivity extends AppCompatActivity {


    public static void start(Context context, boolean finishSelf) {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }
}
