
package pe.egcc.eurekaApp.prueba;

import java.sql.Connection;
import pe.egcc.eurekaApp.db.AccesoDB;

/**
 *
 * @author Alumno
 */
public class PRUEBA01 

{
        public static void main(String[] args) {
            try 
            {
                Connection cn = AccesoDB.getConnection();
                System.out.println("Conexion ok.");
                cn.close();
                
                
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
    }
}
