/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Departamento de Tecnolog�as de la Informaci�n y Comunicaciones
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Proyecto Central de Pacientes.
 * Adaptado de CUPI2 (Uniandes)
 * Fecha: Febrero 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package centralPacientes.mundo;

/**
 * Excepción generada cuando un paciente con un código dado no existe
 */
public class NoExisteException extends Exception {
    // Atributo para almacenar el código del paciente
    private int codigo;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la excepción con el código del paciente
     *
     * @param codigo Código del paciente que no está registrado en la central
     */
    public NoExisteException(int codigo) {
        super("El paciente con código " + codigo + " no está registrado");
        this.codigo = codigo;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Obtiene el código del paciente que generó la excepción
     *
     * @return Código del paciente
     */
    public int getCodigo() {
        return codigo;
    }
}