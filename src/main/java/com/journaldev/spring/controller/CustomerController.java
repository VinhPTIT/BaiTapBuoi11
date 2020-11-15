package com.journaldev.spring.controller;

//import java.util.ArrayList;
//import com.in28minutes.springboot.model.Customer;
//import com.in28minutes.springboot.model.CustomerDelete;
//import com.in28minutes.springboot.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;

import com.journaldev.spring.model.Customer;
import com.journaldev.spring.model.CustomerDelete;
import com.journaldev.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //Dua ra khach hang duoc tao ra
    @PostMapping("customers/create")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
    // Lay danh sach khach hang
    @GetMapping("customers/list")
    public ArrayList<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
    }
    // lay khach hang theo id (1,2,3)
    @GetMapping("customer/{cusId}")
    public Customer getCustomerById(@PathVariable int cusId) {
        return customerService.retrieveCustomer(cusId);
    }
    // xoa khach hang theo id
    @GetMapping("customer/delete/{cusId}")
    public CustomerDelete deleteCustomerById(@PathVariable int cusId) {
        CustomerDelete customerDelete = new CustomerDelete();
        customerDelete.setSuccess(customerService.deleteCustomerById(cusId));
        return customerDelete;
    }
}

