
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.Persistencia.DuenioJpaController;
import com.mycompany.peluqueriacanina.Persistencia.MascotaJpaController;
import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;


public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController masJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
       //Creamos dueño en la BD
        duenioJpa.create(duenio);
        //Creamos la mascota en la BD
        masJpa.create(masco);
    }
    
    
    
}
