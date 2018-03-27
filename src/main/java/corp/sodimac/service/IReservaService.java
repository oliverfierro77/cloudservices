package corp.sodimac.service;

import java.util.List;
import corp.sodimac.service.Reserva;

public interface IReservaService {

     List<Reserva> getAllReservas();
     Reserva getReservaById(int reservaId);
     boolean addReserva(Reserva reserva);
     void updateReserva(Reserva reserva);
     void deleteReserva(int reservaId);

} 