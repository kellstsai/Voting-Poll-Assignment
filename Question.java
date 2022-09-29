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

    public String singleChoiceQuestion(int numberOfChoices) {
        Random r = new Random(); 
        char[] letterChoices = {'A', 'B', 'C', 'D', 'E'}; 

        char output = (char)(r.nextInt(numberOfChoices) + 'A');
        String output2 = Character.toString(output); 
        return output2; 
     }
      /*  Random r = new Random(); 
        char c = (char)(r.nextInt(numberOfChoices + 'A')); 
        String string = Character.toString(c); 
        return string; 
*/

     public String multipleChoiceQuestions(int numberOfChoices) {
        Set<Character> hs = new LinkedHashSet<Character>(); 
        Random r = new Random(); 
        StringBuilder sb = new StringBuilder(); 
        StringBuilder strbuild = new StringBuilder(); 
        char[] letterChoices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'}; 
        int numberOfTimes = r.nextInt(numberOfChoices - 1) + 1; 
        for(int i = 0; i < numberOfTimes + 1; i++) {
            //System.out.print("i wanna die" + numberOfChoices); 
            char output = letterChoices[r.nextInt(numberOfTimes)];
            hs.add(output);
            //System.out.print("HELLLOOOOO" + output); 
            String string = Character.toString(output); 
            strbuild.append(string); 
        }

        String answer = strbuild.toString(); 
        char[] secondArray = answer.toCharArray(); 
        for(char output : secondArray) {
            hs.add(output);  
            //System.out.print("BITCHHHH" + output); 
        }
        for(Character character : hs) {
            sb.append(character); 
        }
        answer = sb.toString(); 
        return answer;
        
     } 

     /*public void randomizedStudentAnswer(int typeOfQuestion, int numberOfChoices) {
        if(typeOfQuestion == 1) {
            this.answer = multipleChoiceQuestions(numberOfChoices);
        }
        else if(typeOfQuestion == 0) {
            this.answer = singleChoiceQuestion(numberOfChoices); 
        }
    }
    */

    public String getRandomID(int IDLength) {
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random(); 
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int rand = r.nextInt(random.length()); 
            str.append(random.charAt(rand)); 

        }
        return str.toString(); 

}
}
   
