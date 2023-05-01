package com.hibernate.Repository;

import com.hibernate.entity.Customer;
import com.hibernate.entity.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAddressRepository extends JpaRepository<StudentAddress, Integer>
{
}
