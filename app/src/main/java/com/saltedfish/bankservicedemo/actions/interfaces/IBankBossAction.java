package com.saltedfish.bankservicedemo.actions.interfaces;

public interface IBankBossAction extends IBankWorkerAction {
    //修改用户账户金额
    void modifyAccountMoney(int money);
}
