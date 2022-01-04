package application;
import java.sql.Connection;
import java.util.Date;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        /*Connection conn = null;
        DB.closeConnection();
        System.out.println("Successfully Connection!!");
         */
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date, 3000.00, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}