
package pe.egcc.eurekaApp.db;

//Objetivo de la clase de esta clase es que tenga un metodo que permita
//el acceso a un objeto de tipo connection


public final class AccesoDB 

{
    //Constructor privado para que no permita crear objetos de esta clase
    private AccesoDB()
    {
        
    }
    
    //Parametros de conexion
    private static final String CN_DRIVER = "oracle.jdbc.OracleDriver";
    private static final String CN_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String CN_USER = "eureka";
    private static final String CN_PASS = "admin";
    
}
