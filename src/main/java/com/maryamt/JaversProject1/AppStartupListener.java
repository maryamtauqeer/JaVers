package com.maryamt.JaversProject1;

import com.maryamt.JaversProject1.Entities.Product;
import com.maryamt.JaversProject1.Entities.Store;
import com.maryamt.JaversProject1.Repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupListener {

    @Autowired
    private StoreRepository storeRepository;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        Store store = new Store();
        store.setName("Maryam's Store woo");
        for (int i = 1; i < 3; i++) {
            Product product = new Product();
            product.setName("Prod "+i);
            product.setPrice(15);
            product.setStore(store);
            store.addProduct(product);
        }
        storeRepository.save(store);
    }
}
