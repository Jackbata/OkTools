package com.up.lhm.oktools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.up.lhm.hmtools.number.ConvertUtils;
import com.up.lhm.hmtools.system.ToastUtils;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    /**
     * 打印日志
     */
    private Button mBtnLog;
    /**
     * 弹窗
     */
    private Button mBtnDialog;
    /**
     * 跳转到新页面
     */
    private Button mBtnJump;

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
        mBtnJump = findViewById(R.id.btn_jump);
    }

    private void setListener() {
        mBtnLog.setOnClickListener(this);
        mBtnDialog.setOnClickListener(this);
        mBtnJump.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_log:
                int i = ConvertUtils.convert2Int("1314.22");
                ToastUtils.setBgColor(getResources().getColor(R.color.colorAccent));
                ToastUtils.showShort(i+"");
                break;
            case R.id.btn_dialog:
                break;
            case R.id.btn_jump:
                TextActivity.start(MainActivity.this,false);
                break;
            default:
                break;
        }
    }
}
