package net.aya.customerservice;

import net.aya.customerservice.entities.Customer;
import net.aya.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);
    }


    @Bean
        //méthode qui s'execute au démarrage
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            Customer customer = Customer.builder()
                    .name("Aya")
                    .email("Aya@gmail.com")
                    .build();
            customerRepository.save(customer);
            customerRepository.save(Customer.builder()
                    .name("Safia")
                    .email("safia@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Mehdi")
                    .email("mehdi@gmail.com")
                    .build());
            customerRepository.findAll().forEach(c -> {
                System.out.println(c.getName());
            });
        };
    }
}

