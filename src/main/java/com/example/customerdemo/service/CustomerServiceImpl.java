package com.example.customerdemo.service;

import com.example.customerdemo.model.Customer;
import com.example.customerdemo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of {@link CustomerService} interface.
 */

//@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        LOGGER.info("In CustomerServiceImpl getById {}", id);
//        log.info("In CustomerServiceImpl getById {}", id);
        return customerRepository.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        LOGGER.info("In CustomerServiceImpl save {}", customer);
//        log.info("In CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        LOGGER.info("In CustomerServiceImpl deleteById {}", id);
//        log.info("In CustomerServiceImpl deleteById {}", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        LOGGER.info("In CustomerServiceImpl getAll");
//        log.info("In CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }

}

