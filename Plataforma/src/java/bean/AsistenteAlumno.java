/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FlowEvent;


/**
 *
 * @author USUARIO
 */
@ManagedBean
@Named(value = "asistenteAlumno")
@ViewScoped
public class AsistenteAlumno implements Serializable{

    /**
     * Creates a new instance of AsistenteAlumno
     */
    public AsistenteAlumno() {
        
    }
    
    private Usuario usuario = new Usuario();
     
    private boolean saltarPaso;
     
    public Usuario getUsuario() {
        return usuario;
    }
 
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     
    public void guardar() {        
        FacesMessage msg = new FacesMessage("Ha funcionado.", "Bienvenido :" + usuario.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     


    
}
