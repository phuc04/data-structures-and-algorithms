/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hoang
 */
public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to remove a student by ID
    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    // Method to get a student by ID
    public Student getStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
     public String getStudentRank(float score) {
        if (score >= 0 && score < 5.0) {
            return "Fail";
        } else if (score >= 5.0 && score < 6.5) {
            return "Medium";
        } else if (score >= 6.5 && score < 7.5) {
            return "Good";
        } else if (score >= 7.5 && score < 9.0) {
            return "Very Good";
        } else if (score >= 9.0 && score <= 10.0) {
            return "Excellent";
        } else {
            return "Invalid score";
        }
    }
    public void displayAllStudentsWithRanks() {
        for (Student student : students) {
            String rank = getStudentRank(student.getScore());
            System.out.println(student + ", Rank='" + rank + "'");
        }
    }
    // Method to get all students
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    // Method to display all students
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
     public void editStudent(String id, String name, int age, float score) {
        Student student = getStudent(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            student.setScore(score);
        }
    }
      public List<Student> searchStudentsByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }
        public void sortStudentsByScore() {
        students.sort(Comparator.comparingDouble(Student::getScore));
    }
        
}
