package co.sosmascotas.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.sosmascotas.rest.entities.Account;
import co.sosmascotas.rest.repositories.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@RequestMapping(value = "/accounts", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Account> getAccounts() {
		return accountRepository.findAll();
	}
	
	@PostMapping
	public String create(@RequestBody Account account) {
		accountRepository.save(account);
		return "Success";
	}
	
}
