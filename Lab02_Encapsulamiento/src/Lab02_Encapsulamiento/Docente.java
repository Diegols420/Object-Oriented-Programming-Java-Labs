package Lab02_Encapsulamiento;
/**
 * Clase que representa a un Docente.
 * Aplica encapsulamiento con getters y setters.
 * Genera código autogenerado DOC0001, DOC0002, etc.
 */
public class Docente {
      // ==================== ATRIBUTOS PRIVADOS ====================
    private String codigo;
    private String nombres;
    private String categoria;       // "Principal", "Asociado", "Auxiliar"
    private String postgrado;       // "Maestría", "Doctorado"
    private int horasClase;

    // ==================== CONSTANTES ====================
    private static final double DESCUENTO_SALUD = 0.03; // 3%
    private static int contador = 0;

    // ==================== CONSTRUCTOR ====================
    public Docente(String nombres, String categoria,
                   String postgrado, int horasClase) {
        contador++;
        // Genera código autogenerado: DOC0001, DOC0002, etc.
        this.codigo     = String.format("DOC%04d", contador);
        this.nombres    = nombres;
        this.categoria  = categoria;
        this.postgrado  = postgrado;
        this.horasClase = horasClase;
    }

    // ==================== GETTERS ====================
    public String getCodigo()     { return codigo; }
    public String getNombres()    { return nombres; }
    public String getCategoria()  { return categoria; }
    public String getpostgrado()  { return postgrado; }
    public int getHorasClase()    { return horasClase; }

    // ==================== SETTERS ====================
    public void setNombres(String nombres)       { this.nombres = nombres; }
    public void setCategoria(String categoria)   { this.categoria = categoria; }
    public void setPostgrado(String postgrado)   { this.postgrado = postgrado; }
    public void setHorasClase(int horasClase)    { this.horasClase = horasClase; }

    // ==================== MÉTODOS DE CÁLCULO ====================

    /**
     * Retorna el pago por hora según categoría.
     */
    public double getPagoPorHora() {
        switch (categoria) {
            case "Principal": return 25.00;
            case "Asociado":  return 18.00;
            default:          return 15.00; // Auxiliar
        }
    }

    /**
     * Pago parcial = horas de clase × pago por hora
     */
    public double calcularPagoParcial() {
        return horasClase * getPagoPorHora();
    }

    /**
     * Bonificación por postgrado según categoría.
     */
    public double calcularBonificacion() {
        double porcentaje = 0;
        if (categoria.equals("Principal")) {
            porcentaje = postgrado.equals("Doctorado") ? 0.20 : 0.17;
        } else if (categoria.equals("Asociado")) {
            porcentaje = postgrado.equals("Doctorado") ? 0.15 : 0.10;
        } else { // Auxiliar
            porcentaje = postgrado.equals("Doctorado") ? 0.12 : 0.08;
        }
        return calcularPagoParcial() * porcentaje;
    }

    /**
     * Descuento = pago parcial × 3%
     */
    public double calcularDescuento() {
        return calcularPagoParcial() * DESCUENTO_SALUD;
    }

    /**
     * Sueldo final = pago parcial + bonificación - descuento
     */
    public double calcularSueldoFinal() {
        return calcularPagoParcial() + calcularBonificacion() - calcularDescuento();
    }

    /**
     * Retorna el contador total de objetos Docente creados.
     */
    public static int getContador() {
        return contador;
    }
}
