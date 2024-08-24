package cl.praxis.pruebajavafinal.repository;

import cl.praxis.pruebajavafinal.entity.DetallesComanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDetallesComandaRepo extends JpaRepository<DetallesComanda, Integer> {
}
