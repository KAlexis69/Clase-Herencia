/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlado;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.Persona;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class PersonaControlador {
    //Atributos privados
    //Modelo
    private Persona persona;
    //Conexion
    Conexion conexion=new Conexion();
    Connection connection=(Connection)conexion.conectar();
    //ejecutar consulta
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    //Insetar filas en una tabla
    public void crearPersona(Persona p){
        try {//exception que lanza la consulta
            //String estatico con componentes dinamicos(gets)
            String consultaSQL="INSERT INTO persona(nombres,apellidos,cedula,usuario,clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono) VALUES ('"+p.getNombre()+"','"+p.getApellidos()+"','"+p.getCedula()+"','"+p.getUsuario()+"','"+p.getClave()+"','"+p.getDireccion()+"','"+p.getCorreoElectronico()+"','"+p.getSexo()+"','"+p.getFechaNacimiento()+"',"+p.getTelefono()+");";
            //cambia el ejecutar a prepared statement
            //llama a la conexion "connection"
            //llama al atributo String "consultaSQL"
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            //Dar clic en el play "ejecuta la consulta"
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("LA PERSONA HA SIDO CREADA CON EXITO");
                //las consultas simpre se cierran
                ejecutar.close();
            }else{
                System.out.println("Ingrese los datos solicitados correctamente");
                ejecutar.close();
            }
        } catch (Exception e) {
            //captura el error y permite que la consola siga ejecuntadose
            //Ejecutando
            System.out.println("ERROR:"+e);//"+e"Captura el error a nivel de base de datos
        }
 
    }
}
