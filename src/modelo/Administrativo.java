/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DELL
 */
public class Administrativo extends Persona{
    private int idAdministrativo;
    private String cargo;
    private String area;

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPersona, String nombre, String apellidos, int telefono, String fechaNacimiento, String cedula, String direccion, String correoElectronico, String sexo) {
        super(idPersona, nombre, apellidos, telefono, fechaNacimiento, cedula, direccion, correoElectronico, sexo);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }
    
   

    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public String imprimir(){
        return "-------DATOS PERSONA-----------\n"+
                "Id:"+getIdPersona()+"\n"+
                "Nombre:"+getNombre()+"\n"+
                "Apellidos:"+getApellidos()+"\n"+
                "Cédula:"+getCedula()+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Correo Electrónico:"+getCorreoElectronico()+"\n"+
                "Telefono:"+getTelefono()+"\n"+
                "Fecha de Nacimiento"+getFechaNacimiento()+
                "Sexo:"+getSexo()+"\n"+
                "---DATOS ADMINISTRATIVOS------"+"\n"+
                "Id Administrativo:"+getIdAdministrativo()+"\n"+
                "Cargo:"+getCargo()+"\n"+
                "Area:"+getArea();
                
    }
}
