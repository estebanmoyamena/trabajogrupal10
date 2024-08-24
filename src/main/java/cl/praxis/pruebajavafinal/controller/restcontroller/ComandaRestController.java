//package cl.praxis.pruebajavafinal.controller.restcontroller;
//
//import cl.praxis.pruebajavafinal.entity.Comanda;
//import cl.praxis.pruebajavafinal.service.ComandaService;
//import cl.praxis.pruebajavafinal.service.ICrudGenerico;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/comandas")
//public class ComandaRestController {
//
//    private ICrudGenerico<Comanda> crudGenerico ;
//
//    public ComandaRestController(ICrudGenerico<Comanda> crudGenerico) {
//        this.crudGenerico = crudGenerico;}
//
//    @GetMapping("")
//    public List<Comanda> listar() {return crudGenerico.listar();}
//
//
//    @Autowired
//    private ComandaService crudGenerico;
//
//    @GetMapping
//    public List<Comanda> listaComandas() {
//        return comandaService.listar();
//    }
//
//    @GetMapping("/{id}")
//    public obtenerComanda (@PathVariable ("id") int id) {
//        return comandaService.obtenerPorId(id);
//    }

