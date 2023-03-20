SELECT cli.codigo_cliente,cli.nombre_cliente,cli.domicilio_cliente,cli.foto_carnet
FROM cliente AS cli
JOIN factura AS fac ON fac.codigo_cliente=cli.codigo_cliente
JOIN detalle_factura AS dfac ON dfac.cod_articulo=fac.nro_factura
JOIN vendedor AS ven ON fac.codigo_vendedor=ven.cod_vendedor
JOIN articulo AS art ON dfac.cod_articulo=art.cod_articulo;
