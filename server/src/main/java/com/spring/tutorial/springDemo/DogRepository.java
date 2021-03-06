package com.spring.tutorial.springDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DogRepository extends JpaRepository<Dog, Long>{
}
