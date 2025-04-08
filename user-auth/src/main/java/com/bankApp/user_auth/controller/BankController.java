package com.bankApp.user_auth.controller;

import com.bankApp.user_auth.dto.BankUserResponseDto;
import com.bankApp.user_auth.dto.LoginRequestDto;
import com.bankApp.user_auth.model.BankUser;
import com.bankApp.user_auth.service.BankUserservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-auth")
public class BankController {

    private BankUserservice bankUserservice;

    public BankController(BankUserservice bankUserservice) {
        this.bankUserservice = bankUserservice;
    }

    @PostMapping("/register")
    public ResponseEntity<BankUserResponseDto> register(@RequestBody BankUser bankUser){
        return ResponseEntity.ok(bankUserservice.register(bankUser));
    }

    @PostMapping("/login")
    public BankUserResponseDto register(@RequestBody LoginRequestDto loginRequestDto){
        return null;
    }
}
