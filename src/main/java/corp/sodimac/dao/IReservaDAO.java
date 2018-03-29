package corp.sodimac.dao;

import java.util.List;
import corp.sodimac.entity.Reserva;

public interface IReservaDAO {

    List<Reserva> getAllReservas(int page, int max);
    //List<Reserva> getAllReservasLimit(int limit);
    Reserva getReservaById(int reservaId);
    void addReserva(Reserva reserva);
    void updateReserva(Reserva article);
    void deleteReserva(int reservaId);
    boolean reservaExists(int numReserva);

} 