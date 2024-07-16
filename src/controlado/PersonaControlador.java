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
 * @author Usuario
 */
public class PersonaControlador {

    //ATRIBUTOS
    //modelo
    private Persona persona;
    //conexión
    Conexion conexion = new Conexion();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//CONSULTAMOS O LEEMOS LA BDD

    //INSERTAR FILAS EN UNA TABLA
    public void crearPersona(Persona p) {
        try {//exception que lanza la consulta
            //String estático-> dinámicos que son los gets
            String consultaSQL = "INSERT INTO persona(nombres,apellidos,cedula,usuario,clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono)VALUES ('" + p.getNombre() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "','" + p.getDireccion() + "','" + p.getCorreoElectronico() + "','" + p.getSexo() + "','" + p.getFechaNacimiento() + "'," + p.getTelefono() + ");";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            //dar clic en el play =>ejecutar la consulta
            int res = ejecutar.executeUpdate();//INT CUANDO ESCRIBO INSERTO LA BDD
            if (res > 0) {
                System.out.println("La persona ha sido creada con éxito");
                ejecutar.close();
            } else {
                System.out.println("Favor ingrese correctamente los datos solicitados");
                ejecutar.close();
            }

        } catch (Exception e) {
            //captura el error y permite que la consola se siga
            //ejecutando
            System.out.println("ERROR:"+e);
        }
    }
    
    
    public int buscarIdPersona(String cedula){
        try {
            String consultaSQL="SELECT idpersona FROM persona WHERE cedula='"+cedula+"';";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            resultado=ejecutar.executeQuery();
            if(resultado.next()){
                int idPersona=resultado.getInt("idpersona");
                return idPersona;
            }else{
                System.out.println("Ingrese una cédula válida");
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador"+e);
        }
        return 0;
    
    }
}