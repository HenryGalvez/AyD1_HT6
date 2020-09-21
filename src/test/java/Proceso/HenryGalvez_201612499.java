/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import Objetos.Horario;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class HenryGalvez_201612499 {
    
    AsignarHorario ah = null;
    Carrera c = null;
    Horario h = null;
    RegistroAcademico ra = null;
    
    
    @Test
    public void testGenerarHorario() throws Exception{
        Carrera carr = new Carrera(9, "la mejor carrera del mundo :v");
        int cod = carr.getCodigo();
        assertEquals(9, cod);
    }
    
     @Test
    public void testGenerarHorarioMock() throws Exception{
        c = new Carrera(9, "la mejor carrera del mundo :v");
        ra = new RegistroAcademico(2016,"12499");
        ah = Mockito.mock(AsignarHorario.class);
        when(ah.generarHorario(c, ra)).thenReturn(new Horario(4,"Horario interceptado"));
        h = ah.generarHorario(c, ra);
        assertEquals(h.getDescripcion(),"Horario interceptado");
    }
}
