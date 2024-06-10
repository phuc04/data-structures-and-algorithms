/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author hoang
 */
public class main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Adding students
        manager.addStudent(new Student("1", "Alice", 20, 8.55f));
        manager.addStudent(new Student("2", "Bob", 22, 9.00f));
        manager.addStudent(new Student("3", "Charlie", 21, 7.83f));

        // Displaying all students
        System.out.println("All Students:");
        manager.displayAllStudents();
        
        // Displaying all student with rank
        System.out.println("All Students with rank:");
        manager.displayAllStudentsWithRanks();
        
        // Getting a student by ID
        System.out.println("Getting student with ID 2:");
        Student student = manager.getStudent("2");
        System.out.println(student );
           
        // Editing a student's information
        System.out.println("Edit student with ID 1:");
        manager.editStudent("1", "Alice Smith", 21, 8.70f);

        // Displaying all students after editing
        System.out.println("All Students after editing:");
        manager.displayAllStudents();
        
        // Sorting students by score
        System.out.println("Sorting student by score: ");
        manager.sortStudentsByScore();
        manager.displayAllStudents();
        
        // Removing a student by ID
        System.out.println("Delete student with ID 2:");
        manager.removeStudent("2");

        // Displaying all students after removal
        System.out.println("All Students after removal:");
        manager.displayAllStudents();
        
          // Searching for students by name
        System.out.println("Search results for name 'Alice Smith':");
        for (Student searchbyname : manager.searchStudentsByName("Alice Smith")) {
            System.out.println(searchbyname);
            
        }
    }
}
