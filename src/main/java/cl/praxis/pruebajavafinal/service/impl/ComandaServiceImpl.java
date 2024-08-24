package cl.praxis.pruebajavafinal.service.impl;

import cl.praxis.pruebajavafinal.entity.Comanda;
import cl.praxis.pruebajavafinal.repository.IComandaRepo;
import cl.praxis.pruebajavafinal.service.ICrudGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Service;
import java.util.List;


@Service

public class ComandaServiceImpl implements ICrudGenerico<Comanda> {
    @Autowired

    private IComandaRepo comandaRepo;

    @Override
    public List<Comanda> listar() {
     List<Comanda> comandas = comandaRepo.findAll();
        return comandas;
    }

    @Override
    public Comanda buscarPorId(int id) {
        Comanda comanda = comandaRepo.findById(id).orElse(null);
        return comanda;
    }

    @Override
    public Comanda crear(Comanda comanda) {
        return comandaRepo.save(comanda)    ;
    }

    @Override
    public Comanda actualizar(Comanda comanda) {
        return comandaRepo.save(comanda);
    }

    @Override
    public void remover(int id) {
        comandaRepo.deleteById(id);

    }




}
