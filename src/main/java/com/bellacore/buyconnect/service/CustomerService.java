package com.bellacore.buyconnect.service;


import com.bellacore.buyconnect.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    Customer getCustomer(int customerId);

    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer, int customerId);

    void deleteCustomer(int customerId);

}
