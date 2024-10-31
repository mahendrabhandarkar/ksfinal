package com.ks.ksfinal.config;

import java.time.OffsetDateTime;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider", dateTimeProviderRef = "auditingDateTimeProvider")
public class AuditConfiguration {
    
        @Bean
        public AuditorAware<String> auditorProvider() {
            return new AuditorAwareImpl();
        }
        
        @Bean(name = "auditingDateTimeProvider")
        public DateTimeProvider dateTimeProvider() {
          return () -> Optional.of(OffsetDateTime.now());
        }
}
