package com.maryamt.JaversProject1.Service;

import com.maryamt.JaversProject1.Entities.Store;

import java.util.List;

public interface StoreService {
    Store createStore(Store store);

    Store getStoreById(Integer store_id);

    List<Store> getAllStores();

    Store updateStore(Store store);

    void deleteStore(Integer store_id);
}
