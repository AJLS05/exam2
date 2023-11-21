    package unah.hn.exam2;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Optional;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    
    import hn.unah.exam2.services.impl.Cliente;
    
    @RestController
    @RequestMapping("/Reserva")
    class ReservaController {
        @PostMapping()
        public Reserva<Reserva> create(@RequestBody nvo Reserva) {
            try {
                Reserva savedItem = repository.save(item);
                return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
            }
        }
    }