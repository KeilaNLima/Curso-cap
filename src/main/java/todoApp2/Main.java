/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoApp2;

/**
 *
 * @author keila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Connection c = ConnectionFactory.getConnectory();
       
        ConnectionFactory.closeConnectoru(c);

    }
    
}
