package group_12;

import java.sql.*;
public class DatabaseConnection {
    
    private Connection myDBCon;
    private Statement st;

    public DatabaseConnection() {
        
    }

    public void connectDB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find classoracle.jdbc.driver.OracleDriver");
            System.exit(1);
        }
        try {
            myDBCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "1234");
            st = myDBCon.createStatement();
            System.out.println("Connected success");
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }
     public void setSt(Statement st){
        this.st = st;
        
    }
      public void setmyDBCon(Connection myDBCon){
        this.myDBCon = myDBCon;
        
    }
       public Connection getmyDBCon(){
        return myDBCon;
        
    }
          public Statement getSt(){
        return st;
        
    }
       
     
     
}
