SELECT
    c.id_comanda,
    c.fecha_emision
FROM
    Comandas c
        LEFT JOIN Detalles_Comandas dc ON c.id_comanda = dc.id_comanda
WHERE
    dc.id_comanda IS NULL;