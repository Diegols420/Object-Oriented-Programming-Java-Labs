package Lab01_GestionEmpleados;
/**
 * Clase que representa a un Jefe de la empresa.
 * El sueldo base depende del cargo y el área.
 * La bonificación depende de los años de antigüedad.
 * La movilidad depende del cargo.
 */
public class Jefe {
        // ==================== ATRIBUTOS DE INSTANCIA ====================
    String nombres;
    String sexo;            // "Masculino" o "Femenino"
    String dni;
    String cargo;           // "Gerente" o "Subgerente"
    String area;            // "Contabilidad" o "Planificación"
    int aniosAntiguedad;

    // ==================== ATRIBUTOS DE CLASE ====================
    private static final double MOVILIDAD_GERENTE    = 700;
    private static final double MOVILIDAD_SUBGERENTE = 400;
    private static final double PORC_BONIF_MENOR7    = 0.05; // < 7 años → 5%
    private static final double PORC_BONIF_MAYOR8    = 0.04; // >= 8 años → 4%
    private static int contador = 0;

    // ==================== CONSTRUCTOR ====================
    public Jefe(String nombres, String sexo, String dni,
                String cargo, String area, int aniosAntiguedad) {
        contador++;
        this.nombres         = nombres;
        this.sexo            = sexo;
        this.dni             = dni;
        this.cargo           = cargo;
        this.area            = area;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    // ==================== MÉTODOS DE CÁLCULO ====================

    /**
     * Calcula el sueldo base según cargo y área.
     * Gerente    + Contabilidad  → 6000
     * Gerente    + Planificación → 7000
     * Subgerente + Contabilidad  → 5000
     * Subgerente + Planificación → 6000
     */
    public double calcularSueldoBase() {
        if (cargo.equalsIgnoreCase("Gerente")) {
            if (area.equalsIgnoreCase("Contabilidad"))
                return 6000;
            else
                return 7000;
        } else { // Subgerente
            if (area.equalsIgnoreCase("Contabilidad"))
                return 5000;
            else
                return 6000;
        }
    }

    /**
     * Asigna monto de movilidad según cargo.
     * Gerente → 700 | Subgerente → 400
     */
    public double calcularMovilidad() {
        if (cargo.equalsIgnoreCase("Gerente"))
            return MOVILIDAD_GERENTE;
        else
            return MOVILIDAD_SUBGERENTE;
    }

    /**
     * Calcula bonificación según años de antigüedad.
     * < 7 años  → 5% del sueldo base
     * >= 8 años → 4% del sueldo base
     */
    public double calcularBonificacion() {
        if (aniosAntiguedad < 7)
            return calcularSueldoBase() * PORC_BONIF_MENOR7;
        else
            return calcularSueldoBase() * PORC_BONIF_MAYOR8;
    }

    /**
     * Sueldo Final = Sueldo Base + Bonificación + Movilidad
     */
    public double sueldoFinal() {
        return calcularSueldoBase() + calcularBonificacion() + calcularMovilidad();
    }

    /**
     * Retorna el número total de objetos Jefe creados.
     */
    public static int getContador() {
        return contador;
    }
}
