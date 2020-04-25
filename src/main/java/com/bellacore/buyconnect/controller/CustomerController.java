package com.bellacore.buyconnect.controller;

import com.bellacore.buyconnect.model.Customer;
import com.bellacore.buyconnect.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String getTest(HttpServletRequest request, Model model){
        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }
}
