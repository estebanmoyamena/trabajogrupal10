package cl.praxis.pruebajavafinal.repository;

import cl.praxis.pruebajavafinal.entity.Comanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComandaRepo extends JpaRepository<Comanda, Integer> {
}
