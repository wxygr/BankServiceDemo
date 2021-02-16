package com.saltedfish.bankservicedemo.actions.impl;

import android.os.Binder;
import android.util.Log;

import com.saltedfish.bankservicedemo.actions.interfaces.IBankWorkerAction;

public class BankWorkerActionImpl extends Binder implements IBankWorkerAction {
    private String TAG ="----BankWorkerActionImpl";
    @Override
    public void checkUserCredit() {
        Log.d(TAG, "查询用户信用");
    }

    @Override
    public void freezeUserAccount() {
        Log.d(TAG, "冻结用户账户");
    }

    @Override
    public void saveMoney(int money) {
        Log.d(TAG, "存钱");
    }

    @Override
    public float getMoney() {
        Log.d(TAG, "取钱");
        return 100.00f;
    }

    @Override
    public float loanMoney() {
        Log.d(TAG, "贷款");
        return 10000.0f;
    }
}
