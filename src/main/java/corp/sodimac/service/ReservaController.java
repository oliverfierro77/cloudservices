package corp.sodimac.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import corp.sodimac.service.Reserva;
import corp.sodimac.service.IReservaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/")
public class ReservaController {
    
    @Autowired
	private IReservaService reservaService;

	@GetMapping("reserva/{id}")
	public ResponseEntity<Reserva> getReservaById(@PathVariable("id") Integer id) {
		Reserva reserva = reservaService.getReservaById(id);
		return new ResponseEntity<Reserva>(reserva, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Lista de reservas", response = Iterable.class)
	@GetMapping(path = "reservas", produces = "application/json")
	public ResponseEntity<List<Reserva>> getAllReservas() {
		List<Reserva> list = reservaService.getAllReservas();
		return new ResponseEntity<List<Reserva>>(list, HttpStatus.OK);
	}
    
    @PostMapping("reserva")
	public ResponseEntity<Void> addReserva(@RequestBody Reserva reserva, UriComponentsBuilder builder) {
                boolean flag = reservaService.addReserva(reserva);
                if (flag == false) {
        	    return new ResponseEntity<Void>(HttpStatus.CONFLICT);
                }
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/reserva/{id}").buildAndExpand(reserva.getNumReserva()).toUri());
                return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
    
    @PutMapping("reserva")
	public ResponseEntity<Reserva> updateArticle(@RequestBody Reserva reserva) {
		reservaService.updateReserva(reserva);
		return new ResponseEntity<Reserva>(reserva, HttpStatus.OK);
	}
    
    @DeleteMapping("reserva/{id}")
	public ResponseEntity<Void> deleteReserva(@PathVariable("id") Integer id) {
		reservaService.deleteReserva(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    	
}  