package com.bellacore.buyconnect.dao;

import com.bellacore.buyconnect.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    public CustomerDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Customer> getCustomers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Customer>  customers = session.createQuery("from Customer").list();
        return customers;
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(int id) {

    }
}
