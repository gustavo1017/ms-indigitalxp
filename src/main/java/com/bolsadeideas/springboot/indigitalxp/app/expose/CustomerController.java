package com.bolsadeideas.springboot.indigitalxp.app.expose;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.indigitalxp.app.model.Customer;
import com.bolsadeideas.springboot.indigitalxp.app.service.CustomerService;

@RestController
@RequestMapping("api/customer")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CustomerController {
	
	 @Autowired
	 CustomerService customerService;

	    @GetMapping("/find/{dni}/email/{email}")
	    public ResponseEntity<List<Customer>> findAll(@PathVariable("dni") String dni, @PathVariable("email") String email){
	        return new ResponseEntity<List<Customer>>(customerService.findCustomerDniOrEmail(dni, email),
	                HttpStatus.OK);
	    }
	    
	    @GetMapping("/indicators")
	    public ResponseEntity<List<HashMap>> indicators(){
	        return new ResponseEntity<List<HashMap>>(customerService.indicator(),
	                HttpStatus.OK);
	    }
	    
	    @PostMapping("/create")
	    public ResponseEntity<Integer> create(@RequestBody Customer customer){
	        return new ResponseEntity<Integer>(customerService.create(customer),
	                HttpStatus.OK);
	    }

}
