package com.hibernate.Repository;

import com.hibernate.entity.Customer;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{


}
