package com.ks.ksfinal.repository.cms;

import com.ks.ksfinal.model.cms.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Test User
 */
@Repository
public interface PageRepository extends JpaRepository<Page, Long> {

    public Optional<Page> getByUrl(String url);

    public List<Page> findByParentPage(Page parentPage);
}
