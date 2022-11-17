/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import ResultSet.ResultSEt;
import com.mysql.jdbc.BlobFromLocator;

import java.sql.Connection;
import java.sql.DrivermANAGER;
import java.sql.PreparedStatement;

* @author keila

* public class connectionfactory {
    
      public static final String DRIVER = "com.mysql.jdbc";
      public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
      public static final String USER = "root";
      public static final String PASS = "";

         public static Connection getConnection() {
           try {
              Class.forName(DRIVER);
              return DriverManager.getConnection(URL,USER,PASS);
          } catch (Exception ex) {
               thron new RuntimeException("Erro na conexão com banco de dados", ex);
         
          }
      }        
      public static void  closeConnection(Connection connection);  
           try {
               if (connection != null) {
                   connnection.close();

               catch (Exception ex) {
                   thron new RuntimeException("Erro ao fechar a conexão com banco de dados", ex);}

        }
           }
      Public  static void closeConnection(Connection connection, PreparedStatement statement, ResultSEt resultSet) {
            try {
                if (connection != null) {
                    connection.close();
        }
                if (statement != null) {
                    statement.close();

                if(resultSet != null) {
                    result.close();
                }

        }     catch (Exception ex) {
                   thron new RuntimeException("Erro ao fechar a conexão com banco de dados", ex);


        }
        }

        }
