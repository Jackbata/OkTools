package com.up.lhm.oktools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    /**
     * 打印日志
     */
    private Button mBtnLog;
    /**
     * 弹窗
     */
    private Button mBtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void initView() {
        mBtnLog = findViewById(R.id.btn_log);
        mBtnDialog = findViewById(R.id.btn_dialog);
    }

    private void setListener() {
        mBtnLog.setOnClickListener(this);
        mBtnDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_log:

                break;
            case R.id.btn_dialog:
                break;
            default:
                break;
        }
    }
}
