package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       List<Department> list = new ArrayList<>();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");

        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("=== TEST 2: department findAll ===");
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==== TEST 3: seller Insert ====");
        Department newDepartament = new Department(0, "Esporte");
        departmentDao.insert(newDepartament);
        System.out.println("Inserted! New id = " + newDepartament.getId());
        sc.close();

        System.out.println("\n==== TEST 4: department update ====");
        department = departmentDao.findById(6);
        department.setName("Brinquedos");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n==== TEST 5: department delete ====");
        System.out.println("Enter id for delete test");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
    }
}
