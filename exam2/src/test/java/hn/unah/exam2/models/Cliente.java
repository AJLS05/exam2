package hn.unah.exam2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@table=("cliente")
@Setters
@Getters
@AllArgsConstructor
@NoArgsConstructor
class entityClassName Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(name="nombre")
    private char nombre

    @Column(name="apellido")
    private char apellido

    @Column(name="fechaingreso")
    private Date fechaingreso
    
    @ManyToOne
    JoinColumn(name="idCliente", referencedColumnName="idCliente")
    private int idTipoCliente
}