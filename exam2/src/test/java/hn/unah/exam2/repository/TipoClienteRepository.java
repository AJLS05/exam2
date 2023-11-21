package hn.unah.exam2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hn.unah.exam2.models.TipoCliente;

@Repository
public interface TipoClienteRepository extends JpaRepository<TipoCliente, string>{}
