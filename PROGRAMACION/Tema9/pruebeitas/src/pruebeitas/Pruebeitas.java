/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebeitas;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Pruebeitas {
    //La funcion llenarTableroVacio se utiliza para llenar un tablero con las filas y las columnas vacias(-) asi como colocar sus indices de filas y columnas(A-J,0-9). 
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[][] tablero: hace referencia a un tablero.

    public static void llenarTableroVacio(char tablero[][]){
        
        int letra=65;
        int numero=48;
        for (int i = 1; i < tablero.length; i++) {
            tablero[0][i]=(char)numero;
            tablero[i][0]=(char)letra;
            
            for (int j = 1; j < tablero[i].length; j++) {
                tablero[i][j]='-';               
            } 
            letra++;
            numero++;
        }
    }
    
    //La funcion mostrarTablero se utiliza para enseñar el tablero por pantalla. 
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[][] tablero: hace referencia a un tablero.
    
    public static void mostrarTablero(char tablero[][]){
        
        System.out.print(" ");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]+" ");
            }  
            System.out.println("");
        }
    
    }
    
    //La funcion insertarLanchas se utiliza para introducir en el tablero oculto los lanchas. 
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua.
    //          -int lanchas: referrencia a cuantosBarcos[3], donde se guarda la cantidad de lanchas que hay en el tablero.
    
    public static void insertarLanchas(char tableroOrdenador[][],int lanchas){
        
        int ran1,ran2;
        
        for (int i = 0; i < lanchas ; i++) {
            
            ran1=(int)(Math.random()*10)+1;
            ran2=(int)(Math.random()*10)+1;
          
            if(tableroOrdenador[ran1][ran2]=='-'){
                tableroOrdenador[ran1][ran2]='L';
            }
        }
    }
    
    //La funcion insertarBarcos se utiliza para introducir en el tablero oculto los barcos. 
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua.
    //          -int barcos: referrencia a cuantosBarcos[3], donde se guarda la cantidad de barcos que hay en el tablero.
    public static void insertarBarcos(char tableroOrdenador[][],int barcos){
        
        int ran1,ran2;
        
        for (int i = 0; i < barcos ; i++) {
            
            ran1=(int)(Math.random()*10)+1;
            ran2=(int)(Math.random()*10)+1;
          
            
            while(ran2+2>9){
                ran2=(int)(Math.random()*10)+1;
            }
            
            
            if(tableroOrdenador[ran1][ran2]=='-'&& tableroOrdenador[ran1][ran2+1]=='-'&& tableroOrdenador[ran1][ran2]=='-'){
                
                tableroOrdenador[ran1][ran2]='B';
                tableroOrdenador[ran1][ran2+1]='B';
                tableroOrdenador[ran1][ran2+2]='B';
                
            }else
                i--;
            
        }
    }
    
    //La funcion insertarAcorazado se utiliza para introducir en el tablero oculto los acorazados. 
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua.
    //          -int acorazados: referrencia a cuantosBarcos[3], donde se guarda la cantidad de acorazados que hay en el tablero.
    public static void insertarAcorazado(char tableroOrdenador[][],int acorazado){
        
        int ran1,ran2;
        
        for (int i = 0; i < acorazado ; i++) {
            
            ran1=(int)(Math.random()*10)+1;
            ran2=(int)(Math.random()*10)+1;
          
            while(ran2+3>9){
                ran2=(int)(Math.random()*10)+1;
            }
            
            if(tableroOrdenador[ran1][ran2]=='-' && tableroOrdenador[ran1][ran2+1]=='-' && tableroOrdenador[ran1][ran2+2]=='-'&& tableroOrdenador[ran1][ran2+3]=='-'){
                
                tableroOrdenador[ran1][ran2]='Z';
                tableroOrdenador[ran1][ran2+1]='Z';
                tableroOrdenador[ran1][ran2+2]='Z';
                tableroOrdenador[ran1][ran2+3]='Z';
               
            }else
                i--;
            
        }
    }
    
    //La funcion insertarPortaviones se utiliza para introducir en el tablero oculto los portaviones. 
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua.
    //          -int portaviones: referrencia a cuantosBarcos[3], donde se guarda la cantidad de portaviones que hay en el tablero.
    public static void insertarPortaviones(char tableroOrdenador[][],int portaviones){
        
        int ran1,ran2;
        
        for (int i = 0; i < portaviones ; i++) {
            
            ran1=(int)(Math.random()*10)+1;
            ran2=(int)(Math.random()*10)+1;
          
            while(ran1+4>9){
                ran2=(int)(Math.random()*10)+1;
            }
            
            if(tableroOrdenador[ran1][ran2]=='-' && tableroOrdenador[ran1+1][ran2]=='-' && tableroOrdenador[ran1+2][ran2]=='-'&& tableroOrdenador[ran1+3][ran2]=='-'&& tableroOrdenador[ran1+4][ran2]=='-'){
                
                tableroOrdenador[ran1][ran2]='P';
                tableroOrdenador[ran1+1][ran2]='P';
                tableroOrdenador[ran1+2][ran2]='P';
                tableroOrdenador[ran1+3][ran2]='P';
                tableroOrdenador[ran1+4][ran2]='P';
               
            }else
                i--;
            
        }
    }
    
    //La funcion cordenadas se utiliza para guardar en el vector cordenadas[] las coordenadas a las que desea apuntar el jugador. 
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[] cordenadas: contiene las dos posiciones a las cuales apunta el jugador.
    //          -char[][] tableroJugador: hace referencia al tablero que se muestra por pantalla.
    public static void cordenadas(char cordenadas[],char tableroJugador[][]){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Columna: ");
        cordenadas[0]=in.next().charAt(0);
        System.out.println("Fila: ");
        cordenadas[1]=in.next().charAt(0);
        comprobarCordenadas(cordenadas,tableroJugador);
    }
    
    //La funcion comprobarCordenadas se utiliza para determinar si las coordenadas que ha introducido el jugador estan dentro del tablero y en la posicion correcta, de no ser asi coge unas nuevas coordenadas.
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -char[] cordenadas: contiene las dos posiciones a las cuales apunta el jugador.
    //          -char[][] tableroJugador: hace referencia al tablero que se muestra por pantalla.
    
    public static void comprobarCordenadas(char cordenadas[],char tableroJugador[][]){
        
        int bienCoor=0;
        
        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador.length; j++) {
                
                if(cordenadas[0]==tableroJugador[0][j]){
                bienCoor++;
                }
                
            }
        }
        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador.length; j++) {
                
                if(cordenadas[1]==tableroJugador[j][0]){
                bienCoor++;
                }
            }
        }
        if(bienCoor!=22){
            System.err.println("Las coordenadas introducidas se encuentran fuera de rango");
            cordenadas(cordenadas,tableroJugador);
        }
    }
    
    //La funcion disparar se utiliza para determinar si la posicion que ha indicado el jugador ha golpeado un barco o a caido agua.
    //  *Devuelve: int tocado: que se utiliza para ir restando a la variable barcos, de esta manera saber que se ha golpeado un barco.
    //  *Valores de entrada:
    //          -char[] cordenadas: contiene las dos posiciones a las cuales apunta el jugador
    //          -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua.
    //          -char[][] tableroJugador: hace referencia al tablero que se muestra por pantalla .
    
    public static int disparar(char cordenadas[],char tableroJugador[][],char tableroOrdenador[][]){
        
        int tocado=0;
        
        int cordenadasN[]=new int[]{0,0};
        
        String filas= "ABCDEFGHIJLMNOPQRSTUVWXYZ";
        String columnas= "0123456789";
        
        cordenadasN[1]=filas.lastIndexOf(cordenadas[1])+1;
        
        cordenadasN[0]=columnas.lastIndexOf(cordenadas[0])+1;
        
        if(tableroOrdenador[cordenadasN[1]][cordenadasN[0]]=='-'){
            
            tableroJugador[cordenadasN[1]][cordenadasN[0]]='A';
            
            agua();
           
        }else if(tableroOrdenador[cordenadasN[1]][cordenadasN[0]]!='-'){
            
            tableroJugador[cordenadasN[1]][cordenadasN[0]]='X';
            
            tocado();          
            
            tocado=1;
        }
        return tocado;
    }
    //La funcion agua se utiliza para mostrar un mensaje informando que no hemos golpeado un barco.
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -No hay valores de entrada
    public static void agua(){
        System.out.println("------");
        System.out.println("|AGUA|");
        System.out.println("------");
    }
    //La funcion tocado se utiliza para mostrar un mensaje informando que hemos golpeado un barco.
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada:
    //          -No hay valores de entrada
    public static void tocado(){
        System.out.println("--------");
        System.out.println("|TOCADO|");
        System.out.println("--------");
    }
    //La funcion win se utiliza para finalizar el juego, habiendo ganado.
    //  *Devuelve: int tiros-1, para asi finalizar el bucle de juego.
    //  *Valores de entrada:
    //          -int tiros: cantidad hasta la que se repetira el bucle for de juego
    public static int win(int tiros){
    
        return tiros-1;
        
    }
    //La funcion calcularBarcos se utiliza para determinar cuantas casillas ocupan los barcos que hay en el tablero.
    //  *Devuelve: int cantidad de barcos que hay.
    //  *Valores de entrada:
    //          -int[] cuantosBarcos: Referencia a la array que guarda cuantos barcos de cada tipo, hay en cada posicion.
    public static int calcularBarcos(int cuantosBarcos[]){
        
        int barcos=0;
        
        barcos+=cuantosBarcos[0];
        
        barcos+=cuantosBarcos[1]*3;
        
        barcos+=cuantosBarcos[2]*4;
        
        barcos+=cuantosBarcos[3]*5;
    
        return barcos;
    }
    
    
    //La funcion jugar se utiliza para mostrar todo el proceso de juego, llamando a las funciones que necesita para ir mostrando el tablero y disparando.
    //  *Devuelve: No devuelve nada
    //  *Valores de entrada:
    //          -char[][] tableroJugador: hace referencia al tablero que se muestra por pantalla .
    //          -int[] cuantosBarcos: Referencia a la array que guarda cuantos barcos hay en cada posicion.
    //          -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua. 
    //          -int tiros: referencia a el entero que guarda la cantidad de tiros el cual dispone para tumbar todos los barcos.
    
    public static void jugar(char tableroJugador[][],char tableroOrdenador[][],int cuantosBarcos[],int tiros){
        
        char cordenadas[]=new char[2];
       
        int barcos;
        
        barcos=calcularBarcos(cuantosBarcos);
        
        //mostrarTablero(tableroOrdenador);        // <--Descomentar para ver el tablero del ordenador(soluciones)
        
        System.out.println("\nEn el modo facil hay un total de 5 lanchas, 3 barcos, 1 acorazado y 1 portaviones y dispones de 50 tiros. \n\nEn el modo medio hay un total de 2 lanchas, 1 barco, 1 acorazado y 1 portaviones y dispones de 30 tiros. \n\nEn el modo dificil hay un total de 1 lancha, 1 barco, 0 acorazados y 0 portaviones y dispones de 10 tiros.\n");
        
        for (int i = 0; i < tiros; i++) {           
            System.out.println("Te quedan "+(tiros-i)+" tiros.");
            mostrarTablero(tableroJugador);
            cordenadas(cordenadas,tableroJugador);
            barcos-=disparar(cordenadas,tableroJugador,tableroOrdenador);
            if(quedanBarcos(barcos)!=true){
                i=win(tiros);
                System.out.println("""
                                   -----------------------
                                   |Molt be!!!Has guanyat|
                                   -----------------------
                                   """);
            }
        }
        conclusion(tableroOrdenador,barcos);
        
    }
    
    //La funcion conclusion se utiliza para mostraar la parte final del juego, cuando este acaba, ya sea con una victoria o con una derrota.
    //  *Devuelve: No devuelve nada
    //  *Valores de entrada:
    //          -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua. 
    //          -int barcos: referencia a el entero que guarda la cantidad de casillas que ocupan los barcos que hay en el tablero.
    //
    public static void conclusion(char tableroOrdenador[][],int barcos){
        
        if(quedanBarcos(barcos)){
            System.out.print("""
                               -----------------------------------------------------------------------
                               |No has conseguido tumbar todos los barcos antes de quedarte sin tiros|
                               -----------------------------------------------------------------------
                               """);
            System.out.println("""
                               -----------
                               |GAME OVER|
                               ----------
                               """);
        }
        System.out.println("El tablero esta dispuesto de esta manera");        
        mostrarTablero(tableroOrdenador);
    
    }
    
    //La funcion quedanBarcos sirve para saber si todavia quedan barcos en el tablero.
    //  *Devuelve: boolean verdadero/falso
    //  *Valores de entrada:
    //        -int barcos: referencia a el entero que guarda la cantidad de casillas que ocupan los barcos que hay en el tablero.
    //              
    public static boolean quedanBarcos(int barcos){
        
        
            return barcos!=0;
    }
    
    //La funcion seleccionarDificultad sirve para elegir la dificultad en la cual se va a jugar, guardando la cantidad de barcos en la array cuantosBarcos, que en cada posicion se guarda el numero de barcos de cada tipo.
    //  *Devuelve: int cantidad de tiros que se dispone
    //  *Valores de entrada:
    //        -int[] cuantosBarcos: Referencia a la array que guarda cuantos barcos de cada tipo, hay en cada posicion.
    
    public static int seleccionarDificultad(int[] cuantosBarcos){
        
        Scanner in=new Scanner(System.in);
        
        int dificultad,tiros=0;
    
        System.out.println("Selecciona la dificultad: \n 1.Facil \n 2.Medio\n 3.Dificil");
        
        dificultad=in.nextInt();
        
        switch (dificultad) {
            case 1 -> { cuantosBarcos[0]=5;
                        cuantosBarcos[1]=5;
                        cuantosBarcos[2]=1;
                        cuantosBarcos[3]=1;
                        tiros=50;
                        return tiros;
             }
            case 2 -> { cuantosBarcos[0]=2;
                        cuantosBarcos[1]=1;
                        cuantosBarcos[2]=1;
                        cuantosBarcos[3]=1;
                        tiros=30;
                        return tiros;
            }
            case 3 -> { cuantosBarcos[0]=1;
                        cuantosBarcos[1]=1;
                        cuantosBarcos[2]=0;
                        cuantosBarcos[3]=0;
                        tiros=10;
                        return tiros;
             }
    }   return tiros;
    }
    
    
    //La funcion iniciar sirve para inicializar los tableros, como asi insertar los barcos y seleccionar la dificultad.
    //  *Devuelve: No devuelve nada.
    //  *Valores de entrada: 
    //      -char[][] tableroJugador: hace referencia al tablero que se muestra por pantalla .
    //      -char[][] tableroOrdenador: hace referencia al tablero que se guarda las posiciones de los barcos asi como donde hay agua. 
    
    public static void iniciar(char tableroJugador[][],char tableroOrdenador[][]){
        
        int cuantosBarcos[]=new int[4];
        
        int tiros;
        
        llenarTableroVacio(tableroJugador);
        llenarTableroVacio(tableroOrdenador);
        tiros=seleccionarDificultad(cuantosBarcos);
        insertarLanchas(tableroOrdenador,cuantosBarcos[0]);
        insertarBarcos(tableroOrdenador,cuantosBarcos[1]);
        insertarAcorazado(tableroOrdenador,cuantosBarcos[2]);
        insertarPortaviones(tableroOrdenador,cuantosBarcos[3]);   
        jugar(tableroJugador,tableroOrdenador,cuantosBarcos,tiros);
        
    }
    public static void main(String[] args) {
        char tableroJugador[][]=new char[11][11];
        char tableroOrdenador[][]=new char[11][11];
        
        iniciar(tableroJugador,tableroOrdenador);
    }
}