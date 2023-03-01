SELECT *FROM subproducto WHERE sub_prod_id IN
(SELECT sub_id FROM productos WHERE sub_prod_id IN 
(SELECT prod_cat_id FROM categorias WHERE cat_nombre LIKE 'w%'));