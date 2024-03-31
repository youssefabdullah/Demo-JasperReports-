package com.example.demoJasperReports.controller;

import com.example.demoJasperReports.model.Employee;
import com.example.demoJasperReports.repository.EmployeeRepository;
import com.example.demoJasperReports.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private ReportService service;

    @GetMapping("/api")
    public String employees() throws JRException, FileNotFoundException {
        return service.exportReport("pdf");
    }
}
