package com.picpay.bankapi.repositories;

import com.picpay.bankapi.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> existsByCpfCnpjOrEmail(String cpfCnpj, String email);
}
