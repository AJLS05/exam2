package hn.unah.exam2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@table=("reserva")
@Setters
@Getters
@AllArgsConstructor
@NoArgsConstructor
class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReseva;

    @Foreign Key
    JoinColumn(name="Cliente", referencedColumnName = "Cliente")
    private int idCliente;

    @Foreign Key
    @JoinColumn(name="idVehiculo", referencedColumnName="idVehiculo")
    private int idVehiculo;

    @Column(name="fehca")
    private Date fecha;

    @Column(name="dias")
    private int dias;

    @Column(name="total")
    private double total;
}