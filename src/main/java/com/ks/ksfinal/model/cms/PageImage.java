package com.ks.ksfinal.model.cms;

import lombok.Data;

import jakarta.persistence.*;

/**
 * @author Test User
 */

@Entity
@Data
@Table(name = "page_image")
public class PageImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Page page;

    @Column(name = "file_name")
    private String fileName;

    @Column(unique = true)
    private String identity;

    @Column
    private String path;
}
