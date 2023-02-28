package com.lashoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lashoo.dto.OrderRequest;
import com.lashoo.model.Customer;
import com.lashoo.repository.CustomerRepository;
import com.lashoo.repository.ProductRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Customer> addProduct(@RequestBody OrderRequest orderRequest){
		customerRepository.save(orderRequest.getCustomer());
		return ResponseEntity.ok(customerRepository.save(orderRequest.getCustomer()));    /// NOt sure?????
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
		
	}

}
