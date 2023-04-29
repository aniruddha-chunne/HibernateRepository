package com.hibernate.Repository;

import com.hibernate.entity.Item;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>
{

}
