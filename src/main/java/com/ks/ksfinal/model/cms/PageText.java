package com.ks.ksfinal.model.cms;

import lombok.Data;

import jakarta.persistence.*;

/**
 * @author Test User
 */

@Entity
@Data
@Table(name = "page_text")
public class PageText {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    @Column
    private String content;

    @Column(unique = true)
    private String identity;

    @ManyToOne
    private Page page;

    @Column
    @Enumerated(EnumType.STRING)
    private PageTextType type;

    public boolean isCKEditor() {
        return type != null && type.equals(PageTextType.CK_EDITOR);
    }

    public boolean isTextBox() {
        return type != null && type.equals(PageTextType.TEXT_BOX);
    }
}
