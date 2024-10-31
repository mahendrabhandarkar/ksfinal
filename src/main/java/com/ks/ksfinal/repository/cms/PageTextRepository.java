package com.ks.ksfinal.repository.cms;

import com.ks.ksfinal.model.cms.PageText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Test User
 */
@Repository
public interface PageTextRepository extends JpaRepository<PageText, Long> {

    public Optional<PageText> findByIdentity(String identity);

}
