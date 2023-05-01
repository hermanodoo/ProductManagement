/*
package com.cnu.projectmanagement.Repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MapRepository implements ProductRepository {

    Map<Long, String> database = new HashMap<Long, String>();
    Long id = 1L;

    @Override
    public String addByName(String productName) {
        database.put(id, productName);
        return database.get(id++);
    }

    @Override
    public String findById(Long productId) {
        return database.get(productId);
    }

    @Override
    public HashMap<Long, String> updateWithIdAndName(Long productId, String newProductName) {
        if (database.containsKey(productId)) {
            database.put(productId, newProductName);
        }
        HashMap<Long, String> idToProductNameMap = new HashMap<Long, String>();
        idToProductNameMap.put(productId, newProductName);
        return idToProductNameMap;
    }

    @Override
    public String deleteById(Long productId) {
        return database.remove(productId);
    }
}


*/
