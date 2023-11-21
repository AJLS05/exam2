package hn.unah.exam2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hn.unah.exam2.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{
    
}

