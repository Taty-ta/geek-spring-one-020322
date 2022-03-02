package ru.geekbrains.persist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ProductRepository {
    private final Map<Long, Product> prodMap = new ConcurrentHashMap<>();

    private final AtomicLong identity = new AtomicLong(0);

    public List<Product> findAll() {
        return new ArrayList<>(prodMap.values());
    }

    public Product findById(long id) {
        return prodMap.get(id);
    }

    public void insert( Product product) {
        long id = identity.incrementAndGet();
        product.setId(id);
        prodMap.put(id, product);
    }

    public void update(Product product) {
        prodMap.put(product.getId(), product);
    }

    public void delete(long id) {
        prodMap.remove(id);
    }

}
