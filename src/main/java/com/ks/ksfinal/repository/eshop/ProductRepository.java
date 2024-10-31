package com.ks.ksfinal.repository.eshop;

import com.ks.ksfinal.model.eshop.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Test User
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public Product getById(Long productId);

}
