/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lotteria_polidori;

/**
 *
 * @author GABRIELE
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Giocatore extends Thread {
private int idGiocatore;
private Estrazione estrazione;

public Giocatore(int idGiocatore, Estrazione estrazione) {
this.idGiocatore = idGiocatore;
this.estrazione = estrazione;
}

public void run() {
Scanner scanner = new Scanner(System.in);
System.out.println("Giocatore " + idGiocatore + ", inserisci un numero da controllare: ");
int numeroScelto = scanner.nextInt();

System.out.println("Giocatore id:" + this.idGiocatore + " ha scelto il numero " + numeroScelto);

// Verifica il numero nella matrice
boolean vinto = estrazione.verifica(numeroScelto, idGiocatore);
if (vinto) {
System.out.println("Giocatore " + idGiocatore + " hai vinto!");
} else {
System.out.println("Giocatore " + idGiocatore + " hai perso!");
}
}
}