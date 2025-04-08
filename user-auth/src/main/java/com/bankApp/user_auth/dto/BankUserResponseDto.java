package com.bankApp.user_auth.dto;

public class BankUserResponseDto {

    private long id;
    private String name;
    private long acntNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAcntNum() {
        return acntNum;
    }

    public void setAcntNum(long acntNum) {
        this.acntNum = acntNum;
    }
}
