package com.bankApp.user_auth.service;

import com.bankApp.user_auth.dto.BankUserResponseDto;
import com.bankApp.user_auth.dto.LoginRequestDto;
import com.bankApp.user_auth.model.BankUser;

public interface BankUserservice {
    public BankUserResponseDto register(BankUser bankUser);
    public BankUserResponseDto login(LoginRequestDto loginRequestDto);

}
