import java.util.*; 
import java.util.stream.Collectors; 

public class VotingService {
    private int numberOfChoices;
    private int typeOfQuestion;
    private ArrayList<String> test; 

    public VotingService(int typeOfQuestion, int numberOfChoices, ArrayList<String> test) {
        this.typeOfQuestion = typeOfQuestion; 
        this.numberOfChoices = numberOfChoices;
        this.test = test;
    }

    public int getTypeOfQuestion() {
        return typeOfQuestion; 
    }

    public int getNumberOfChoices() {
        return numberOfChoices;
    }

    public ArrayList<String> getTest() {
        return test; 
    }

    public void setTypeOfQuestion(int questionType) {
        this.typeOfQuestion = questionType;
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices; 
    }

    public void setTest(ArrayList<String> test) {
        this.test = test; 
    }

    //converts the ArrayList<String> into a string
    private String printAnswer(ArrayList<String> inputArray) {
        String ListToString = inputArray.stream().map(Object::toString).collect(Collectors.joining("")); 
        return ListToString;
    }

    //this method uses a HashMap to keep track of the student answers so we can print out all the results at the end 
    public void answerTrack(ArrayList<String> inputArray) {
        String finalAnswer = printAnswer(inputArray);
        HashMap<Character, Integer> charCount = new HashMap<Character,Integer>(); 
        char[] stringArray = finalAnswer.toCharArray(); 

        //if our intended character is in the array, we will increment and continue; else we will return 1
        for(char c : stringArray) {
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1); 
            }
            else {
                charCount.put(c, 1); 
            }
        }

        for(Map.Entry entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        }


    }
}
