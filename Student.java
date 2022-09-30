import java.util.*; 

public class Student {
    private String identification;
    private String answer;

    //getters and setters for the Student class below

    public Student(String lengthOfID, String answer) {
        this.identification = lengthOfID; 
        this.answer = answer; 
    }

    public void setIdentification(String identification) {
        this.identification = identification; 
    }

    public String getIdentification() {
        return this.identification; 
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer; 
    }

    public String toString() {  //this will return the student's ID and their answer choice when the method toString is called
        return "Student ID is " + identification + " Student answer is " + answer; 
    }
}

  







