package corp.sodimac.service;

import java.util.List;
import corp.sodimac.entity.Reserva;

public interface IReservaService {

     List<Reserva> getAllReservas(int page, int max);
     //List<Reserva> getAllReservasLimit(int limit);
     Reserva getReservaById(int reservaId);
     boolean addReserva(Reserva reserva);
     void updateReserva(Reserva reserva);
     void deleteReserva(int reservaId);
     boolean reservaExists(int numReserva);

} 