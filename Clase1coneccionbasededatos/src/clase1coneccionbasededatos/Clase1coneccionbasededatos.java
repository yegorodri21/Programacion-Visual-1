package clase1coneccionbasededatos;
import java.sql.Connection;
import java.sql.DriverManager;

public class Clase1coneccionbasededatos {
    public static void main (String[]in){
        Clase1coneccionbasededatos baseDatosMySql= new Clase1coneccionbasededatos();
        if (baseDatosMySql.conexion()){
            System.out.println("Se conecto");
        }else{
            System.out.println("No se conecto :(");
        }
    }

       private String NombreBS ="bdEjercicio1";
       private String Usuario ="root";
       private String Contraseña ="pajarito21";
       private String LineaBC ="jdbc:mysql://localhost:3306/"+NombreBS+"? useUnicode=true&use"
            + " JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";//"jdbc:mysql://localhost:3306/"+NombreBS+"?useSSL=TRUE";
       
    public boolean conexion (){
        Connection connect=null;
    try{
        connect = DriverManager.getConnection(LineaBC,Usuario,Contraseña);
        if(connect!=null){
            return true;
        }
    }catch (Exception e){
        System.out.println("Error: "+e.getMessage());
    }
        return false;
}
}
