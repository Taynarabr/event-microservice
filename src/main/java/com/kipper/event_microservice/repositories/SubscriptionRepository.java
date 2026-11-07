package com.kipper.event_microservice.repositories;

import com.kipper.event_microservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    
}
