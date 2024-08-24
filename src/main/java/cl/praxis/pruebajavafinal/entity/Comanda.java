package cl.praxis.pruebajavafinal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "comandas", schema = "trattoria")
public class Comanda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comanda", nullable = false)
    private int id;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;

    @Column(name = "estado", nullable = false)
    private Boolean estado = false;

}