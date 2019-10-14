
package Ejercicio01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante {
    
    //Creamos los atributos
    private String _nombres;
    private String _apellidos;
    private String _especialidad;
    private int _codigo;

    ArrayList<Integer> notas[];
    
    //creamos el constructor
    public Estudiante(String _nombres,String _apellidos,String _especialidad,int _codigo){
        this._nombres = _nombres;
        this._apellidos = _apellidos;
        this._especialidad = _especialidad;
        this._codigo = _codigo;


    }
    //creamos el metodo para crear una lista y llenarla
    public ArrayList<Integer> llenarLista(){
                
        //creamos una lista
        ArrayList<Integer> notas; 
        notas = new ArrayList();
        
        //llenamos la lista con las notas
        for(int i=0;i<4;i++){
            notas.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota"+(i+1)+": ")));
         }
        
       return notas;
    }

    
    //creamos el metodo que busque el menor
    public int calcularMenor(ArrayList<Integer> notas){
    
        //consideramos a la primera posicion menor
        int _min = notas.get(0);
       
        //comparacion con cada uno de los numeros de la lista 
        for(int i =1; i<notas.size();i++){
            if(_min > notas.get(i)){
                _min = notas.get(i);
            }   
        }
        
        return _min;
    }
    
    //aqui calcularemos el promedio excluyendo al menor
    public double calcularPromedio(int _min, ArrayList<Integer> notas){
        
        //acumulador
        int a = 0;
        
        
        //aqui iremos sumando cada uno de las notas
        for(int i=0; i<4;i++){
           a = a + notas.get(i);
            
        }

        //sacamos promedio excluyendo al menor
        double _promedio = (a - _min)/4;
        
        
        return _promedio;
        
        
    }
    
    //creamos este metodo para imprimir los valores
    public void mostrarInfo(double _promedio, ArrayList<Integer> notas, int _min){
        JOptionPane.showMessageDialog(null, "NOMBRES: " +_nombres + "\nAPELLIDOS: " + _apellidos +"\nESPECIALIDAD: " +
                _especialidad + "\nCODIGO: " + _codigo + "\nNOTAS = " + notas + "\nNOTA MAS BAJA: " + _min + "\nPROMEDIO: " +
                _promedio);
        
    }
    
}
