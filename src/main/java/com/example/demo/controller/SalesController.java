package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SalesPerson;
import com.example.demo.service.SalesService;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "http://localhost:4200")
public class SalesController {

//    @Autowired
//    private SalesService salesService;
//
//    @PostMapping("/login")
//    public SalesPerson login(@RequestBody SalesPerson sp) {
//
//        return salesService.login(sp);
//    }

}
