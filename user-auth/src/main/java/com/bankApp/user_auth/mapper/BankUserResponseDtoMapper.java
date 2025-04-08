package com.bankApp.user_auth.mapper;

import com.bankApp.user_auth.dto.BankUserResponseDto;
import com.bankApp.user_auth.model.BankUser;

public class BankUserResponseDtoMapper {

    public static BankUserResponseDto convertEntityToDto(BankUser bankUser){
        BankUserResponseDto bankUserResponseDto = new BankUserResponseDto();
        bankUserResponseDto.setId(bankUser.getId());
        bankUserResponseDto.setName(bankUser.getName());
        bankUserResponseDto.setAcntNum(bankUser.getAcntNum());

        return bankUserResponseDto;
    }
}
