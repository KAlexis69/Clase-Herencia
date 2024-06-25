/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DELL
 */
public class Persona {
    //atributos

    private int idPersona;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String fechaNacimiento;
    private String cedula;
    private String direccion;
    private String correoElectronico;
    private String sexo;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellidos, int telefono, String fechaNacimiento, String cedula, String direccion, String correoElectronico, String sexo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    

    //regla negocos
    public String imprimir() {
        return "-------DATOS PERSONA-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombre() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Correo Electrónico:" + getCorreoElectronico() + "\n"
                + "Telefono:" + getTelefono() + "\n"
                + "Sexo:" + getSexo() + "\n"
                + "Fecha de Nacimiento" + getFechaNacimiento();
    }

    //metodo de validacion cedula existente
    public void validarcedula() {
        int[] listaDigitos = new int[9];
        String cedula = this.getCedula();
        if (cedula.length() > 10) {
            System.out.println("Ingrese una cedula valida");
        } else if (cedula.length() == 10) {
            //crecion de lista por cada uno que se va generando
            for (int i = 0; i < cedula.length() - 1; i++) {
                listaDigitos[i] = cedula.charAt(i) - '0';
            }
            for (int casa : listaDigitos) {
                System.out.println(casa);
            }
        } else {
            System.out.println("Revise el numero de cedula");
        }
    }

    public void validarCedula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
