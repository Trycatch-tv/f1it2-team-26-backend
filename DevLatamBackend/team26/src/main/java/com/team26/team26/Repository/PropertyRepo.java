package com.team26.team26.Repository;

import com.team26.team26.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PropertyRepo extends JpaRepository<Property, Integer> {
}
