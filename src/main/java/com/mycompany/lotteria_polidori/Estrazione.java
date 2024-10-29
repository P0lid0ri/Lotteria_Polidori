/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lotteria_polidori;

/**
 *
 * @author GABRIELE
 */
import java.util.Random;

public class Estrazione extends Thread {
private int[][] matriceNumeri;
private int righe;
private int colonne;

public Estrazione(int righe, int colonne) {
this.righe = righe;
this.colonne = colonne;
matriceNumeri = new int[righe][colonne];
Random random = new Random();

// Riempimento della matrice con numeri casuali da 0 a 90
for (int i = 0; i < righe; i++) {
for (int j = 0; j < colonne; j++) {
matriceNumeri[i][j] = random.nextInt(91);
}
}
}

// Metodo per stampare la matrice vincente
public void stampaMatrice() {
System.out.println("Scheda Vincente:");
for (int i = 0; i < righe; i++) {
for (int j = 0; j < colonne; j++) {
System.out.print(matriceNumeri[i][j] + "\t");
}
System.out.println();
}
}

// Verifica se il numero scelto dal giocatore è presente nella matrice
public boolean verifica(int numeroScelto, int idGiocatore) {
for (int i = 0; i < righe; i++) {
for (int j = 0; j < colonne; j++) {
if (matriceNumeri[i][j] == numeroScelto) {
return true; // Numero trovato
}
}
}
return false; // Numero non trovato
}

public void run() {
System.out.println("INIZIO ESTRAZIONE!");
stampaMatrice();
}
}
