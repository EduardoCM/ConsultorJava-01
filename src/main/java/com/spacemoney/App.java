package com.spacemoney;

/**
 * Hello world!
 * 
 * mvn clean compile assembly:single
 * mvn clean compile assembly:single
 *
 */
public class App 
{
    public static void main( String[] spaceMoney )
    {
        System.out.println( "Insertando usuario!" );
 
        Usuario usuario = new Usuario();
        usuario.nombre = spaceMoney[0];
        usuario.apellidoPaterno = spaceMoney[1];
        usuario.apellidoMaterno = spaceMoney[2];
        usuario.edad = Integer.parseInt(spaceMoney[3]);
        usuario.sexo = spaceMoney[4];
        usuario.pais = spaceMoney[5];
        usuario.email = spaceMoney[6];
        
        UsuarioService usuarioService = new UsuarioService();
        
        boolean seCreoUsuario = usuarioService.crearUsuario(usuario);
        
        
        if(seCreoUsuario) {
        	System.out.println("Usuario creado de forma exitosa");
        }else {
        	System.out.println("No se creo usuario");
        }
        
        
    }
}
