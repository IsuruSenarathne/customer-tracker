package com.bellacore.buyconnect.service;


import com.bellacore.buyconnect.dao.CustomerDao;
import com.bellacore.buyconnect.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("customerService")
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerDao.getCustomer(id);
    }

    @Transactional
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Transactional
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);

    }

    @Transactional
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }
}
