package com.group2.sprint.Onlineshoppingapp.Service;

import com.group2.sprint.Onlineshoppingapp.Model.Customer;
import com.group2.sprint.Onlineshoppingapp.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer cust) {
        customerRepository.save(cust);
        return cust;
    }

    @Override
    public Customer updateCustomer(Customer cust) {
        Customer cust1 = null;
        Optional<Customer> optionalCustomer = customerRepository.findById(cust.getCustomerId());
        if (optionalCustomer.isPresent())
            cust1 = optionalCustomer.get();

        cust1.setFirstName(cust.getFirstName());
        cust1.setLastName(cust.getLastName());
        cust1.setEmail(cust.getEmail());
        cust1.setAddress(cust.getAddress());
        cust1.setMobile(cust.getMobile());

       customerRepository.save(cust1);
       return cust1;
    }

    @Override
    public void removeCustomer(Customer cust) {
        customerRepository.deleteById(cust.getCustomerId());

    }

    @Override
    public Customer viewCustomer(Customer cust) {
        Customer customer = null;
        Optional<Customer> optionalCustomer = customerRepository.findById(cust.getCustomerId());
        if (optionalCustomer.isPresent())
            customer = optionalCustomer.get();

        return customer;
    }

    @Override
    public List<Customer> viewAllCustomers(String location) {
        System.out.println("CustomerRepository Child Class Created By Spring Boot: " + customerRepository.getClass().getName());
        return customerRepository.findAll();
    }
}
