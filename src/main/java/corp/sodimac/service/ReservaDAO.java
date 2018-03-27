package corp.sodimac.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import corp.sodimac.service.Reserva;

@Transactional
@Repository
public class ReservaDAO implements IReservaDAO {

	@PersistenceContext	
	private EntityManager entityManager;	
	//@Override
	public Reserva getReservaById(int reservaId) {
		return entityManager.find(Reserva.class, reservaId);
	}
    
    @SuppressWarnings("unchecked")
	//@Override
	public List<Reserva> getAllReservas() {
		String hql = "FROM Reserva";
		return (List<Reserva>) entityManager.createQuery(hql).getResultList();
	}	
    
    @Override
	public void addReserva(Reserva reserva) {
		entityManager.persist(reserva);
	}
    
    @Override
	public void updateReserva(Reserva reserva) {
		Reserva artcl = getReservaById(reserva.getNumReserva());
		artcl.setNumReserva(reserva.getNumReserva());
		entityManager.flush();
	}
    
    @Override
	public void deleteReserva(int reservaId) {
		entityManager.remove(getReservaById(reservaId));
	}
    
    @Override
	public boolean reservaExists(long numReserva) {
		String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, numReserva).getResultList().size();
		return count > 0 ? true : false;
    }
    
} 