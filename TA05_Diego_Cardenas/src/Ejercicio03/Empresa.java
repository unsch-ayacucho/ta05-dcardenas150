
package Ejercicio03;

import javax.swing.JOptionPane;

public class Empresa {

    public static void main(String[] args) {
        //ingresamos por teclado todos estos valores
        String _nom = JOptionPane.showInputDialog("Ingrese nombres: ");
        String _ape = JOptionPane.showInputDialog("Ingrese apellidos: ");
        int _cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo: "));
        String _alab = JOptionPane.showInputDialog("Ingrese area laboral");
        int _suel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo: "));
        int _hor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas extra: "));
        int _afil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese afiliacion(1:AFP,  2:SNP,  3:Por salud): "));
     
        //creamos el objeto e1
       Empleado e1 = new Empleado(_nom,_ape,_cod,_alab,_suel,_hor,_afil);
       
       //llamamos este metodo para clacular el monto de horas extra
      double _m = e1.montoHorasExtra();
      
      //llamamos este metodo para mostrar los valores que no requieren calculo o que son puesto directamente
      e1.Mostrar();
      
      //llamamos al metodo  monto de descuento
      e1.montoDescuento();
      
      //llamamos al metodo de total de sueldo
      e1.totalSueldo(_m);
       
        
        
       
     
        
        
        
        
    }
    
}
