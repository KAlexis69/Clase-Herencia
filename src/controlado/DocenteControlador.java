/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlado;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import modelo.Docente;

public class DocenteControlador {
    private Docente docente;
    
    //Conexion
    Conexion conexion = new Conexion();
    Connection connection = (Connection)conexion.conectar();
    //ejecutar consulta
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearDocente(Docente doc){
        try {
            String consultaSQL = "INSERT INTO docentes (especialidad, titulo, resgistroSenescyt, escalaSalarial, idpersona) VALUES ('" + doc.getEspecialidad() + "','" + doc.getTitulo() + "','" + doc.getRegistroSenescyt() + "','" + doc.getEscalaSalarial() + "','" + doc.getIdPersona() + "');";
            PreparedStatement ejecutar = (PreparedStatement)connection.prepareCall(consultaSQL);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                System.out.println("El Docente fue agregado con éxito");
            } else {
                System.out.println("Ingrese los datos de manera correcta");
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el Admin del Sistema para que resuelva este error: " + e);
        }
    }
}
