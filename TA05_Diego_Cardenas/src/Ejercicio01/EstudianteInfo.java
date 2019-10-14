
package Ejercicio01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EstudianteInfo {

    public static void main(String[] args) {
        
        //Ingresamos por teclado
        String _nom = JOptionPane.showInputDialog("Ingrese nombres: ");
        String _ape = JOptionPane.showInputDialog("Ingrese apellidos: ");
        String _esp = JOptionPane.showInputDialog("Ingrese especialidad: ");
        int _cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo: "));
        
        //creamos el objeto e1
        Estudiante e1 = new Estudiante(_nom,_ape,_esp,_cod);
        
        //llamamos aal metodo de llenarLista
        ArrayList<Integer> notas = e1.llenarLista();
        
        //llamamos al metodo calcular menor
        int _min = e1.calcularMenor(notas);
        
        //llamamos al metodo calcularPromedio
        double _prom = e1.calcularPromedio(_min, notas);
        
        //llamamos al metodo 
        e1.mostrarInfo(_prom, notas,_min);
        
        
        
        
        
        
      
    }
    
}
