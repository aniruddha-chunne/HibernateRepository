package com.hibernate.Repository;

import com.hibernate.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
}
