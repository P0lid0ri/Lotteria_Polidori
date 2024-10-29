/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lotteria_polidori;

/**
 *
 * @author GABRIELE
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lotteria_Polidori {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Input per la dimensione della matrice
        System.out.print("Inserisci il numero di righe della matrice: ");
        int righe = scanner.nextInt();
        System.out.print("Inserisci il numero di colonne della matrice: ");
        int colonne = scanner.nextInt();

// Creazione dell'oggetto Estrazione con matrice dinamica
        Estrazione e = new Estrazione(righe, colonne);
        e.stampaMatrice();
        e.start();

// Creazione dei giocatori
        Giocatore g1 = new Giocatore(1, e);
        Giocatore g2 = new Giocatore(2, e);
        Giocatore g3 = new Giocatore(3, e);

        g1.start();
        g2.start();
        g3.start();

// Attesa che i thread terminino
        try {
            g1.join();
            g2.join();
            g3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria_Polidori.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore join");
        }

        System.out.println("FINE LOTTERIA");
    }
}
