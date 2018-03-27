package corp.sodimac.service;

import java.util.List;
import corp.sodimac.service.Reserva;

public interface IReservaDAO {

    List<Reserva> getAllReservas();
    Reserva getReservaById(int reservaId);
    void addReserva(Reserva reserva);
    void updateReserva(Reserva article);
    void deleteReserva(int reservaId);
    boolean reservaExists(long numReserva);

} 