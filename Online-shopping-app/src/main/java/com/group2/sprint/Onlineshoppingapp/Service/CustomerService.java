package com.group2.sprint.Onlineshoppingapp.Service;

import com.group2.sprint.Onlineshoppingapp.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public Customer addCustomer(Customer cust);
    public Customer updateCustomer(Customer cust);
    public void removeCustomer(Customer cust);
    public Customer viewCustomer(Customer cust);
    public List<Customer> viewAllCustomers(String location);
}
