
package com.istloja.controlador;
import com.istloja_modelo.Persona;
import java.sql.Connection;
import java.sql.Statement;
import com.istloja.conexionbd.Conexion;


public class Personabd {
    public boolean registrarPersona(Persona persona){
        boolean registrar= false;
        //interfaz de acceso a la base de datos
        Statement stm=null;
        //conexion con la base de datos 
        Connection con=null;
        String sql= "INSERT INTO `bdejercicio1`.`persona` (`id_persona`, `cedula`, `Nombres`, `Apellidos`, `Direccion`, `Correo`, `telefono`) VALUES ('"+String.valueOf(persona.getIdPersona())+"', '"+persona.getCedula()+"', '"+persona.getNombre()+"', '"+persona.getApellido()+"', '"+persona.getDireccion()+"', '"+persona.getCorreo()+"', '"+persona.getTelefono()+"');";                   
        try {
            Conexion conexion =new Conexion();
            con= conexion.conectarBaseDatos();
            stm= con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
            
        return registrar;
    }
    public boolean editarPersona(Persona persona){
            
            boolean editar= false;
                    Statement stm=null;
                    Connection con=null;
             String sql = " UPDATE `bdejercicio1`.`persona` SET `id_persona` = '"+String.valueOf(persona.getIdPersona())
                     +"', `cedula` = '"+persona.getCedula()
                     +"', `Nombres` = '"+persona.getNombre()
                     +"', `Apellidos` = '"+persona.getApellido()
                     +"', `Direccion` = '"+persona.getDireccion()
                     +"', `Correo` = '"+persona.getCorreo()
                     +"', `telefono` = '"+persona.getTelefono()
                     +"' WHERE (`id_persona` = '"+String.valueOf(persona.getIdPersona())+"');";

          try {
            Conexion conexion =new Conexion();
            con= conexion.conectarBaseDatos();
            stm= con.createStatement();
            stm.execute(sql);
            editar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } 
          return editar;
   }
    public boolean eliminarPersona(Persona persona){
            
            boolean eliminar= false;
                    Statement stm=null;
                    Connection con=null;
             String sql = "Delete from `bdejercicio1`.`persona` WHERE (`id_persona` = '"+String.valueOf(persona.getIdPersona())+"');";
             try {
            Conexion conexion =new Conexion();
            con= conexion.conectarBaseDatos();
            stm= con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } 
          return eliminar;
   }
    }
