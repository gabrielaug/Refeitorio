/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeitorio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import refeitorio.basicas.Funcionario;
import refeitorio.interfaces.InterfaceFuncionario;
import refeitorio.util.Conexao;
import refeitorio.util.DAOException;

/**
 *
 * @author Gabriel Augusto
 */
public class DAOFuncionario implements InterfaceFuncionario {

    @Override
    public boolean inserirFuncionario(Funcionario funcionario) throws DAOException, SQLException {
     
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "INSERT INTO Funcionario (Matricula,Nome,Setor,Tel1,Tel2) VALUES (?,?,?,?,?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,funcionario.getMatricula());
        pstm.setString(2,funcionario.getNome());
        pstm.setString(3,funcionario.getSetor());
        pstm.setFloat(4,funcionario.getTel1());
        pstm.setFloat(5,funcionario.getTel2());
        try{
         
        pstm.executeUpdate();
            
        }
        catch(SQLException ex){
            
        }
        finally{
           Conexao.closeConnection(con, pstm); 
        }
        
        return true;
    }

    @Override
    public boolean inativarFuncionario(Funcionario funcionario) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "UPDATE Funcionario SET Situacao = ? WHERE Matricula = ?";
        String sqlCartao = "UPDATE Cartao SET Situacao = ? WHERE Cod_Barra = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,funcionario.getSituacao());
        pstm.setString(2,funcionario.getMatricula());
        
        try{
         
        pstm.executeUpdate();
        
        pstm = null;
        pstm =  con.prepareStatement(sqlCartao);
        pstm.setString(1, funcionario.getCartao().getSituacao());
        pstm.setFloat(2,funcionario.getCartao().getCodBarra());
        
        pstm.executeUpdate();
            
        }
        catch(SQLException ex){
            
        }
        finally{
           Conexao.closeConnection(con, pstm); 
        }
        
        return true;
    }

    @Override
    public ArrayList<Funcionario> listarFuncionario(Funcionario funcionario) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        ArrayList<Funcionario> retorno = new ArrayList();
        
        String sql = "SELECT Matricula,Nome,Setor,Tel1,Tel2,Situacao,Cod_Barra FROM Funcionario";
        
        PreparedStatement pstm;
        
        if(funcionario != null){
            
        sql += " WHERE Matricula = ?";
        
        pstm = con.prepareStatement(sql);
        pstm.setString(1, funcionario.getMatricula());
        
        }else{
            pstm = con.prepareStatement(sql);
        }
        
        ResultSet rs;
        
        rs = pstm.executeQuery();
        
        while(rs.next()){
            
            Funcionario fun = new Funcionario();
            
            fun.setMatricula(rs.getString("Matricula"));
            fun.setNome(rs.getString("Nome"));
            fun.setSetor(rs.getString("Setor"));
            fun.setTel1(rs.getFloat("Tel1"));
            fun.setTel2(rs.getFloat("Tel2"));
            fun.setSituacao(rs.getString("Situacao"));
            fun.getCartao().setCodBarra(rs.getFloat("Cod_Barra"));
            
            retorno.add(fun);
        }
        
        return retorno;
    }
    
    
    
}
