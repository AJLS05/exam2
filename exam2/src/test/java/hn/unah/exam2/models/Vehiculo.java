package hn.unah.exam2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@table=("vehiculo")
@Setters
@Getters
@AllArgsConstructor
@NoArgsConstructor
class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    @Column(name="marca")
    private char marca;

    @Column(name="anio")
    private int anio;

    @Column(name="disponible")
    private boolean disponible;

    @ManyToOne
    @Foreign Key
    JoinColumn(name="idVehiculo", referencedColumnName="idVehiculo")
    private int idTipoVehiculo;
}