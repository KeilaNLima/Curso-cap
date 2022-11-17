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
import java.util.List;
import java.model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.ConnectionFactory

        
/* @author keila
 */
public class TaskController {
  
    public list<Task> save(Task task){
         
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
             statement = connection.prepareStatement(sql);
             statement.setInt(1, task.getidProject());
             statement.setstring(2, task.getName());
             statement.setstring(3, task.getDescription());
             statement.setbooleano(4, task.IsComplited());
             statement.setstring(5, task.getNotes());
             statement.set Date (6, new Date(task.getDeadline().getTime())):
             statement.set Date (7, new Date(task.getCreatedAt().getTime()));
             statement.set Date (8, new Date(task.getUpdate().getTime()));
             statement.execut();
         } catch (Exception ex) {
                   throw new RuntimeException("Erro ao salvar a terefa"
                     + ex.getMessage(), ex);

         } finally {
                 ConnectionFactory.closeConnection(connection, statement);
        
        
    }
    
    public void update(Task task) {
             String sql = "UPDATE tasks SET"
                 + "idProject = ?,"
                 + "Name = ?,"
                 + "Description = ?,"
                 + "Notes = ?,"
                 + "Completed = ?,"
                 + "Deadline = ?,"
                 + "CreatedAt = ?,"
                 + "UpdatedAt = ?,"
                 + "WHERE id = ?,"

            Connection connection = null;
            PreparedStatement statement = null;

            try {
                // Estabelecendo a conexão com bancos de dados
                connection = ConnectionFactory.getConnection();

                //Preparando a query
                statement = Connection.PreparedStatement(sql);

                // Setando os valores do statement
                statement.setInt(1, task.getidProject());
                statement.setString(2, task.getName());
                statement.setString(3, task.getDescription());
                statement.setInt(4, task.getNotes());
                statement.setBoolean(5, task.getIsCompleted());
                statement.setDate(6, new task.getDeadline());
                statement.setdate(7, new task.getCreatedAt());
                statement.setDate(8, new task.getUpdate());
                statement.setInt(9, task.getId());

                // Executando a query
                statement.execut();
            } catch (Exception ex) {
                throw new RuntimeException("Erro ao atualizar a tarefa"
                        + ex.getMessage(). ex);
              finally {
                  ConnectionFactore.closeConnection(connection, statement) {
                }

            }

        }
    public void removeByid(int taskId) thrws SQLException {
            String sql = " DELETE FROM tasks WHERE id = ?" ;
    
       Connection connection = null;
       PreparedStatement  statement = null;

      try {
          // Criação da conexão com bancos de dados
          connection = ConnectionFactory.getConnection ();

          // Preparando a query
          statemente = connection.prepareStatemente(sql);

          // Setando os valores
          statement.setInt(1, taskId);

          // Executando a query
          statement.execute();
      } catch Exception e) {
            throw new RuntimeException("erro ao deletar a tarefa"
                    + ex.getMessage(), ex);
              
      } finally 
         ConnectionFactory.closeConnection(connection, statement);
                
      }
    } 
    
    public List<Task> getAll(int Idproject) {

        string sql = "SELET " * FROM tasks WHERE idProject =?;

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null

         //Lista de tarefa que será devolvida quanndo a chamada do método acontecer.
         list<Task> tasks = new arrayLis<task>();

        try {
            //Criação da conexão
            connection =  connectionFactory.getConnection();
            statement = connection.preparedSttement(sql);

            //Setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);

            //Valor retornado pela execução da query
            resultSet = statement.executQuery();

            //Enquanto houverem valores a serem  percorridos no meu resultSet
            while(resultSet. next()) {

                Task task = new Task();

                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idproject"));
                task.setStringName(resultSet.getString("name"));
                task.setStringDescription(resulSet.getString("description"));
                task.setIntNotas(resultSet.getInt("notas"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdate(resultSet.getDate("update"));
                task.add(task);

            } catch (EXception ex) {
                  thron new RuntimeException("Erro ao inserir a tarefa" + ex.getMessage(), ex);
              finally
                connectionFactory.closeConnection(conncetiom, statement, resultSet);
            }
            // lista de tarefa que foi criada e carregada do banco de dados
            return tasks;
        }
    }

    
    
    
}

