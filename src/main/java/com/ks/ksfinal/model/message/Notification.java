package com.ks.ksfinal.model.message;

import lombok.Data;

import jakarta.persistence.*;

/**
 * @author Test User
 */

@Entity
@Data
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String message;

    @Column
    @Enumerated(EnumType.STRING)
    private NotificationStatus status;

    /**
     * @return true if status of notification is read
     */
    public boolean isRead() {
        return status.equals(NotificationStatus.READ);
    }
}