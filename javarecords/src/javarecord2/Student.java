package javarecord2;
import java.util.List;
import java.io.FileInputStream;

public record Student(String name, int id, List<Integer> grades) {
    public double getAverageGrade() {
        if (grades.isEmpty()) {
        
            return 0;
    }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    
    public boolean hasPassingGrade() {
   
        for (int grade : grades) {
            if (grade >= 60) {
                return true;
            }
        }
        return false;
    }
}
//In this example, the Student record has three components: a name (a String), an id (an int), and a list of grades (a List of Integer objects). The record also defines two methods: getAverageGrade() and hasPassingGrade().
//
//The getAverageGrade() method calculates the average grade of the student based on the grades in their list. If the list is empty, it returns 0.
//
//The hasPassingGrade() method checks if the student has a passing grade (60 or higher) in any of their courses. If they do, it returns true. If not, it returns false.
//
//With this record, you can create new Student objects like this:
//
//java
//Copy code

