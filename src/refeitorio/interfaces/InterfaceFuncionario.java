/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeitorio.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import refeitorio.basicas.Funcionario;
import refeitorio.util.DAOException;

/**
 *
 * @author Gabriel Augusto
 */
public interface InterfaceFuncionario {
    
    public boolean inserirFuncionario(Funcionario funcionario) throws DAOException , SQLException;
    public boolean inativarFuncionario(Funcionario funcionario) throws DAOException, SQLException;
    public ArrayList<Funcionario> listarFuncionario (Funcionario funcionario) throws DAOException, SQLException;
    
}
