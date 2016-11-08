
package bean;


import controlador.GestionDB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import persistencia.Usuarios;

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
        
        GestionDB g=new GestionDB();
        Usuarios usu =g.obtenerUsuarioDni(usuario);
        if (usu!=null){
            if (usu.getContraseña().equals(password)){
                if (usu.getFuncion().equals("alumno")){
                    return "alumno";
                }else{
                    return "administrador";
                }
            }else{
                return "error";
            }
        }
        else{
            return "error";
        }
        
        
        
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
