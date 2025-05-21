package net.aya.customerservice.repository;

import net.aya.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource   //création automatique d'un web service qui permet d'accéder à toutes les méthodes qui se trouvent dans l'interface CR
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
