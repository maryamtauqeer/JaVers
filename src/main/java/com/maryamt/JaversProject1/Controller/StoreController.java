package com.maryamt.JaversProject1.Controller;

import com.maryamt.JaversProject1.Entities.Store;
import com.maryamt.JaversProject1.Service.StoreService;
import lombok.AllArgsConstructor;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {
    Javers javers = JaversBuilder.javers().build();
    @Autowired
    private StoreService storeService;
    @GetMapping("/stores/snapshots")
    public String getStoresSnapshots() {
        QueryBuilder jqlQuery = QueryBuilder.byClass(Store.class);
        List<CdoSnapshot> snapshots = javers.findSnapshots(jqlQuery.build());
        return javers.getJsonConverter().toJson(snapshots);
    }

    @PostMapping("/stores")
    public ResponseEntity<Store> createStore(@RequestBody Store store){
        Store savedstore = storeService.createStore(store);
        return new ResponseEntity<>(savedstore, HttpStatus.CREATED);
    }
}