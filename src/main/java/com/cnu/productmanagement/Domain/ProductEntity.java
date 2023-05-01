package com.cnu.projectmanagement.Domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;


    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "date_of_update")
    private Date dateOfUpdate;

    public ProductEntity() {
    }

    public ProductEntity(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.dateOfUpdate = new Date();
    }

    public ProductEntity(String productName, double productPrice, Date dateOfUpdate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.dateOfUpdate = new Date();
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Date getDateOfUpdate() {
        return dateOfUpdate;
    }

    public void setDateOfUpdate(Date dateOfUpdate) {
        this.dateOfUpdate = dateOfUpdate;
    }
}


