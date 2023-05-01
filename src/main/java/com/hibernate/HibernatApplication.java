package com.hibernate;

import com.hibernate.Repository.CustomerRepository;
import com.hibernate.Repository.ItemRepository;
import com.hibernate.Repository.StudentAddressRepository;
import com.hibernate.Repository.StudentRepository;
import com.hibernate.entity.Address;
import com.hibernate.entity.Student;
import com.hibernate.entity.StudentAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class HibernatApplication implements CommandLineRunner
{

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentAddressRepository studentAddressRepository;

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

//		Customer customer = new Customer("Tom");
//
//		Item item1 = new Item("Item1");
//		Item item2 = new Item("Item2");
//
//		customer.getItem().add(item1);
//		customer.getItem().add(item2);
//
//		customerRepository.save(customer);


//		Student student = new Student(12, "Aniruddha", "Software Engineer", );

//		Student student = new Student();
//		student.setStudentId(1210);
//		student.setAbout("Software engineer_10");
//		student.setStudentName("Aniruddha_10");
//
//		laptop laptop = new laptop();
//		laptop.setBrand("Lenovo_10");
//		laptop.setModelNumber("T430_10");
//		laptop.setLaptop(10);
////		laptop.setStudent(student);
//
//		student.setLaptop(laptop);
//		Student save = studentRepository.save(student);

//		Student student = studentRepository.findById(12).get();
//
//		System.out.println(student.getLaptop().getBrand());




//		One to many

		StudentAddress studentAddress = new StudentAddress();

		studentAddress.setId(301);
		studentAddress.setName("OnetoMamy");
		studentAddress.setAbout("checking relation");

		Address address = new Address(351, "501", "nagpur", "india");
		Address address2 = new Address(352, "502", "nagpur2", "india2");

		studentAddress.getAddressList().add(address);
		studentAddress.getAddressList().add(address2);

		address.setStudentAddress(studentAddress);
		address2.setStudentAddress(studentAddress);

		studentAddressRepository.save(studentAddress);


	}
}
