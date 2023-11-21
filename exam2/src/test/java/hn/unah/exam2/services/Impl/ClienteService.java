package hn.unah.exam2;

import hn.unah.exam2.models.Cliente;

public interface ClienteService {
    Cliente crearCliente(Cliente nvoCliente);

    Cliente obtenerTodosClientes();

    Cliente obtenerCliente(int idCliente)

}