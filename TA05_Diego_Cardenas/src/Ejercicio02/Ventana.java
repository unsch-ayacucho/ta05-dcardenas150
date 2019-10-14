
package Ejercicio02;

public class Ventana {
    
    //creamos lo atributos
    private String _nombre;
    private String _opcion;
    private int _can_archivos;
    
    //creamos el constructor
    public Ventana(String _nombre, String _opcion, int _can_archivos){
        this._can_archivos = _can_archivos;
        this._nombre = _nombre;
        this._opcion = _opcion;
    }
    
    //creamos los siguietes metodos
    
    public void abrirVentana(){
        System.out.println("Ventana abierta");
    }
    
    public void cerrarVentana(){
        System.out.println("Ventana cerrada");
    }
    
    public void eliminarArchivos(){
        System.out.println("Archivo eliminado");
    } 
    
    
    
    
}
