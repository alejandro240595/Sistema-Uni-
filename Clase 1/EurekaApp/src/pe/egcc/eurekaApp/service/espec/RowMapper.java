
package pe.egcc.eurekaApp.service.espec;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public interface RowMapper<T> 

{
    T rowToBean(ResultSet rs) throws SQLException;
    
}
