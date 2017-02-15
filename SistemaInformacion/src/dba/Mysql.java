/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import java.sql.*;
import javax.swing.*;

public class Mysql{
    Connection con = null;
    public Connection conexion(){
        try {
            //Cargar el Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@//oracle0.ugr.es:1521/practbd.oracle0.ugr.es", "x5958777","x5958777");
            //System.out.println("Conexion establecida");
            JOptionPane.showMessageDialog(null, "Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion "+e);
        }
        return con;
    }
}
