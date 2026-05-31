package Lab01_GestionEmpleados;

/**
 * Clase que representa a un Arquitecto.
 * El sueldo base se determina según la condición de contrato
 * y el tipo de actividad. La bonificación depende de la especialidad.
 */
public class Arquitecto {

    // ==================== ATRIBUTOS DE INSTANCIA ====================
    String codigo;
    String nombres;
    String condicionContrato;  // "Estable" o "Contratado"
    String especialidad;       // "Estructuras" o "Recursos Hídricos"
    String tipoActividad;      // "Supervisión de Obras" o "Supervisión de Vías"
    String tipoAfiliacion;     // "AFP" o "SNP"

    // ==================== ATRIBUTOS DE CLASE (compartidos) ====================
    private static final double PORC_AFP        = 0.15; // 15% descuento AFP
    private static final double PORC_SNP        = 0.08; // 8%  descuento SNP
    private static final double PORC_ESTRUCTURAS       = 0.16; // 16% bonificación
    private static final double PORC_REC_HIDRICOS      = 0.18; // 18% bonificación
    private static int contador = 0;

    // ==================== CONSTRUCTOR ====================
    /**
     * Constructor que inicializa todos los atributos del arquitecto.
     */
    public Arquitecto(String codigo, String nombres, String condicionContrato,
                      String especialidad, String tipoActividad, String tipoAfiliacion) {
        contador++;
        this.codigo            = codigo;
        this.nombres           = nombres;
        this.condicionContrato = condicionContrato;
        this.especialidad      = especialidad;
        this.tipoActividad     = tipoActividad;
        this.tipoAfiliacion    = tipoAfiliacion;
    }

    // ==================== MÉTODOS DE CÁLCULO ====================

    /**
     * Calcula el sueldo base según condición de contrato y tipo de actividad.
     * Estable   + Sup. Obras → 4000
     * Estable   + Sup. Vías  → 6000
     * Contratado + Sup. Obras → 2000
     * Contratado + Sup. Vías  → 4500
     */
    public double calcularSueldoBase() {
        if (condicionContrato.equalsIgnoreCase("Estable")) {
            if (tipoActividad.equalsIgnoreCase("Supervisión de Obras"))
                return 4000;
            else
                return 6000;
        } else { // Contratado
            if (tipoActividad.equalsIgnoreCase("Supervisión de Obras"))
                return 2000;
            else
                return 4500;
        }
    }

    /**
     * Calcula la bonificación según la especialidad.
     * Estructuras      → 16% del sueldo base
     * Recursos Hídricos → 18% del sueldo base
     */
    public double calcularBonificacion() {
        if (especialidad.equalsIgnoreCase("Estructuras"))
            return calcularSueldoBase() * PORC_ESTRUCTURAS;
        else
            return calcularSueldoBase() * PORC_REC_HIDRICOS;
    }

    /**
     * Calcula el descuento según tipo de afiliación.
     * AFP → 15% | SNP → 8%
     */
    public double calcularDescuento() {
        if (tipoAfiliacion.equalsIgnoreCase("AFP"))
            return calcularSueldoBase() * PORC_AFP;
        else
            return calcularSueldoBase() * PORC_SNP;
    }

    /**
     * Sueldo Bruto = Sueldo Base + Bonificación
     */
    public double sueldoBruto() {
        return calcularSueldoBase() + calcularBonificacion();
    }

    /**
     * Sueldo Neto = Sueldo Bruto - Descuento
     */
    public double sueldoNeto() {
        return sueldoBruto() - calcularDescuento();
    }

    /**
     * Retorna el número total de objetos Arquitecto creados.
     */
    public static int getContador() {
        return contador;
    }
}