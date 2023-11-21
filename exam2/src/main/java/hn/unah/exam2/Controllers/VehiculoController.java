package unah.hn.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.exam2.services.impl.Cliente;

@RestController
@RequestMapping("/Vehiculo")
class VehiculoController {

    @Autowired
    VehiculoRepository vehiculoRepository;
    
    @GetMapping("/obtenerTodosVehiculos")
    public Vehiculo<List<Vehiculos>> getAll() {
        try {
            List<Vehiculos> items = new ArrayList<Vehiculos>();

            vehiculoRepository.findAll().forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("obtenerVehiculo/{id}")
    public ResponseEntity<Vehiculo> getById(@PathVariable("id") int id) {
        Optional<Vehiculo> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("crearVehiculo/")
    public Vehiculo<Vehiculo> create(@RequestBody Vehiculo item) {
        try {
            Vehiculo savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}