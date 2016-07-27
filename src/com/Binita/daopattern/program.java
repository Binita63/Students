/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Binita.daopattern;

import com.Binita.daopattern.impl.StudentDAOImpl;
import com.Binita.entry.entity.Student;
import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StudentDAO studentsDAO = new StudentDAOImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.insert student");

            System.out.println("2.update student");
            System.out.println("3.delete student");
            System.out.println("4.show all");
            System.out.println("5.search by id");
            System.out.println("6.exit");
            System.out.println("enter your choice from [1-6]");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("insert student");
                    Student s = new Student();
                    System.out.println("enter id");
                    s.setId(sc.nextInt());
                    System.out.println("enter name");
                    s.setName(sc.next());
                    System.out.println("enter address");
                    s.setAddress(sc.next());
                    System.out.println("enter level");
                    s.setLevel(sc.next());
                    System.out.println("enter contact_no");
                    s.setContactno(sc.next());
                    System.out.println("enter status");
                    s.setStatus(sc.nextBoolean());

                    if (studentsDAO.insert(s)) {
                        System.out.println("inserted successfully");
                    } else {
                        System.out.println("data full");

                    }
                    break;
                case 2: {

                }
                case 3: {
                    System.out.println("select id which u want to delete");
                    int id = sc.nextInt();
                    if (studentsDAO.delete(id)) {
                        System.out.println("deleted succesfully");
                    }
                    break;

                }
                case 4: {

                    System.out.println("list of students");
                    Student[] students = studentsDAO.getAll();
                    for (int i = 0; i < students.length; i++) {
                        Student student = students[i];
                        if (student != null) {
                            System.out.println("id" + student.getId());
                            System.out.println("name" + student.getName());
                            System.out.println("level" + student.getLevel());
                            System.out.println("address" + student.getAddress());
                            System.out.println("contact_no" + student.getContactno());

                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("enter id whic you want to search?");
                    int id = sc.nextInt();
                    Student students = studentsDAO.getById(id);

                    Student student = students;
                    if (student != null) {
                        System.out.println("searched data");
                        System.out.println("id" + student.getId());
                        System.out.println("name" + student.getName());
                        System.out.println("level" + student.getLevel());
                        System.out.println("address" + student.getAddress());
                        System.out.println("contact_no" + student.getContactno());

                    }

                    break;
                }
                case 6: {
                    System.out.println("Do you want to exit?[Y/N]");
                    if (sc.next().equalsIgnoreCase("Y")) {
                        System.exit(0);

                    }
                }
            }
        }

    }

}
