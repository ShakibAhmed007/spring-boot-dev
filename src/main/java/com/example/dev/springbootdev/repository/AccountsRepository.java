package com.example.dev.springbootdev.repository;

import com.example.dev.springbootdev.model.Accounts;
import org.springframework.data.repository.CrudRepository;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {
}
