package com.bellacore.buyconnect.service.Impl;


import com.bellacore.buyconnect.dao.CustomerDao;
import com.bellacore.buyconnect.entity.Customer;
import com.bellacore.buyconnect.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Override
    @Transactional
    public Customer getCustomer(int customerId) {
        return customerDao.getCustomer(customerId);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer, int customerId) {
        customerDao.updateCustomer(customer, customerId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int customerId) {
        customerDao.deleteCustomer(customerId);
    }
}
