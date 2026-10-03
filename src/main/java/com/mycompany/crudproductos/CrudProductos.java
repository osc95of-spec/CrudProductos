/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crudproductos;

/**
 *
 * @author PC-04
 */
public class CrudProductos {

    public static void main(String[] args) {
        try (java.sql.Connection cn = Conexion.conectar()) {
    System.out.println("--- CONEXIÓN EXITOSA CON TIENDA_SENATI ---");
} catch (java.sql.SQLException e) {
    System.out.println("--- ERROR DE CONEXIÓN: " + e.getMessage());
}

    }
}
