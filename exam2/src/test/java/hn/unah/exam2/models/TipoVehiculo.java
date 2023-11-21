package hn.unah.exam2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@table=("tipovehiculo")
@Setters
@Getters
@AllArgsConstructor
@NoArgsConstructor
class TipoVehiculo {

    @Id
    @JoinColumn(name="idVehiculo", referencedColumnName="idVehiculo")
    private int idTipoVehiculo;
    
    @Column(name="descripcion")
    private char descripcion;
    
    @Column(name="precioXhora")
    private double precioXhora;
    
}
