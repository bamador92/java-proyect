//conexion de base de datos en xampp, me trajo con exito los datos que le pedi.

import java.sql.*;

public class ConectaBasePrueba {
    public static void main(String[] args) {
        try{
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp1","root", "");
            Statement miStatement = miConexion.createStatement();
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM usuarios");
            while(miResultSet.next()){
                System.out.println(miResultSet.getString("Nombre") + " " + miResultSet.getString("Apellido"));
            }
        }catch (Exception e){
            System.out.println("No hay acceso a la base de datos"); e.printStackTrace();
        }
    }
}
