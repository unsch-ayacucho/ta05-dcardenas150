
package Ejercicio03;

public class Empleado {
    
    //creamos los atributos
    private String _nombres;
    private String _apellidos;
    private int _codigo;
    private String _aLaboral;
    private int _sueldo;
    private int _horas_extra;
    private int _afiliacion_AFP;
    
    //creamos el constructor
    public Empleado(String _nombres, String _apellidos, int _codigo, 
                    String _aLaboral, int _sueldo,int _horas_extra,int _afiliacion_AFP){
        
        this._nombres =_nombres;
        this._apellidos =_apellidos;      
        this._codigo = _codigo;
        this._aLaboral = _aLaboral;
        this._sueldo= _sueldo;
        this._horas_extra = _horas_extra;
        this._afiliacion_AFP = _afiliacion_AFP;

    }
    
    //creamos los metodos:
   
    //monto de horas extra
    public double montoHorasExtra(){
        double _m;
        _m = (_sueldo/240) * _horas_extra; //segun la formula del pdf
        return _m;
    }
    
    
    //monto de los descuentos de AFP y el total de estos
    public void montoDescuento(){
        double _desc1 = _sueldo * 11/100;//descuento por AFP
        double _desc2 = _sueldo * 13/100;//descuento por SNP
        double _desc3 = _sueldo * 3/100;//descuento por salud     
        
        System.out.println("Descuento por AFP: " + _desc1 + "\nDescuento por SNP: " + _desc2 + "\nDescuento por salud: " + _desc3);
        
        double _descT = _desc1 + _desc2 +_desc3; //suma de todos los descuentos
        
        System.out.println("monto total de descuentos: " + _descT);
    }
    
    //metodo creado para el total del dsueldo
    public void totalSueldo(double _m){
        //segun la opcion del la afiliacion
        if(_afiliacion_AFP == 1){
            double _st = _sueldo + _m +  (_sueldo * 11/100);
            System.out.println("Sueldo Total: " + _st);
        }else if(_afiliacion_AFP == 2){
            double _st = _sueldo + _m +  (_sueldo * 13/100);
            System.out.println("Sueldo Total: " + _st);
        }else if(_afiliacion_AFP == 3){
            double _st = _sueldo + _m +  (_sueldo * 3/100);
            System.out.println("Sueldo Total: " + _st);
        }
    }

    //creacion del metodo para mostrar todo
    public void Mostrar(){
        System.out.println("Nombres: " + _nombres + "\nApellidos: " + _apellidos + "\nCodigo: " +
                _codigo + "\nArea Laboral: " + _aLaboral + "\nSueldo: " + _sueldo + "\nHoras Extra: " + 
                _horas_extra + "\nAfiliacion(1:AFP, 2:SNP, 3:Salud:) " + _afiliacion_AFP);
    }


}
