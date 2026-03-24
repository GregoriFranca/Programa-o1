/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregori_franca;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Discente {
    private String nome;
    private int anoIngresso;
    private Estudante discentes = new Estudante();
    private Professor professores = new Professor();
    private Disciplina diciplinas = new Disciplina();
    
    private Set<Estudante> _discentes = new HashSet<Estudante>();
    private Set<Professor> _professores = new HashSet<Professor>();
    private Set<Disciplina> _diciplinas = new HashSet<Disciplina>();
}
