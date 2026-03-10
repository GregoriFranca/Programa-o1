/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregori_franca;

/**
 *
 * @author aluno
 */
public class programacao {

    public static void main(String[] args) {
        Estudante gabriel = new Estudante();
        Estudante gregori = new Estudante();
        Estudante theo = new Estudante();

        gregori.setNome("Gregori");
        gabriel.setNome("Gabriel");
        theo.setNome("Theo");

        System.out.println(gregori.getNome());
        System.out.println(gabriel.getNome());
        System.out.println(theo.getNome());
    }
}
