1-
for $b in doc("llibres.xml")//libro
where $b
return $b/titulo
2-
let $b in doc("llibres.xml")//libro
where $b
return $b/titulo
3-
for $l in doc("llibres.xml")//libro
let $t = $l/titulo
let $a = $l/autor
return
    <llibre>
        <titol>{ $t }</titol>
        <autors>{ $a }</autors>
    </llibre>
4-
for $l in //libro
let $t = $l/titulo
let $a = $l/autor
let $p = //prestamos/entrada[titulo=$t]
where $p
order by $p/prestamo/inicio
return
  <libro>
    {$t}
    {$a}
    {$p/prestamo/inicio}
    {$p/prestamo/devolucion}
  </libro>
5-
for $l in /biblioteca/libros/libro
return 
    <llibre>
        <titol>{data($l/titulo)}</titol>
        <autor1>{data($l/autor[1]/nombre/text())} {data($l/autor[1]/apellido/text())}</autor1>
        <autor2>
            {
                if (count($l/autor) > 1)
                then "cia"
                else ()
            }
        </autor2>
    </llibre>
6-
for $n in doc("balls.xml")//baile/nombre
return <nom_balls>{$n}</nom_balls>
7-
for $b in doc("balls.xml")//baile
where $b
return 
    <baile>
        <nombre>{data($b/nombre)} </nombre>
        <precio>{data($b/precio)}</precio>      
    </baile>
8-
for $b in //baile
where $b/precio>40
return 
    <baile>
        <nombre>{data($b/nombre)} </nombre>
        <precio>{data($b/precio)}</precio>      
    </baile>
9-
for $b in doc("balls.xml")//baile
where $b
order by $b
return 
    <baile>{$b}
    </baile>
10-
for $b in doc("balls.xml")//baile
where matches($b/nombre,"a")
return 
    <baile>$b/nombre}</baile>
11-
for $b in doc("balls.xml") //baile
where matches($b/profesor,"Lozano")
return $b/nombre
12-
for $b in doc("balls.xml")//baile
where $b/@id!=3 and $b/@id!=5
return $b/nombre
13-
for $b in //baile
where $b/precio/@cuota="mensual"
return $b/profesor
14-
for $b in //baile
where $b/precio/@moneda="euro" and $b/sala=1 and $b/precio < 35
return $b/nombre
15-
for $b in //libro
return $b/titulo
16-
for $b in //libro
order by $b/@anyo
return 
    <libro>
        {$b/titulo,<año>($b/anyo)</año>}
    </libro>
17-
for $b in //libro
order by $b/precio=65.95
return $b
18-
for $b in //libro
order by $b/@anyo<2000
return $b
19-
for $b in //libro
order by $b/@anyo>1992 and $b/@b/editorial="Addison-Wesley"
return <llibre any="{$b/@anyo}">{$b/titulo}</llibre>
20-
for $b in //libro
where count($b/autor)>1
return <llibre any="{$b/@anyo}">{$b/titulo}</llibre>
21-
for $b in //libro
where empty($b/autor)
return <llibre any="{$b/@anyo}">{$b/titulo}</llibre>
22-
for $b in distinct-values(//libro/autor/apellido)
order by $b
return $b
23-
let $n:=//libro
return <result>{$n/titulo,<autores>{$n/autor}</autores>}</result>
24-
for $n in//libro
return <llibre>{$n/titulo,<autores>{count($n/autor)}</autores>}</llibre>
25-
<html>
<body>
<h1>LLISTAT LLIBRES</h1>
<table border ="1">
<tr><th>TITOL</th><th>EDITORIAL</th><th>PREU</th></tr>
{for $n in//libro
return <tr><td>{data($n/titulo)}</td><td>{data($n/editorial)}</td><td>{data($n/precio)}</td></tr>
}
</table>
</body>
</html>
26-

