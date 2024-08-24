package cl.praxis.pruebajavafinal.controller;

import cl.praxis.pruebajavafinal.service.impl.DetallesComandaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//import cl.praxis.pruebajavafinal.entity.DetallesComanda;
//import cl.praxis.pruebajavafinal.service.ICrudGenerico;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
@Controller("/detalle")
//
public class DetalleComandaController {

    @Autowired
    private DetallesComandaServiceImpl detallesComandaService;


}