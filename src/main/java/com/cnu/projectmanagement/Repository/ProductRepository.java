package com.cnu.projectmanagement.Repository;

import com.cnu.projectmanagement.Domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {




    /*@Autowired
    ProductRepository productEntityRepository;

    ProductEntity productEntity = new ProductEntity();

    productEntity.setProductName("ProductEntity A");
    productEntity.setProductPrice(10.0);
    productEntity.setDateOfUpdate(new Date());
    productEntityRepository.save(productEntity);

    ProductEntity existingProduct = productEntityRepository.findById(1L).orElse(null);
    if (existingProduct != null) {
            existingProduct.setProductPrice(20.0);
            existingProduct.setDateOfUpdate(new Date());
            productEntityRepository.save(existingProduct);
    }

    productEntityRepository.deleteById(1L);*/


}

