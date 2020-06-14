package Tree;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        Set<Student> x = new TreeSet((Comparator) new StudentComparator());
        x.add(new Student(1,"A"));
        x.add(new Student(2,"B"));
        x.add(new Student(3,"C"));
        x.add(new Student(4,"D"));
        x.add(new Student(5,"e"));
        x.add(new Student(6,"F"));
        x.add(new Student(7,"G"));
        x.add(new Student(8,"H"));
        System.out.println(x);
        Student st = new Student(3, "C");
        System.out.println(x.contains(st));
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo((s2.getName()));
    }
}

class Student implements Comparable<Student>{
    private int id;
    private String name;

    @Override
    public int compareTo(Student student) {
        return this.id - student.id + this.name.compareTo(student.name);
    } 

    public Student(int id,String name){
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
