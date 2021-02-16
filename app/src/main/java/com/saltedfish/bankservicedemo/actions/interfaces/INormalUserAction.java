package com.saltedfish.bankservicedemo.actions.interfaces;

public interface INormalUserAction {
    //存钱
    void saveMoney(int money);

    //取钱
    float getMoney();

    //贷款
    float loanMoney();
}
