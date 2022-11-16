/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DrivermANAGER;

* @author keila

* public class connectionfactory {
    
      public static final String DRIVER = "com.mysql.jdbc";
      public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
      public static final String USER = "root";
      public static final String PASS = "";

         public static connection getconnection(){
           try{
              class.forName(DRIVER):
              return Drivermanager.getconnection(URL,USER,PASS):
          } catch new RuntimeException("Erro na coneão com banco de dados",ex);
         
          }
      }        
      public static void  closeConnection(Connection connection);  
           Try{
              if(Connection != null) {
                 connection.close();
                }
            }   
             cath(Exception ex) {
                throw new RuntimeException("Erro ao fechar a conexão com banco de dados",ex);