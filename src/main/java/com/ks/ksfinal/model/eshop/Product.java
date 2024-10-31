package com.ks.ksfinal.model.eshop;

import com.ks.ksfinal.model.cms.PageImage;
import lombok.Data;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Test User
 */
@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Double price;

    @Column
    private String title;

}
