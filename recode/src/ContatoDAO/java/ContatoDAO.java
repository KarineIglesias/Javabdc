package ContatoDAO.java;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContatoDAO {
	
    private static final String ConnectionUsername = null;
	/*
     * CRUD
     * c:CREATE
     * r: READ
     * u: UPDATE
     * d: DELETE
     */
	
	public void save(Contato contato) {
		String sql = " INSERT INTO contato(nome, idade,datacadastro) VALUES (?,?,?)";
		 
	}
	Connection conn = null;
	PreparedStatement pstm = null;
	 
	try {
		//criar uma conexao com o banco de dados
		conn = ConnectionUsername.creatConnectionToMySql();
		
		//Criamos uma PreparedStatement , para executar uma query
		pstm =(PreparedStatement) conn.prepareStatement(sql);
		//Adicionar os valores que sao esperados  pela query
		pstm. setString(1, contato.getNome());
		pstm.setInt(2, contato.getIdade());
		pstm.setDate(3, new Date ( contato.getDataCadastro().getTime()));
		
		// Executar a query
		pstm.execute();
		
	}finally {
		// fechar as conexoes 
	}
	
	
}
