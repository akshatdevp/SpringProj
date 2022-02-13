package com.dbs.PayZ.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.PayZ.Entities.Customer;
import com.dbs.PayZ.Repositories.CustomerRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private CustomerRepository customerRepo;
    
    @Autowired
    public CustomerService(CustomerRepository cr)
    {
    	this.customerRepo = cr;
    }
    
    public List<Customer> getCustomers(){
    	List<Customer> ls = customerRepo.findAll();
        List<String> lc = ls.stream().map(x -> x.toString()).collect(Collectors.toList());
        System.out.println(lc);
    	return ls;
    }
    public Optional<Customer> getCustomerById(Long id){
        return customerRepo.findById(id);
      
    }    
    // public Customer newCustomer(Customer customer){
    //     return customerRepo.save(customer);
    // }
    // public void insertCustomer(String Id) {
    // 	customerRepo.saveAll(List.of(new Customer(Id)));
    	
    // }
}
