package cl.praxis.pruebajavafinal.service.impl;

import cl.praxis.pruebajavafinal.entity.DetallesComanda;
import cl.praxis.pruebajavafinal.repository.IDetallesComandaRepo;
import cl.praxis.pruebajavafinal.service.ICrudGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallesComandaServiceImpl implements ICrudGenerico<DetallesComanda> {
    @Autowired
    IDetallesComandaRepo detallesComandaRepo;

    @Override
    public List<DetallesComanda> listar() {
        return List.of();
    }

    @Override
    public DetallesComanda buscarPorId(int id) {
        return detallesComandaRepo.findById(id).orElse(null);
    }

    @Override
    public DetallesComanda crear(DetallesComanda detallesComanda) {
        return null;
    }

    @Override
    public DetallesComanda actualizar(DetallesComanda detallesComanda) {
        return null;
    }

    @Override
    public void remover(int id) {

    }
}
