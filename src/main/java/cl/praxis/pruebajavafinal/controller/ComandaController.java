package cl.praxis.pruebajavafinal.controller;

import cl.praxis.pruebajavafinal.entity.Comanda;
import cl.praxis.pruebajavafinal.entity.DetallesComanda;
import cl.praxis.pruebajavafinal.service.ICrudGenerico;
import cl.praxis.pruebajavafinal.service.impl.ComandaServiceImpl;
import cl.praxis.pruebajavafinal.service.impl.DetallesComandaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("/")

public class ComandaController {

    @Autowired
    private ComandaServiceImpl comandaService;
    @Autowired
    private DetallesComandaServiceImpl detalsComandaService;

    @GetMapping()
    public String listar(Model model) {
        List<Comanda> comandas = comandaService.listar();
        model.addAttribute("comandas", comandas);
        return "index";
    }

    @GetMapping("/{id}")
    public String detallecomanda(@PathVariable("id") int id, Model model) {
        DetallesComanda detallesComanda = detalsComandaService.buscarPorId(id);
        if (detallesComanda == null) {
            return "redirect:/";
        }
        model.addAttribute("detalleComanda", detallesComanda);
        return "detalle_comanda";
    }

}