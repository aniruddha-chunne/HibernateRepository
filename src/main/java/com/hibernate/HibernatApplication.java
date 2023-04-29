package com.hibernate;

import com.hibernate.Repository.CustomerRepository;
import com.hibernate.Repository.ItemRepository;
import com.hibernate.entity.Customer;
import com.hibernate.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernatApplication implements CommandLineRunner
{


	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernatApplication.class, args);
		System.out.println("Hibernate Mapping Project");

	}

	@Override
	public void run(String... args) throws Exception
	{

		Customer customer = new Customer("Tom");

		Item item1 = new Item("Item1");

		customer.setItem(item1);

		customerRepository.save(customer);









	}
}
