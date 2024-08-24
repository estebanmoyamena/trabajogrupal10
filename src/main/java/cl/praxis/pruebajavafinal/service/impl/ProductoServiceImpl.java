package cl.praxis.pruebajavafinal.service.impl;

import cl.praxis.pruebajavafinal.entity.Producto;
import cl.praxis.pruebajavafinal.repository.IProductoRepo;
import cl.praxis.pruebajavafinal.service.ICrudGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ICrudGenerico<Producto> {

    @Autowired
    IProductoRepo productoRepo;

    @Override
    public List<Producto> listar() {
        return List.of();
    }

    @Override
    public Producto buscarPorId(int id) {
        return null;
    }

    @Override
    public Producto crear(Producto producto) {
        return null;
    }

    @Override
    public Producto actualizar(Producto producto) {
        return null;
    }

    @Override
    public void remover(int id) {

    }
}
