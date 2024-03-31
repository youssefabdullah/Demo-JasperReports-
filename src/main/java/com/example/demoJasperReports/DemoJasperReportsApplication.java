package com.example.demoJasperReports;

import com.example.demoJasperReports.model.Employee;
import com.example.demoJasperReports.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoJasperReportsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJasperReportsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee employee = new Employee();
            employee.setDesignation("gg");
            employee.setName("Youssef");
            employee.setSalary(1500.0);
            employee.setDoj(new Date());
            System.out.println(employee);
            repository.save(employee);

        };
    }
}
