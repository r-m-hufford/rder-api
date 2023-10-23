package com.rmhufford.rder.repo;

import com.rmhufford.rder.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
