import java.io.StreamCorruptedException;
import java.util.*;

//getters and setters for the Question class
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

    public String toString() {  //will return the question, the number of choices available, and the type of question(multiple choice or single choice)
        return "The question is: " + this.actualQuestion + "\nWith number of choices: " + this.numberOfChoices + " and type:" + this.type; 
    }

    //method that shows what kind of questions are being asked (one answer vs multiple answers)
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

    //a method that returns a random choice; only allows one answer to be returned 
    public String singleChoiceQuestion(int numberOfChoices) {
        Random r = new Random(); //allows for random answers
        char[] letterChoices = {'A', 'B', 'C', 'D', 'E'}; //array of possible choices

        char output = (char)(r.nextInt(numberOfChoices) + 'A'); //takes a random integer and casts it to a character using ASCII 
        String output2 = Character.toString(output); //converts the char to a string
        return output2; 
     }

     //a method that allows the return of more than one answer choice
     /*
      * method allows us to randomly choose how many answers are returned as well as which answers are returned
      */
     public String multipleChoiceQuestions(int numberOfChoices) {
        Set<Character> hs = new LinkedHashSet<Character>();     //use a hashSet so we can make sure that there are no duplicate answers possible
        Random r = new Random(); 
        StringBuilder sb = new StringBuilder();     //takes a string of characters and condenses it into one singular string
        StringBuilder strbuild = new StringBuilder(); 
        char[] letterChoices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};     //array of possible choices
        int numberOfTimes = r.nextInt(numberOfChoices - 1) + 1; 
        for(int i = 0; i < numberOfTimes + 1; i++) {    
            char output = letterChoices[r.nextInt(numberOfTimes)];  //takes a random letter and casts it to type character
            hs.add(output); 
            String string = Character.toString(output); 
            strbuild.append(string); //appends into a single string
        }

        String answer = strbuild.toString(); 
        char[] secondArray = answer.toCharArray(); 

        //second array of characters added into a hashSet
        for(char output : secondArray) {
            hs.add(output);  
        }

        //appends into one singular string
        for(Character character : hs) {
            sb.append(character); 
        }

        answer = sb.toString(); 
        return answer;
        
     } 

     //a method to generate a random ID of length 10 for the student 
    public String getRandomID(int IDLength) {
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";   //I wanted to include every letter and number possible for more randomness
        Random r = new Random(); 
        StringBuilder str = new StringBuilder();    //allows to become into a string
        for (int i = 0; i < 10; i++) {
            int rand = r.nextInt(random.length());  //takes our string of random
            str.append(random.charAt(rand));        //appends into a string 

        }
        return str.toString(); 

}
}
   
