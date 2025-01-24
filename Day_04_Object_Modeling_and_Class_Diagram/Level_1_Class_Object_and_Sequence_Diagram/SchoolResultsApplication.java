// Creating Subject class to store and display subject names and marks
class Subject 
{
    // Creating attribute of the class
    String subjectName;
    int subjectMarks;

    // Creating Constructor of the class
    public Subject(String subjectName, int subjectMarks) 
	{
        this.subjectName = subjectName;
        this.subjectMarks = subjectMarks;
    }
  
    // Method to get subject name
    public String getSubjectsName() 
	{
        return subjectName;
    }
	
	// Method to get subject Marks
    public int getSubjectsMarks() 
	{
        return subjectMarks;
    }
}

// Creating Student class to store and display student name and their subject
class Student 
{
    // Creating attribute of the class
    String studentName;
    Subject[] studentSubjects;
    
	// Creating Constructor of the class
    public Student(String studentName, Subject[] studentSubjects) 
	{
        this.studentName = studentName;
        this.studentSubjects = studentSubjects;
    }
    
	// Method to get student name
    public String getStudentName() 
	{
        return studentName;
    }
    
	// Method to get Subjects
    public Subject[] getSubjects() 
	{
        return studentSubjects;
    }
}

// Creating GradeCalculator class to calculate Grade of the student
class GradeCalculator 
{
    // Methode to calculate Grade of the student
    public String calculateGrade(Student student) 
	{
        int totalMarks = 0;
        int numberOfSubjects = student.getSubjects().length;
		
        for (Subject subject : student.getSubjects()) 
		{
            totalMarks = totalMarks + subject.getSubjectsMarks();
        }
		
		// Calculating average Marks of the student
        int averageMarks = totalMarks / numberOfSubjects;
        if (averageMarks >= 80) 
		{
            return "A";
        } 
		else if (averageMarks >= 55) 
		{
            return "B";
        } 
		else if (averageMarks >= 35) 
		{
            return "C";
        } 
		else 
		{
            return "F";
        }
    }
}
// Creating Main class
public class SchoolResultsApplication 
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating array object of student class
        Subject[] subjects = { new Subject("Maths", 90), new Subject("Science", 85) };

        // Creating object of Student class
        Student student = new Student("John", subjects);

        // Creating object of GradeCalculator class
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student);

        // Displaying the result
        System.out.println("Student name is " + student.getStudentName());
		System.out.println("Student grade is " + grade);
    }
}
