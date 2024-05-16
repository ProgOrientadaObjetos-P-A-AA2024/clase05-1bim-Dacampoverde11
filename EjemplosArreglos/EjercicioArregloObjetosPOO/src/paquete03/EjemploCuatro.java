/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;


public class EjemploCuatro {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        
        Profesor profesor1 = new Profesor ("Franco", "nombramiento");
        Profesor profesor2 = new Profesor ("Richard", "contrato");
        Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computación", profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica", profesor2);
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        
        // esta invocando a un metodo obtenerProfesor que es de tipo Profesor
        // por lo tanto en el mismo se hace llamado a obtenerNombre de tipo String 
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - Profesor(%s - %s)\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
                    objetoCalificacion.obtenerProfesor().obtenerTipo());
        }
        
    }
}
