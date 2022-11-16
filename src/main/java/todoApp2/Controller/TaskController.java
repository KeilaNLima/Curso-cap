/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoApp2.Controller;

import todoApp2.model.Task;

import java.sql.ResultSet;
import java.sql.connection;
import java.sql.preparedStatemente;
import java.sql.SQLException;
import java.util.List;
import java.model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.ConnectionFactory

        
/* @author keila
 */
public class TaskController {
  
    public void seve(Task task){ 
         
       String sql = "INSERT INTO tasks(idprojects"
               
              + "name,"
              + "discription,"
              + "complited,"
              + "notes,"
              + "deadline,"
              + "createdAt,"
              + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
       
       Connection connection = null;
       PreparedStatement statement = null;  
               
         try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getidproject());
            statement.setstring(2, task.getname());
            statement.setstring(3, task.getdiscription());
            statement.setbooleano(4, task.isiscomplited());
            statement.setstring(5, task.getnotes());
            statement.set Date(6,new Date)
          
        
        
        
        
        
        
    }
    
    public void update(Task task){
    
    }
    public void removeByid(int taskId) {
       String sql = " DELETE FROM tasks WHERE id = ?" ;   
    
       Connection conn = null;
       PreparedStatement  statement = null;
       
      try {
         
          conn = connectoryFactory.getconnection ();
          statemente = conn preparestatemente(sql);
          statement.setint(1, taskId);
          statement.execute();
      } catch (SQLException e) {
            throw new SQLException("erro ao deletar a tarefa");
              
      } finally 
         ConnectionFactory.closeConnection(conn);   
                
      }
    } 
    
    public List<Task> getAll(int Idproject) {

        string sql = "SELET " * FROM tasks WHERE idProject =?;

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null

         list<Task> tasks = new
    }

    
    
    
}

