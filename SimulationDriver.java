import java.util.*; 

public class SimulationDriver {

    public static void main (String[] args) {
        Question first = new Question(5, "Do you prefer dogs or cats?", 0); 

        ArrayList<String> storeAnswer = new ArrayList<String>();

        VotingService vs = new VotingService(first.getType(), first.getNumberOfChoices(), storeAnswer); 

        System.out.println(first); 

        Student s0 = new Student(10, first.getType(), first.getNumberOfChoices());
        Student s1 = new Student(10, first.getType(), first.getNumberOfChoices());
        System.out.println(s0); 
        System.out.println(s1); 

        storeAnswer.add(s0.getAnswer());
        storeAnswer.add(s1.getAnswer());

        vs.answerTrack(storeAnswer);



    }
    
}
