package apirestspringboot.apirestspringboot.repositories;

import apirestspringboot.apirestspringboot.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public class PersonRepository extends JpaRepository<Person, Long> {  
      
}
