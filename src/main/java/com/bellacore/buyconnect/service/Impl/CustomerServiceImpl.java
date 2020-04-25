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

    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Override
    public Customer getCustomer(Long customerId) {
        return null;
    }

    @Override
    public void saveCustomer() {

    }

    @Override
    public void updateCustomer() {

    }

    @Override
    public void deleteCustomer() {

    }
}
