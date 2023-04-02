Ruth Vacas Miñana
a)
for $b in //baile
where $b
return 
    <els_balls>
       {data($b/nombre)}     
    </els_balls>
b)
for $b in //baile
where $b
return 
    <els_balls>
       {data($b/nombre)}({data($b/plazas)})     
    </els_balls>
c)
for $b in //baile
where $b/precio>30
return 
    <els_balls>
       {data($b/nombre)}   
    </els_balls>
d)
for $b in //baile
where $b/precio>30 and $b/precio/@moneda="euro"
return 
    <els_balls>
       {data($b/nombre)}   
    </els_balls>
e)
for $b in //baile
where contains($b/comienzo, "/1/")
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
let $s := /bailes/baile[profesor = $b]/sala
order by $b
return <profesor nombre="{$b}">{data($s)}</profesor>
h)
let $b :=/bailes/baile
let $p := sum($b/precio)
let $n := count($b)
return <media>{$p div $n}</media>
i)
let $b := /bailes/baile
return <suma>{sum($b[sala = 1]/precio)}</suma>
j)
let $b := /bailes/baile
return <plazas>{count($b[profesor = "Jesús Lozano"]/plazas)}</plazas>
k)
let $b := /bailes/baile
return <plazas>{sum($b[profesor = "Laura Mendiola"]/precio)*{sum($b/plazas)}}</plazas>
l)
let $b := /bailes/baile
return <plazas>{sum($b[profesor = "Jesús Lozano"]/precio)*{sum($b/plazas)}}</plazas>
m)
for $b in //baile[profesor[contains(., 'Laura')]]
where $b/plazas = 15
return <guanyaria>{data($b/precio) * $b/plazas}</guanyaria>
n)

