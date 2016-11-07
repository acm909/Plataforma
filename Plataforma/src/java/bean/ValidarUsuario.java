
package bean;


import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 *
 * @author Antonio1
 */
@ManagedBean (name="validarUsuario")
@RequestScoped

public class ValidarUsuario {

    String usuario;
    String password;
    
    public ValidarUsuario() {
        
        
        
    }
    public String comUsu() {
        String ir;
        Usuario usu = new Usuario("111A", "jose", "perez herreros", "administrador", "123", "jos@jose.com");

        if (this.usuario.equals(usu.getDni()) && this.password.equals(usu.getPassword())) {

            if (usu.getRol().equals("administrador")) {
                ir = "administrador";

            } else {
                ir = "alumno";

            }
        } else {
            ir = "error";
        }
        return ir;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public ValidarUsuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }*/
    
            
        
    
    
    
}
