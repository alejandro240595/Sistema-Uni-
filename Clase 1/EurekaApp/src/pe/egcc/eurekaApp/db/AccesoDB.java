
package pe.egcc.eurekaApp.db;

//Objetivo de la clase de esta clase es que tenga un metodo que permita

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    
    public static Connection getConnection() throws SQLException
    {
        Connection cn = null;
        try 
        {
            //Paso 1 Cargar el driver
            Class.forName(CN_DRIVER).newInstance();
            //obtener el objeto conection
            cn = DriverManager.getConnection(CN_URL,CN_USER,CN_PASS);
            
            
        } 
        
        catch (ClassNotFoundException e) 
        
        {   String texto = "No se ha encontrado el driver de la BD";
            throw new  SQLException(texto);
                    
        }
        
        catch (SQLException e) 
        {
        
   
            throw e;
                    
        }
        
        catch (Exception e) 
        
        {
            String texto = "No se ha encontrado el driver de la BD";
            throw new  SQLException(texto);
                    
        }
        
        
        return cn;
    }
    
}
