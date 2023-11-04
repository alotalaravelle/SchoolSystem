package schoolmainclass;
class Student {

    
private String firstName;
private String lastName;
private String studentID;
private double grades;

public Student(String fname, String lname, String sid, double marks) {
    this.firstName = fname;
    this.lastName = lname;
    this.studentID = sid;
    this.grades = marks;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getStudentID() {
    return studentID;
}

public double getGrades() {
    return grades;
}
}