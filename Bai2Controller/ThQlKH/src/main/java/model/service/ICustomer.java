package model.service;

import model.entities.Customer;

import java.util.List;

public interface ICustomer {
    List<Customer> fillAll();

    void save(Customer customer);

    Customer findById(int id);

    void Update(int id, Customer customer);

    void remove(int id);
}
