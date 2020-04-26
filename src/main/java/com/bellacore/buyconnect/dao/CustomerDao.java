package com.bellacore.buyconnect.dao;

import com.bellacore.buyconnect.entity.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getCustomers();

    public Customer getCustomer(int id) ;

    public void addCustomer(Customer customer);

    public void updateCustomer(Customer customer, int customerId) ;

    public void deleteCustomer(int customerId) ;
}
