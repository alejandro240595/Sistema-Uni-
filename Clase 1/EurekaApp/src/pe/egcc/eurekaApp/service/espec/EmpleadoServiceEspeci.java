
package pe.egcc.eurekaApp.service.espec;

import pe.egcc.eurekaApp.domain.Empleado;

/**
 *
 * @author Alumno
 */
public interface EmpleadoServiceEspeci extends CrudServiceEspeci<Empleado>, RowMapper<Empleado>

{
    Empleado validar(String usuario, String clave);
    
}
