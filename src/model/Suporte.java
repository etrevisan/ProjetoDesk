/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author emill
 */
public class Suporte {
    String perguntas; //provavelmente vai precisar ser array (?)
    String respostas;
    String email;

    public Suporte(String perguntas, String respostas, String email) {
        this.perguntas = perguntas;
        this.respostas = respostas;
        this.email = email;
    }

    public Suporte(String respostas) {
         this.respostas = respostas;
    }
  

    public String getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(String perguntas) {
        this.perguntas = perguntas;
    }

    public String getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas) {
        this.respostas = respostas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
 
}
