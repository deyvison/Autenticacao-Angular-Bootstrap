package br.ufpb.aytypbprev;

import java.sql.*;
public class PostgreSQL {
	
public static void main(String args[]) throws SQLException, ClassNotFoundException{

		Class.forName("org.postgresql.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Autenticacao","postgres","admin");
        
		System.out.println("Conectado!");
	
		Statement instrucao = conexao.createStatement();
       
		String consulta = "insert into usuario values('maria','000')";
        
        instrucao.executeUpdate(consulta);
        
        conexao.close();
	}
}