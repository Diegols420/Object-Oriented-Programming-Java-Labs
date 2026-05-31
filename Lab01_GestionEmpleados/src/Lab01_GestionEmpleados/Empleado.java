package Lab01_GestionEmpleados;
public class Empleado {
    // atributos
    String codigo;
    String nombre;
    String area;
    double sueldoBase;
    double horasExtras;
    String tipo_seg; // tipo de seguro
    // valores comunes a todos los objetos
    private static double porc_Afp = 0.11;
    private static double porc_Snp = 0.06;
    private static double porc_Essalud = 0.03;
    private static int contador = 0;
    // constructor
    public Empleado(String codigo, String nombre, String area, double sueldoBase,
                     double horasExtras, String seguro) {
        
        contador++; // contando la cantidad de emppleados generados con la clase 
        //actualizando la informacion de los atributos de la clase
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipo_seg = seguro;
    }
    
//****************METODOS ADICIONALES****************
    
    //calculando el monto extra
    public double montoHExtras(){
        return sueldoBase * horasExtras / 240;
    }
    
    //calculando el monto de seguro
    public double montoSeguro(){
        if(tipo_seg.equalsIgnoreCase("AFP"))
            return sueldoBase * porc_Afp;
        
        if(tipo_seg.equalsIgnoreCase("SNP"))
            return sueldoBase * porc_Snp;
        return 0;
    }
    
    //calculando el monto de Essalud
    public double montoEssalud(){
        return sueldoBase * porc_Essalud;
    }
    
    //calculando el monto de Descuentos
    public double montoDescuentos(){
        return montoSeguro() + montoEssalud();
    }
    
    //Calculando el monto del sueldo bruto
    public double sueldoBruto(){
        return sueldoBase + montoHExtras();
    }
    
    //Calculando el sueldo neto
    public double sueldoNeto(){
        return sueldoBruto() - montoDescuentos();
    }
    
    //Obteniendo el numero de objetos generados con la clase
    public static int getContador(){
        return contador;
    }
}