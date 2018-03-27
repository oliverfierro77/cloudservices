package corp.sodimac.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import corp.sodimac.service.IReservaDAO;
import corp.sodimac.service.Reserva;

@Service
public class ReservaService implements IReservaService {
    
    @Autowired
	private IReservaDAO reservaDAO;
    
    @Override
	public Reserva getReservaById(int reservaId) {
		Reserva obj = reservaDAO.getReservaById(reservaId);
		return obj;
	}	
    
    //@Override
	public List<Reserva> getAllReservas(){
		return reservaDAO.getAllReservas();
	}
    
    @Override
	public synchronized boolean addReserva(Reserva reserva){
                if (reservaDAO.reservaExists(reserva.getNumReserva())) {
    	            return false;
                } else {
    	            reservaDAO.addReserva(reserva);
    	            return true;
                }
	}
    
    @Override
	public void updateReserva(Reserva reserva) {
		reservaDAO.updateReserva(reserva);
	}
    
    @Override
	public void deleteReserva(int reservaId) {
		reservaDAO.deleteReserva(reservaId);
	}
}