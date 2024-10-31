package com.ks.ksfinal.security;

import com.ks.ksfinal.config.JwtAuthenticationEntryPoint;
import com.ks.ksfinal.config.JwtRequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)
@Order(101)
public class WebSecurityConfiguration {
    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Autowired
    private JwtRequestFilter jwtRequestFilter;

    @Autowired
    private UserDetailsService jwtService;

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:8080")); // Set allowed origins
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS")); // Allowed HTTP methods
        configuration.setAllowCredentials(true); // Allow credentials (cookies, authorization headers)
        configuration.setAllowedHeaders(Arrays.asList("*")); // Allow all headers

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration); // Apply CORS settings to all endpoints
        return source;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
          //      .securityMatcher(request -> request.getSession().isNew())
          //      .anonymous(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorizationManagerRequestMatcherRegistry ->
                        authorizationManagerRequestMatcherRegistry.requestMatchers("/**").permitAll()
                                .requestMatchers("/h2-console").permitAll()
                                .requestMatchers("/h2-console/**").permitAll()
                                .requestMatchers("/login").permitAll()
                                .requestMatchers("/assets/**").permitAll()
                        //        .requestMatchers("/**").permitAll()
                                .anyRequest().authenticated()
                )
                .headers(headers -> headers
                        .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin)) // Allow H2 console in frames
                ;
        return httpSecurity.build();
    }

/*
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf
                    .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()) // Store CSRF token in cookies
                    .csrfTokenRequestHandler(new CsrfTokenRequestAttributeHandler())
                    .disable()
                ) // Disable CSRF for H2 console access
                .authorizeHttpRequests(authorize -> authorize
                                .requestMatchers("/").permitAll()
                        .requestMatchers("/h2-console/**").permitAll() // Allow H2 console access
                        .requestMatchers("/api/auth/**").permitAll() // Permit authentication endpoints
                                .requestMatchers("/login").permitAll()
                                .requestMatchers("/authenticate").permitAll()
                //        .authenticationEntryPoint(jwtAuthenticationEntryPoint) // Handle unauthorized requests
                //                .requestMatchers("/login").permitAll()
                        .anyRequest().authenticated() // All other requests need authentication
                )
                .formLogin(httpSecurityFormLoginConfigurer -> httpSecurityFormLoginConfigurer
                        .loginPage("/").permitAll()
                        .loginProcessingUrl("/").permitAll()
                )
                .exceptionHandling(exceptions -> exceptions
                        .authenticationEntryPoint(jwtAuthenticationEntryPoint)
                )
                .headers(headers -> headers
                        .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin)) // Allow H2 console in frames
        //        .and()
        //        .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
                ; // Add JWT filter before the default filter

        return http.build();
    }

 */
}
