package com.ganesh.dbtdata;

/*
 * @created: 28/02/2021 - 8:40 AM
 * @author: Ganesh
 */


import com.ganesh.model.Employee;
import com.ganesh.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class DBOperationRunner implements CommandLineRunner {

    private final EmployeeRepository eRepo;

    @Override
    public void run(String... args) throws Exception {
        eRepo.saveAll(Arrays.asList(new Employee(1001,"James",2599.5,"HR"),
                new Employee(1002,"Elizabeth",2999.0,"Admin"),
                new Employee(1003,"Robert",2699.5,"Testing"),
                new Employee(1004,"Victoria",3000.5,"Development"),
                new Employee(1005,"David",2650.5,"QA"),
                new Employee(1006,"Isabel",2590.0,"Support"),
                new Employee(1007,"Michael",3599.75,"Development"),
                new Employee(1008,"Maria",2499.0,"Finance"),
                new Employee(1009,"Thomas",2799.25,"HR"),
                new Employee(1010,"Maria",2899.5,"Development"))

        );
        System.out.println("----------All Employee Data saved into Database---------------");
    }
}
