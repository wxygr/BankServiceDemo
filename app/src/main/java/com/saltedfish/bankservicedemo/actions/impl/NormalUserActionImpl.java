package com.saltedfish.bankservicedemo.actions.impl;

import android.os.Binder;
import android.util.Log;

import com.saltedfish.bankservicedemo.actions.interfaces.INormalUserAction;

public class NormalUserActionImpl extends Binder implements INormalUserAction {

    private String TAG ="----NormalUserActionImpl";

    @Override
    public void saveMoney(int money) {
        Log.d(TAG, "存钱---->"+money);
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
