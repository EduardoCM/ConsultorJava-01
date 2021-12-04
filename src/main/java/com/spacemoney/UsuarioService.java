package com.spacemoney;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioService {
	
	BDConnection sqlConnection = new BDConnection();
	
	
	public boolean crearUsuario(Usuario usuario) {
		
		String sqlInsert = "INSERT INTO USUARIOS (nombre, apellidoPaterno, apellidoMaterno, edad, sexo, pais, email) VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Connection connection = sqlConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlInsert);
			
			statement.setString(1, usuario.nombre);
			statement.setString(2, usuario.apellidoPaterno);
			statement.setString(3, usuario.apellidoMaterno);
			statement.setInt(4, usuario.edad);
			statement.setString(5, usuario.sexo);
			statement.setString(6, usuario.pais);
			statement.setString(7, usuario.email);
			
			int count = statement.executeUpdate();
			
			if(count > 0) {
				return true;
			}else {
				return false;
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
	}

}
