package com.example.dev.springbootdev.repository;

import com.example.dev.springbootdev.model.Accounts;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountsRepository extends PagingAndSortingRepository<Accounts, Long> {
}
