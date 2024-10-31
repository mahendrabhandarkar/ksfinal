package com.ks.ksfinal.repository.cms;

import com.ks.ksfinal.model.cms.PageImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Test User
 */
@Repository
public interface PageImageRepository extends JpaRepository<PageImage, Long> {


    public Optional<PageImage> getByIdentity(String identity);

}
