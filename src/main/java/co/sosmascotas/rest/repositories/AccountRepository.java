package co.sosmascotas.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import co.sosmascotas.rest.entities.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
