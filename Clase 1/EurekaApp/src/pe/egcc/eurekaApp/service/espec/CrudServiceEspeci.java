
package pe.egcc.eurekaApp.service.espec;

import java.util.List;


public interface CrudServiceEspeci<T> 


{
    void insertar(T bean);
    
    void update(T bean);
    
    void delete(String codigo);
    
    T leer(String codigo);
    
    List<T> leerVarios(T bean);
    
    
}
