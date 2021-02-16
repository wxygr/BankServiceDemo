package com.saltedfish.bankservicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * 普通员工按钮的点击事件
     * @param view
     */
    public void normalUserClick(View view){
        startActivity(new Intent(this,NormalUserActivity.class));
    }
    /**
     * 银行员工按钮的点击事件
     * @param view
     */
    public void bankWorkerClick(View view){
        startActivity(new Intent(this,BankWorkerActivity.class));
    }
    /**
     * 银行老板按钮的点击事件
     * @param view
     */
    public void bankBossClick(View view){
        startActivity(new Intent(this,BankBossActivity.class));
    }

}
