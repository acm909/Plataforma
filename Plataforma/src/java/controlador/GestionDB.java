/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.Usuarios;



/**
 *
 * @author Mañana
 */
public class GestionDB {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("PlataformaPU");
    
    public Usuarios obtenerUsuarioDni(String dni){
        EntityManager em=emf.createEntityManager();
        Usuarios usu=null;
        em.getTransaction().begin();
        usu=em.find(Usuarios.class , dni);
        em.getTransaction().commit();
        
        
        return usu;
    }
    
}
