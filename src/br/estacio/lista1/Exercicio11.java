/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;

import java.util.Scanner;

/**
 *
 * @author alunoadm
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numeroDigitado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int i = numeroDigitado.nextInt();
        if (i < 10) {
            System.out.println(i + " É menor que 10");
        } else if (i > 10){
            System.out.println(i + " É maior que 10");
        } else if (i == 10){
            System.out.println(i + " É igual a 10");
        }
    }

}
