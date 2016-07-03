
package pe.egcc.eurekaApp.service.impl;

import pe.egcc.eurekaApp.domain.Empleado;
import pe.egcc.eurekaApp.service.espec.EmpleadoServiceEspeci;

/**
 *
 * @author Alumno
 */
public class EmpleadoServiceImpl implements EmpleadoServiceEspeci {
    
    private final String SQLSELECT = "SELECT CHR_EMPLCODIGO,VCH_EMPLPATERNO,"
            + "VCH_EMPLMATERNO,VCH_EMPLNOMBRE,VCH_EMPLCIUDAD,VCH_EMPLDIRECCION,"
            + "VCH_EMPLUSUARIO, FROM EMPLEADO ";
    private final String SQL_INSERT = "";
    private final String SQL_UPDATE = "";
    private final String SQL_DELETE = "";
            
            
           
    
}
