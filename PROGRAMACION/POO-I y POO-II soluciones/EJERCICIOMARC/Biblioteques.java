package biblioteques;

import java.util.ArrayList;

public class Biblioteques {

    public static void main(String[] args) {
//        1. Crea una biblioteca i elements, almenys dos llibres i dos DVD.
        Biblioteca b1 = new Biblioteca("Biblio 1", "Gandia");
        Llibre l1 = new Llibre("Cronicas 1",454646646,"Bromera");
        Llibre l2 = new Llibre("Cronicas 2",454646646,"Bromera");
        DVD d1 = new DVD("Sin noticias",3,"video");
        DVD d2 = new DVD("Sin noticias 2",5,"hola");
//        2. Afegir tots els elements a la biblioteca i mostrar-la.
        b1.afegirElements(l1,l2,d1,d2);
        b1.mostrarTots();
//        3. Crear una altra biblioteca de diferent ciutat ja amb elements i mostrar-la.
        ArrayList<Element> e = new ArrayList<>();
        e.add(new Llibre("Cronicas 3",5456,"Bromera"));
        e.add(new DVD("Sin noticias 3",2,"audio"));
        Biblioteca b2 = new Biblioteca("Biblio 2", "Oliva",e);
        b2.mostrarTots();
        System.out.println("");
//        4. Moure elements d’una biblioteca a l’altra i mostrar-les.
        b1.canviarElements(b2, l2, d2);
        b1.mostrarTots();
        b2.mostrarTots();
        System.out.println("");
//        5. Crear usuaris, mínim dos, i prestar elements.
        Usuari u1 = new Usuari("Marc","Gandia");
        Usuari u2 = new Usuari("Marc 2","Oliva");
        l1.prestar(u2);
        l1.prestar(u1);
        l1.tornar();
        l1.prestar(u1);
        d1.prestar(u2);
        d2.prestar(u1);
        System.out.println("");
//        6. Mostrar les dos biblioteques sols els elements disponibles.
        b1.mostrarDisponibles();
        b2.mostrarDisponibles();
//        7. Eliminar elements y mostrar el nombre total d’usuaris registrat.
        b2.eliminarElements(0,3);
        System.out.println("\n"+Usuari.numUsuaris());
    }

}
    //Marc Martínez Sanchis