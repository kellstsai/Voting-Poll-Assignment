import java.io.StreamCorruptedException;
import java.util.*;

public class Question {
    private int numberOfChoices; 
    private String actualQuestion; 
    int type; 

    public Question(int numberOfChoices, String actualQuestion, int type) { 
        this.numberOfChoices = numberOfChoices;
        this.actualQuestion = actualQuestion; 
        this.type = type; 
    }

    public void setQuestion(String actualQuestion) {
        this.actualQuestion = actualQuestion; 
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices; 
    }

    public void setType(int type) {
        this.type = type; 
    }

    public String getQuestion() {
        return actualQuestion; 
    }

    public int getNumberOfChoices() {
        return numberOfChoices; 
    }

    public int getType() {
        return type; 
    }

    public String toString() {
        return "The question is: " + this.actualQuestion + "\nWith number of choices: " + this.numberOfChoices + " and type:" + this.type; 
    }

    public String questionChoice(int typeOfQuestion) {
        int a = 64; 
        numberOfChoices += a; 

        if(typeOfQuestion == 1) {
            return "Please choose all the options that apply: \n" + this.actualQuestion; 
        }
        else if(typeOfQuestion == 0) {
            return "Please choose one option: \n" + this.actualQuestion; 
        }
        else{
            return "That is an invalid option."; 
        }
    }
}

   
