# 🔒 Lab02 — Encapsulamiento, Constructores y Sobrecarga de Métodos
> Laboratorio 02 — Programación Orientada a Objetos | UTP Lima

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans_29-1B6AC6?style=flat&logo=apache-netbeans-ide&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-GUI-007ACC?style=flat)

---

## 📝 Descripción
Aplicación de escritorio desarrollada con **Java Swing** que modela dos tipos de trabajadores aplicando encapsulamiento con getters/setters y generación automática de códigos únicos.

---

## 🏗️ Clases implementadas

### 👨‍🏫 Docente
- Código autogenerado con formato `DOC0001`, `DOC0002`, etc.
- Pago por hora según categoría — Principal (S/25), Asociado (S/18), Auxiliar (S/15)
- Bonificación por estudios de postgrado — Doctorado / Maestría
- Descuento de salud del 3% sobre el pago parcial
- Cálculo de sueldo final

### 👷 Trabajador
- Código autogenerado con formato `TRAB0001`, `TRAB0002`, etc.
- Sueldo bruto según categoría y tipo de contrato
- Bonificación según unidades producidas — ≤180 (4%) / >180 (8%)
- Descuentos AFP (12%) o SNP (8%)
- Cálculo de sueldo neto

---

## 🧠 Conceptos aplicados

| Concepto | Detalle |
|---|---|
| 🔒 Encapsulamiento | Atributos `private` con getters y setters |
| 🏗️ Constructores | Inicialización controlada de objetos |
| 🔑 Código autogenerado | `String.format("DOC%04d", contador)` |
| 🔗 Atributos estáticos | `static` — contador compartido entre objetos |
| 🔒 Constantes | `static final` — porcentajes de descuento |
| ⚙️ Métodos de cálculo | `calcularSueldoFinal()`, `calcularSueldoNeto()`, etc. |
| 🖥️ Interfaz gráfica | `JFrame`, `JPanel`, `JTextField`, `JComboBox`, `JTextArea`, `JButton` |
| 🎯 Manejo de eventos | `ActionPerformed`, `WindowOpened` |

---

## 🖥️ Capturas de pantalla

### 👨‍🏫 Docente
| Registro | Resultado |
|---|---|
| ![Docente crear](screenshots/docente_crear.png) | ![Docente resultado](screenshots/docente_resultado.png) |

### 👷 Trabajador
| Registro | Resultado |
|---|---|
| ![Trabajador crear](screenshots/trabajador_crear.png) | ![Trabajador resultado](screenshots/trabajador_resultado.png) |

---

## 🚀 ¿Cómo ejecutar?
1. Abre **NetBeans IDE 29**
2. Ve a `File → Open Project` y selecciona la carpeta `Lab02_Encapsulamiento`
3. Presiona `F6` para ejecutar

---

## 🔙 Volver al índice
[← Volver al repositorio principal](../README.md)
