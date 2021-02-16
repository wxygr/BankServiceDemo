package com.saltedfish.bankservicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;

import com.saltedfish.bankservicedemo.actions.interfaces.INormalUserAction;

public class NormalUserActivity extends AppCompatActivity {

    private static final String TAG = "----NormalUserActivity";
    private NormalUserConnection mNormalUserConnection;
    private boolean isBindService;
    private INormalUserAction mNormalUserAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_user);
        doBindService();
    }

    private void doBindService() {
        Log.d(TAG, "doBindService...");
        Intent intent = new Intent();
        intent.setAction(Constants.ACTION_USER_NORMAL);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        intent.setPackage("com.saltedfish.bankservicedemo");
        mNormalUserConnection = new NormalUserConnection();
        isBindService = bindService(intent, mNormalUserConnection, BIND_AUTO_CREATE);
    }

    private class NormalUserConnection implements ServiceConnection {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(TAG, "onServiceConnected..." + componentName);
            mNormalUserAction = (INormalUserAction) iBinder;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(TAG, "onServiceDisconnected..." + componentName);
        }
    }

    public void saveMoneyClick(View view) {
        Log.d(TAG, "saveMoneyClick...");
        mNormalUserAction.saveMoney(100);
    }

    public void getMoneyClick(View view) {
        Log.d(TAG, "getMoneyClick...");
        mNormalUserAction.getMoney();
    }

    public void loanMoneyClick(View view) {
        Log.d(TAG, "loanMoneyClick...");
        mNormalUserAction.loanMoney();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isBindService && mNormalUserConnection != null) {
            unbindService(mNormalUserConnection);
            mNormalUserConnection = null;
            isBindService = false;
        }
    }
}
