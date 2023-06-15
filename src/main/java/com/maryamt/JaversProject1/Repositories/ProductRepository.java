package com.maryamt.JaversProject1.Repositories;

import com.maryamt.JaversProject1.Entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}