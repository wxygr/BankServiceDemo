package com.saltedfish.bankservicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;

import androidx.annotation.Nullable;

import com.saltedfish.bankservicedemo.actions.impl.BankBossActionImpl;
import com.saltedfish.bankservicedemo.actions.impl.BankWorkerActionImpl;
import com.saltedfish.bankservicedemo.actions.impl.NormalUserActionImpl;

public class BankService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            if (Constants.ACTION_USER_NORMAL.equals(action)){
                return new  NormalUserActionImpl();
            }else if (Constants.ACTION_BANK_WORKER.equals(action)){
                return new BankWorkerActionImpl();
            }else if (Constants.ACTION_BANK_BOSS.equals(action)){
                return new BankBossActionImpl();
            }
        }

        return null;
    }
}
