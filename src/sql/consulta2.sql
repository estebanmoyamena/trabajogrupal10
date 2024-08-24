SELECT
    g.nombre,
    COUNT(*) AS total_ordenes_cerradas
FROM
    Comandas c
        INNER JOIN Garzones g ON c.id_garzon = g.id_garzon
WHERE
    c.estado = true
GROUP BY
    g.nombre;