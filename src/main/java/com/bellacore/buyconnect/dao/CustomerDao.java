package com.bellacore.buyconnect.dao;

import com.bellacore.buyconnect.model.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getCustomers();

    public Customer getCustomer(int id) ;

    public Customer addCustomer(Customer customer);

    public void updateCustomer(Customer customer) ;

    public void deleteCustomer(int id) ;
}
