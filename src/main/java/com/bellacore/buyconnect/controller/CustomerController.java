package com.bellacore.buyconnect.controller;

import com.bellacore.buyconnect.dto.CustomerDto;
import com.bellacore.buyconnect.entity.Customer;
import com.bellacore.buyconnect.service.CustomerService;
import com.bellacore.buyconnect.service.Impl.CustomerServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ModelMapper modelMapper;

    private CustomerDto convertToDto(Customer customer) {
        CustomerDto customerDto = modelMapper.map(customer, CustomerDto.class);
//        -- do some modification before sending data to client --
//        customer.setSubmissionDate(post.getSubmissionDate(),
//                userService.getCurrentUser().getPreference().getTimezone());
        return customerDto;
    }

    private Customer convertToEntity(CustomerDto customerDto) {
        Customer customer = modelMapper.map(customerDto, Customer.class);
//         -- do something before data persist on DB -- https://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application
//        customer.setSubmissionDate(postDto.getSubmissionDateConverted(
//                userService.getCurrentUser().getPreference().getTimezone()));
        return customer;
    }

    @GetMapping("/")
    public String getTest(HttpServletRequest request, Model model){
        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @GetMapping("/{customerId}")
    public String getTest(@PathVariable("customerId") Long customerId, Model model){
        Customer customer = customerService.getCustomer(customerId);
        CustomerDto customerDto = convertToDto(customer);
        model.addAttribute("customer", customerDto);
        return "customer";
    }
}
