package com.saltedfish.bankservicedemo.actions.interfaces;

public interface IBankWorkerAction extends INormalUserAction {
    //查询用户的信用
    void checkUserCredit();

    //冻结用户账户
    void freezeUserAccount();
}
