package com.mycompany.gregori_franca;

import java.util.Date;
j
public class Professor {
    private String nome;
    private String email;
    private String areaAtuacao;
    private String regimeTrabalho;
    private String tituloAcademico;
    private String formacao;  
    private String telefone;
    private String siape;
    private Date dataIgresso;
    
    public  String getNome(){
        return nome;
    }
    public void setNome(String _nome){
        nome = _nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String _Email){
        email = _Email;
    }
    public String getAreaAtucao(){
        return areaAtuacao;
    }
    public void setAreaAtuacao(String _areaAtuacao){
        areaAtuacao = _areaAtuacao;
    }
    public  String getregimeTra(){
        return regimeTrabalho;
    }
    public void setregimeTra(String _regimeTrabalho){
        regimeTrabalho = _regimeTrabalho;
    }
    public  String getTituloAcademico(){
        return tituloAcademico;
    }
    public void setTituloAcademico(String _tituloAcademico){
        regimeTrabalho = _tituloAcademico;
    }
    public  String getformacao(){
        return formacao;
    }
    public void setformacao(String _formacao){
        formacao = _formacao;
    }
    public  String getTelefone(){
        return telefone;
    }
    public void setTelefone(String _telefone){
        telefone = _telefone;
    }
    public void setSiape(String _siape) {
        siape = _siape;
    }
    public String getSiape() {
        return siape;
    }
   
    public Date getDataIgresso() {
        return dataIgresso;
    }
    public void setDataIngresso(Date _dataIngresso) {
        dataIgresso = _dataIngresso;
    }
}