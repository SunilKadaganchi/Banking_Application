package com.bankApp.user_auth.serviceImpl;

import com.bankApp.user_auth.dto.BankUserResponseDto;
import com.bankApp.user_auth.dto.LoginRequestDto;
import com.bankApp.user_auth.mapper.BankUserResponseDtoMapper;
import com.bankApp.user_auth.model.BankUser;
import com.bankApp.user_auth.repo.BankUserRepo;
import com.bankApp.user_auth.service.BankUserservice;
import org.springframework.stereotype.Service;

@Service
public class BankUserServiceImpl implements BankUserservice {
    private BankUserRepo bankUserRepo;

    public BankUserServiceImpl(BankUserRepo bankUserRepo) {
        this.bankUserRepo = bankUserRepo;
    }

    @Override
    public BankUserResponseDto register(BankUser bankUser) {
        bankUser.setAcntNum(bankUser.getPhnNum());
        BankUser savedBankUser = bankUserRepo.save(bankUser);
        return BankUserResponseDtoMapper.convertEntityToDto(savedBankUser);
    }

    @Override
    public BankUserResponseDto login(LoginRequestDto loginRequestDto) {
        return null;
    }
}
