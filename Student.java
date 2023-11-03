package schoolmainclass;
class Student {
    private String FirstName;
    private String LastName;
    private String StudentID;
    private double Grades;
    
public Student(String FirstName, String LastName, String StudentID, double Grades){
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.StudentID = StudentID;
    this.Grades = Grades;
}

    
    public String getFirstName(){
        return FirstName;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public String getStudentID(){
        return StudentID;
    }
    
    public double getGrades(){
     return Grades;
    }

}