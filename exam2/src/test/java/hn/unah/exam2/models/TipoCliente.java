package hn.unah.exam2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Entity
@table=("tipocliente")
@Setters
@Getters
@AllArgsConstructor
@NoArgsConstructor
class idTipoCliente {

    @Id
    JoinColumn(name="Cliente", referencedColumnName = "Cliente")
    private int idTipoCliente;

    @Column(name="marca")
    private char descripcion; 


}