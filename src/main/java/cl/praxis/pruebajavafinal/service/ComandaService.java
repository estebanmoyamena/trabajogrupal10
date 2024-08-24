package cl.praxis.pruebajavafinal.service;

import cl.praxis.pruebajavafinal.entity.Comanda;

import java.util.List;

public interface ComandaService {
    List<Comanda> listar();
    Comanda obtenerPorId(Integer id);
    Comanda guardar(Comanda comanda);
    void eliminar(Integer id);

}