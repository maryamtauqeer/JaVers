package com.maryamt.JaversProject1.Service;

import com.maryamt.JaversProject1.Entities.Store;
import com.maryamt.JaversProject1.Repositories.StoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StoreServiceImpl implements StoreService{

    @Autowired
    StoreRepository storeRepository;
    @Override
    public Store createStore(Store store) {
        Store savedStore= storeRepository.save(store);
        return savedStore;
    }

    @Override
    public Store getStoreById(Integer store_id) {
        return null;
    }

    @Override
    public List<Store> getAllStores() {
        return null;
    }

    @Override
    public Store updateStore(Store store) {
        return null;
    }

    @Override
    public void deleteStore(Integer store_id) {

    }
}
