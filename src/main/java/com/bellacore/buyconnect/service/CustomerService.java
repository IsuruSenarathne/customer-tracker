package com.bellacore.buyconnect.service;


import com.bellacore.buyconnect.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    Customer getCustomer(Long customerId);

    void saveCustomer();

    void updateCustomer();

    void deleteCustomer();

}
