package com.example.dev.springbootdev.service;

import com.example.dev.springbootdev.model.Accounts;
import com.example.dev.springbootdev.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    public void add(Accounts acc) throws Exception{
        accountsRepository.save(acc);
    }

    public void edit(Accounts acc) throws Exception{
        accountsRepository.save(acc);
    }

    public List<Accounts> getAll(){
        return (List<Accounts>) accountsRepository.findAll();
    }

    public Optional<Accounts> getById(Long id){
        Optional<Accounts> optional = accountsRepository.findById(id);
        return optional.stream().findFirst();
    }

    public void deleteAll()throws Exception{
        accountsRepository.deleteAll();
    }

    public void deleteById(Long id)throws Exception{
        accountsRepository.deleteById(id);
    }
}
