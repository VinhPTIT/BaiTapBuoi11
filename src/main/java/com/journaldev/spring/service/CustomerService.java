package com.journaldev.spring.service;


import com.journaldev.spring.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CustomerService {
    private static ArrayList<Customer> customers = new ArrayList<Customer>();
    static {
        // Khoi tao du lieu
        customers.add(new Customer(1, "Nguyen Van A", 30 , "a@gmail.com"));
        customers.add(new Customer(2, "Nguyen Van B", 33 , "b@gmail.com"));
        customers.add(new Customer(3, "Nguyen Van C", 34 , "c@gmail.com"));
    }
    //them khach hang vao danh sach
    public Customer addCustomer(Customer customer){
        customer.setiId(customers.size()+1);
        customers.add(customer);
        return  customer;
    }
    // lay tat ca khach hang
    public ArrayList<Customer> getAllCustomers (){
        return customers;
    }

    // lay khach hang bang id
    public Customer retrieveCustomer(int customerId){
        for (Customer customer: customers){
            if(customer.getiId()==customerId){
                return customer;
            }
        }
        return null;
    }

    // xoa tai khoan khach hang
    public boolean deleteCustomerById (int id) {
        return customers.removeIf(t -> t.getiId()== id);
    }
}
