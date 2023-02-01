/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barquitos;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class Barquitos {

    

    static final int BOARD_SIZE = 10;
    static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initBoard();
        placeShips();
        playGame();
    }

    public static void initBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void placeShips() {
        System.out.println("Coloque sus barcos en el tablero (Ejemplo: A 0)");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa la posición del barco " + i + ": ");
            int row = sc.nextLine().toUpperCase().charAt(0) - 'A';
            int col = sc.nextInt();
            sc.nextLine();
            if (board[row][col] == '-') {
                board[row][col] = 'S';
            } else {
                System.out.println("Esa posición ya está ocupada, elige otra");
                i--;
            }
        }
    }

    public static void playGame() {
        int hits = 0;
        while (hits < 5) {
            System.out.print("Ingresa las coordenadas para disparar (Ejemplo: A 0): ");
            int row = sc.nextLine().toUpperCase().charAt(0) - 'A';
            int col = sc.nextInt();
            sc.nextLine();
            if (board[row][col] == 'S') {
                System.out.println("¡HIT!");
                hits++;
            } else {
                System.out.println("¡AGUA!");
            }
        }
        System.out.println("¡GANASTE!");
    }
}
