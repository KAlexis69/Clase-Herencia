/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlado;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import modelo.Estudiante;
/**
 *
 * @author DELL
 */
public class EstudianteControlador {
    private Estudiante estudiante;
    
    //Conexion
    Conexion conexion=new Conexion();
    Connection connection=(Connection)conexion.conectar();
    //ejecutar consulta
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearEstidiante(Estudiante es){
        try {
            String consultaSQL="INSERT INTO estudiantes (numeroMatricula,jornada,idpersona) VALUES ('"+es.getNumeroMatricula()+"','"+es.getJornada()+"',"+es.getIdPersona()+");";
            PreparedStatement ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            int resultado=ejecutar.executeUpdate();
            if(resultado>0){
                System.out.println("El estudiante fue creado con exito");
            }else{
                System.out.println("Ingrese los datos de manera correcta");
            }
        } catch (Exception e) {
            System.out.println("Comuniquese con el admin para que el le resuelva el problema"+e);
        }
    }

    public void crearEstudiante(Estudiante est) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
