package com.springreact.dolplads.springreact.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by dolplads on 07/06/2017.
 * <p>
 * Runs after all beans created and registered
 */
@Component
public class EmployeeLoader implements CommandLineRunner {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Employee e = new Employee("thomas", "dolplads", "cool dude");
        Employee e1 = new Employee("frodo", "baggins", "low dude");
        Employee e2 = new Employee("tony", "hawk", "skate dude");

        repository.save(e);
        repository.save(e1);
        repository.save(e2);
    }
}
