/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Suporte;


/**
 *
 * @author emill
 */
public class SuporteDAO {
    Connection con = null;

    public boolean inserirResposta(Suporte supDAO) throws SQLException {
        boolean inseriu = false;
        try {
            con = new Conexao().getConnection();
            String sql = "INSERT INTO classt (respostas) values(?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, supDAO.getRespostas());
            stmt.execute();
            stmt.close();
            inseriu = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return inseriu;
    }
    
    
    public ArrayList<Suporte> buscarEmail(String email) throws SQLException, ClassNotFoundException  {
        ResultSet rs = null;
        ArrayList<Suporte> lista = new ArrayList();
        
           con = new Conexao().getConnection();
           String sql = "SELECT * FROM classt WHERE email like ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           while (rs.next())
           {
               String respostas = rs.getString("Respostas");
               String perguntas = rs.getString("Perguntas");
               email = rs.getString("Email"); //mudar para PK na query
               Suporte sup = new Suporte(respostas, perguntas, email);
               lista.add(sup);
           }
           stmt.close();
           con.close();   
           return lista;
    }
    
    /*public ArrayList<Suporte> buscarPerguntas(String perguntas) throws SQLException, ClassNotFoundException  {
        ResultSet rs = null;
        ArrayList<Suporte> lista = new ArrayList();
        
           con = new Conexao().getConnection();
           String sql = "SELECT * FROM classt where perguntas like ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, perguntas);
           rs = stmt.executeQuery();
           while (rs.next())
           {
               String respostas = rs.getString("Respostas");
               String email = rs.getString("Email");
               perguntas = rs.getString("Perguntas");
               Suporte sup = new Suporte(perguntas, respostas, email);
               lista.add(sup);
           }
           stmt.close();
           con.close();   
           return lista;
    }*/
    
    public ArrayList<Suporte> buscarPerguntas() throws SQLException, ClassNotFoundException  {
        ResultSet rs = null;
        ArrayList<Suporte> lista = new ArrayList();
        
           con = new Conexao().getConnection();
           String sql = "SELECT * FROM classt";
           PreparedStatement stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           while (rs.next())
           {
               String respostas = rs.getString("Respostas");
               String perguntas = rs.getString("Perguntas");
               String email = rs.getString("Email");
               Suporte sup = new Suporte(respostas,perguntas,email);
               lista.add(sup);
           }
           stmt.close();
           con.close();   
           return lista;
    }
}
