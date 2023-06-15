package com.maryamt.JaversProject1.Repositories;

import com.maryamt.JaversProject1.Entities.Store;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@JaversSpringDataAuditable
public interface StoreRepository extends CrudRepository<Store, Integer> {
}