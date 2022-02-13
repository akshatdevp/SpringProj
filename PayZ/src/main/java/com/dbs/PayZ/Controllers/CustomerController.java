package com.dbs.PayZ.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
 
import com.dbs.PayZ.Entities.Customer;
import com.dbs.PayZ.Services.CustomerService;
import com.dbs.PayZ.util.Utility;



@RestController
@RequestMapping("customer")
public class CustomerController {
	private CustomerService custService;
	
	@Autowired
	public CustomerController(CustomerService cs)
	{
		this.custService = cs;
	}
	@GetMapping
	@ResponseBody
	public List<Customer> getCustomers() {
		return custService.getCustomers();
	}
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Customer> getCusomterById(@PathVariable Long id){
		System.out.println("/customer/id");
		Optional<Customer> customer = custService.getCustomerById(id);
		return Utility.fromOpt(customer);
		
	}

	// @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	// public Customer newCustomer(@RequestBody Customer cust)
	// {
	// 	//System.out.println(cust);
	// 	return custService.newCustomer(cust);
	// }
}
