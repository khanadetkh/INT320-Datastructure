/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author INT303
 */
public class TestSetAndMap {

    public static void main(String[] args) {
        
        Set<Student> students = new TreeSet();
        students.add(new Student(1001, "Somchai", 3.59));
        students.add(new Student(1002, "Somchart", 3.09));
        students.add(new Student(1003, "Somsri", 2.59));
        students.add(new Student(1004, "Somsuk", 2.09));
        students.add(new Student(1005, "Somkiat", 2.99));
        //Printปกติ
        System.out.println(students);
        //*fn Porg.
        students.forEach(System.out::println);
    }
}
    class StudentComparatorByName implements Comparator <Student> {
        @Override
        public int  compare (Student s1, Student s2) {
            return - s1.getName().compareTo(s2.getName());
        }
    }
    class Student implements Comparable<Student>{

        @Override
        public String toString() {
            return "Student :" + "id :" + id + ", name :" + name + ", gpax:" + gpax ;
        }

        private int id;
        private String name;
        private double gpax;

        public Student(int id, String name, double gpax) {
            this.id = id;
            this.name = name;
            this.gpax = gpax;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGpax() {
            return gpax;
        }

        public void setGpax(double gpax) {
            this.gpax = gpax;
        }

    @Override //ใช้เทียบว่าจะไปทางไหนดี?
    public int compareTo(Student student) {
        return this.id - student.id;
    }

    }

