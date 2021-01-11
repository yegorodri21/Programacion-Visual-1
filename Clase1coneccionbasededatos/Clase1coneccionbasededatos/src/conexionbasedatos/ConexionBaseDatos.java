
package conexionbasedatos;
import com.istloja.conexionbd.Conexion;
import com.istloja.controlador.Personabd;
import com.istloja_modelo.Persona;

public class ConexionBaseDatos {
    public static void main (String[]in){
    
        
    Personabd personabd= new Personabd();
    Persona persona = new Persona();
    persona.setIdPersona(1);
    persona.setCedula("1150710257");
    persona.setNombre("Pepe");
    persona.setApellido("Gonzalez");
    persona.setDireccion("Las Peñas");
    persona.setCorreo("5555555555");
    persona.setTelefono("094658753");
    //Cambiar dependiendo del proceso que desee realizar
    //registrarPersona 
    //editarPersona
    //eliminarPersona
          //cambiar esto↓↓↓
    if(personabd.eliminarPersona(persona)){
            System.out.println("Proceso Exitoso");
    }else{
            System.out.println("Error");
    }
            
}
}
