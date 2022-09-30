import java.util.*; 

public class SimulationDriver {

    public static void main (String[] args) {
        Question first = new Question(5, "What animal do you want as a pet? A) Dog B) Cat C) Bird D) Snake E) Rabbit", 0); 
        Question second = new Question(5, "Which of the following foods do you like? Choose all that apply.", 1);

        ArrayList<String> storeAnswer = new ArrayList<String>();    //stores all answers

        VotingService vs = new VotingService(first.getType(), first.getNumberOfChoices(), storeAnswer); 

        System.out.println(first); 
        
        Student firstStudent = new Student(first.getRandomID(5), first.singleChoiceQuestion(first.getNumberOfChoices()));
        Student secondStudent = new Student(first.getRandomID(5), first.singleChoiceQuestion(first.getNumberOfChoices()));
        Student thirdStudent = new Student(first.getRandomID(5), first.singleChoiceQuestion(first.getNumberOfChoices()));
        Student fourthStudent = new Student(first.getRandomID(5), first.singleChoiceQuestion(first.getNumberOfChoices()));
        Student fifthStudent = new Student(first.getRandomID(5), first.singleChoiceQuestion(first.getNumberOfChoices()));
        System.out.println(firstStudent); 
        System.out.println(secondStudent); 
        System.out.println(thirdStudent); 
        System.out.println(fourthStudent); 
        System.out.println(fifthStudent); 

        storeAnswer.add(firstStudent.getAnswer());
        storeAnswer.add(secondStudent.getAnswer());
        storeAnswer.add(thirdStudent.getAnswer());
        storeAnswer.add(fourthStudent.getAnswer());
        storeAnswer.add(fifthStudent.getAnswer());

        vs.answerTrack(storeAnswer);

        storeAnswer.clear();

        firstStudent.setAnswer(second.multipleChoiceQuestions(second.getNumberOfChoices()));
        secondStudent.setAnswer(second.multipleChoiceQuestions(second.getNumberOfChoices()));
        thirdStudent.setAnswer(second.multipleChoiceQuestions(second.getNumberOfChoices()));
        fourthStudent.setAnswer(second.multipleChoiceQuestions(second.getNumberOfChoices()));
        fifthStudent.setAnswer(second.multipleChoiceQuestions(second.getNumberOfChoices()));

        System.out.println(firstStudent);
        System.out.println(secondStudent);
        System.out.println(thirdStudent);
        System.out.println(fourthStudent);
        System.out.println(fifthStudent);

        storeAnswer.add(firstStudent.getAnswer());
        storeAnswer.add(secondStudent.getAnswer());
        storeAnswer.add(thirdStudent.getAnswer());
        storeAnswer.add(fourthStudent.getAnswer());
        storeAnswer.add(fifthStudent.getAnswer());

        vs.answerTrack(storeAnswer);

        

    }
    
}
