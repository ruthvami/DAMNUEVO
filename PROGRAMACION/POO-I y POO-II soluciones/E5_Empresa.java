/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e5_empresa;

/**
 *
 * @author angel
 */
public class E5_Empresa {

    public static void main(String[] args) {
        Empleat T1 = new Empleat("Joan", "12345678-Y", 2000, 44, 555145877, "Pinar 12F, Elx");
        Empleat T2 = new Empleat("Silvia", "4687564-W", 4500);
        Empleat T3 = new Empleat("Peric", "5587564-W", 1500);
        Empleat T4 = new Empleat("Vicenta", "5777564-W", 3333);

        Empresa ExplotaMen = new Empresa("ExplotaMen", "Q-234123-V", 555154575, "Infierno 666, Burgos");
        Empresa Glooboo = new Empresa("Glooboo", "Q-2232123-V", 555354575, "High Park 23, London");

        T1.mostrarTot();

        ExplotaMen.afegir(T1);
        ExplotaMen.afegir(T2);

        Glooboo.afegir(T3);
        Glooboo.afegir(T4);

        System.out.println("");
        System.out.println("*** INFO Completa treballadors de " + Glooboo.getNom());
        Glooboo.infoEmpleats();

        System.out.println("");
        System.out.println("/// INFO sous totals bruts/nets de " + ExplotaMen.getNom());
        System.out.println("- Total bruts: " + ExplotaMen.totalSousBruts());
        System.out.println("- Total nets: " + ExplotaMen.totalSousNets());

        System.out.println("");
        System.out.println("$$$$$ ESBORREM (1) de " + ExplotaMen.getNom() + " $$$$$$");
        System.out.println("*** INFO Completa treballadors de " + ExplotaMen.getNom());
        ExplotaMen.esborrar(1);
        ExplotaMen.infoEmpleats();

        System.out.println("");
        System.out.println("*** INFO sous dels treballadors de " + Glooboo.getNom());
        Glooboo.infoSous();

    }

}
