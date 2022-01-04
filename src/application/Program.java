package application;
import java.sql.Connection;
import db.DB;
import model.entities.Department;

public class Program {

    public static void main(String[] args) {

        /*Connection conn = null;
        DB.closeConnection();
        System.out.println("Successfully Connection!!");
         */

        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }
}