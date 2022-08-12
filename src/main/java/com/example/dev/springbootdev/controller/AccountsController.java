package com.example.dev.springbootdev.controller;

import com.example.dev.springbootdev.model.Accounts;
import com.example.dev.springbootdev.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @GetMapping("/getAll")
    public List<Accounts> getAll() {
        return accountsService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<Accounts> getById(@PathVariable Long id) {
        return accountsService.getById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@Valid @RequestBody Accounts accounts) throws Exception {
        accountsService.add(accounts);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<Object> edit(@Valid @RequestBody Accounts accounts) throws Exception {
        accountsService.edit(accounts);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Object> deleteAll() throws Exception {
        accountsService.deleteAll();
        return ResponseEntity.ok("Deleted Successfully");
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) throws Exception {
        accountsService.deleteById(id);
        return ResponseEntity.ok("Deleted By Id Successfully");
    }
}
