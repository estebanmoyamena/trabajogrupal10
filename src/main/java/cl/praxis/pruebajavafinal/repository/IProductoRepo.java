package cl.praxis.pruebajavafinal.repository;

import cl.praxis.pruebajavafinal.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepo extends JpaRepository<Producto, Integer> {
}
