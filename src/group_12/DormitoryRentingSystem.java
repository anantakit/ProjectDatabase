package group_12;
import java.sql.*;
public class DormitoryRentingSystem {
  public static DatabaseConnection db = new DatabaseConnection();
  public static DatabaseData my;
    public static void main(String[] args) {
         db.connectDB();
         my = new DatabaseData(db.getSt());
        userLogin login = new userLogin();
       login.setVisible(true);
       //menu m = new menu();
       //m.setVisible(true);
    }
}
