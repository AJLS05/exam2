package hn.unah.exam2;

import hn.unah.exam2.models.Cliente;

public interface VehiculoService {
    Vehiculo crearVehiculo(Vehiculo nvoVehiculo);
    
    Vehiculo obtenerTodosVehiculos();

    Vehiculo obtenerVehiculo(int idVehiculo)
}

