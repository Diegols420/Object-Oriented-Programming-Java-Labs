package Lab02_Encapsulamiento;
/**
 * Clase que representa a un Trabajador.
 * Aplica encapsulamiento con getters y setters.
 * Genera código autogenerado TRAB0001, TRAB0002, etc.
 */
public class Trabajador {
  
    // ==================== ATRIBUTOS PRIVADOS ====================
    private String codigo;
    private String nombres;
    private int unidadesProducidas;
    private String tipoContrato;    // "Contratado" o "Estable"
    private String categoria;       // "A" o "B"
    private int numeroHijos;
    private String tipoAfiliacion;  // "AFP" o "SNP"

    // ==================== CONSTANTES ====================
    private static final double PORC_AFP = 0.12; // 12%
    private static final double PORC_SNP = 0.08; // 8%
    private static int contador = 0;

    // ==================== CONSTRUCTOR ====================
    public Trabajador(String nombres, int unidadesProducidas,
                      String tipoContrato, String categoria,
                      int numeroHijos, String tipoAfiliacion) {
        contador++;
        // Genera código autogenerado: TRAB0001, TRAB0002, etc.
        this.codigo             = String.format("TRAB%04d", contador);
        this.nombres            = nombres;
        this.unidadesProducidas = unidadesProducidas;
        this.tipoContrato       = tipoContrato;
        this.categoria          = categoria;
        this.numeroHijos        = numeroHijos;
        this.tipoAfiliacion     = tipoAfiliacion;
    }

    // ==================== GETTERS ====================
    public String getCodigo()            { return codigo; }
    public String getNombres()           { return nombres; }
    public int getUnidadesProducidas()   { return unidadesProducidas; }
    public String getTipoContrato()      { return tipoContrato; }
    public String getCategoria()         { return categoria; }
    public int getNumeroHijos()          { return numeroHijos; }
    public String getTipoAfiliacion()    { return tipoAfiliacion; }

    // ==================== SETTERS ====================
    public void setNombres(String nombres)                    { this.nombres = nombres; }
    public void setUnidadesProducidas(int unidadesProducidas) { this.unidadesProducidas = unidadesProducidas; }
    public void setTipoContrato(String tipoContrato)          { this.tipoContrato = tipoContrato; }
    public void setCategoria(String categoria)                { this.categoria = categoria; }
    public void setNumeroHijos(int numeroHijos)               { this.numeroHijos = numeroHijos; }
    public void setTipoAfiliacion(String tipoAfiliacion)      { this.tipoAfiliacion = tipoAfiliacion; }

    // ==================== MÉTODOS DE CÁLCULO ====================

    /**
     * Calcula el sueldo bruto según categoría y tipo de contrato.
     * A + Contratado → 2320
     * A + Estable    → 4450
     * B + Contratado → 3300
     * B + Estable    → 3920
     */
    public double calcularSueldoBruto() {
        if (categoria.equalsIgnoreCase("A")) {
            return tipoContrato.equalsIgnoreCase("Contratado") ? 2320 : 4450;
        } else { // B
            return tipoContrato.equalsIgnoreCase("Contratado") ? 3300 : 3920;
        }
    }

    /**
     * Calcula bonificación según unidades producidas.
     * <= 180 → 4% del sueldo bruto
     * >  180 → 8% del sueldo bruto
     */
    public double calcularBonificacion() {
        double porcentaje = unidadesProducidas <= 180 ? 0.04 : 0.08;
        return calcularSueldoBruto() * porcentaje;
    }

    /**
     * Calcula descuento según tipo de afiliación.
     * AFP → 12% | SNP → 8%
     */
    public double calcularDescuento() {
        if (tipoAfiliacion.equalsIgnoreCase("AFP"))
            return calcularSueldoBruto() * PORC_AFP;
        else
            return calcularSueldoBruto() * PORC_SNP;
    }

    /**
     * Sueldo Neto = Sueldo Bruto + Bonificación - Descuento
     */
    public double calcularSueldoNeto() {
        return calcularSueldoBruto() + calcularBonificacion() - calcularDescuento();
    }

    /**
     * Retorna el contador total de objetos Trabajador creados.
     */
    public static int getContador() {
        return contador;
    }  
}
