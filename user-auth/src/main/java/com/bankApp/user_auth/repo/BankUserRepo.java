package com.bankApp.user_auth.repo;

import com.bankApp.user_auth.model.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankUserRepo extends JpaRepository<BankUser,Long> {
}
