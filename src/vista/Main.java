/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Docente;
import modelo.Persona;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
         Persona x=new Persona();
         Docente d=new Docente();
         d.setApellidos("Andaluz");
         d.setNombre("Kevin");
         d.setSexo("Masculini");
         d.setIdPersona(1);
         d.setTitulo("Ingeniero en Sistemas");
         d.setEspecialidad("Backend");
         d.setRegistroSenescyt("000-000-0PO");
         System.out.println(d.imprimir());
        
         
    }
}
