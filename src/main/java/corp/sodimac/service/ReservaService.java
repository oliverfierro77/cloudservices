package corp.sodimac.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import corp.sodimac.dao.IReservaDAO;
import corp.sodimac.entity.Reserva;

@Service
public class ReservaService implements IReservaService {
    
    @Autowired
	private IReservaDAO reservaDAO;
    
    //@Override
	public Reserva getReservaById(int reservaId) {
		Reserva obj = reservaDAO.getReservaById(reservaId);
		return obj;
	}	
    
    //@Override
	public List<Reserva> getAllReservas(int page, int max){
		return reservaDAO.getAllReservas(page, max);
	}
	
    //@Override
	public synchronized boolean addReserva(Reserva reserva){
                if (reservaDAO.reservaExists(reserva.getNumReserva())) {
    	            return false;
                } else {
    	            reservaDAO.addReserva(reserva);
    	            return true;
                }
	}
    
    //@Override
	public void updateReserva(Reserva reserva) {
		reservaDAO.updateReserva(reserva);
	}
    
    //@Override
	public void deleteReserva(int reservaId) {
		reservaDAO.deleteReserva(reservaId);
	}

	//@Override
	public boolean reservaExists(int numReserva){
		return reservaDAO.reservaExists(numReserva);
	}

}