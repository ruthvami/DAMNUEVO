Ruth Vacas Miñana
a)
for $b in //baile
return 
    <els_balls>
       {data($b/nombre)}     
    </els_balls>
b)
for $b in //baile
where $b
return 
    <els_balls>
       {data($b/nombre/text())}({$b/plazas/text()})     
    </els_balls>
c)
for $b in //baile
where $b/precio>30
return 
    <els_balls>
       {data($b/nombre/text())}({$b/plazas/text()})     
    </els_balls>
d)
for $b in //baile
where $b/precio>30 and $b/precio/@moneda="euro"
return 
    <els_balls>
       {data($b/nombre/text())}({$b/plazas/text()})     
    </els_balls>
e)
for $b in //baile
where contains($b/comienzo, "/01/")
return <els_balls>
           <nombre>{data($b/nombre)}</nombre>
           <comienzo>{data($b/comienzo)}</comienzo>
       </els_balls>
f)
for $b in //baile
order by $b/sala
return <els_balls>
           <profesor>{data($b/profesor)}</profesor>
           <sala>{data($b/sala)}</sala>
       </els_balls>
g)
for $b in distinct-values(/bailes/baile/profesor)
let $s := //baile[profesor = $b]/sala
order by $b
return <els_balls> 
<profesor nombre="{$b}">{data($s)}</profesor></els_balls>
h)
let $b :=//baile
return <media>{avg($b/precio)}</media>
i)
let $b := //baile[sala="1"]
return <suma>{sum($b/plazas)}</suma>
j)
let $b := //baile[profesor="Jesús Lozano"]
return <plazas>{sum($b/plazas)}</plazas>
k)
let $b := //baile[profesor="Laura Mendiola"]
return <beneficio>{$b/plazas*$b/precio}</beneficio>
l)
for $b in //baile[profesor = "Jesús Lozano"]
return <plazas>{$b/precio*$b/plazas}</plazas>
m)
for $b in //baile[profesor[contains(., 'Laura')]]
return <guanyaria>{$b/precio*$b/plazas}</guanyaria>
n)
for $b in //baile
order by $b/nombre
return
<guanyaria>{$b/nombre,$b/precio/text()} ({$b/precio*0.85})</guanyaria>
o)
for $n in //baile
return <beneficio>{$n/* except $n/comienzo except $n/fin}</beneficio>
p)
<html>
<body>
<h1>NOMBRE I PROFESOR</h1>
<table border="1">
<tr><th>Nom</th><th>Profesor</th></tr>
{
for $n in //baile
return <tr><td>{$n/nombre/text()}</td><td>{$n/profesor/text()}</td></tr>}</table></body></html>
