package com.ks.ksfinal.model.cms;

import lombok.Data;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Test User
 */

@Entity
@Data
@Table(name = "page")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column(unique = true)
    private String url;

    @OneToMany(mappedBy = "page")
    private List<PageText> pageTexts = new ArrayList<>();

    @OneToMany(mappedBy = "page")
    private List<PageImage> pageImages = new ArrayList<>();

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="parent_page_id")
    private Page parentPage;

    @OneToMany(mappedBy = "parentPage")
    private List<Page> subPages;
}