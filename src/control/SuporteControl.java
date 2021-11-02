/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Suporte;
import modelDAO.SuporteDAO;


/**
 *
 * @author emill
 */
public class SuporteControl {
    
    public void inserirResposta (String respostas, String perguntas, String email) throws SQLException
    {
      Suporte sup = new Suporte(respostas,perguntas,email); 
      SuporteDAO supDAO = new SuporteDAO();
      supDAO.inserirResposta(sup);
    }
    
    
    public void inserirResposta (String respostas) throws SQLException
    {
      Suporte sup = new Suporte(respostas); 
      SuporteDAO supDAO = new SuporteDAO();
      supDAO.inserirResposta(sup);
    }
    

    /* busca geral
    public ArrayList<Suporte> buscarPerguntas () throws SQLException, ClassNotFoundException
    {
       SuporteDAO supDAO = new SuporteDAO();
       return (supDAO.buscarPerguntas());
    }*/
    
     
      public ArrayList<Suporte> buscarPerguntas () throws SQLException, ClassNotFoundException
    {
       SuporteDAO supDAO = new SuporteDAO();
       return (supDAO.buscarPerguntas());
    }
     
}
