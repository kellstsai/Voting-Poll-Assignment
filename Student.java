import java.util.*; 

public class Student {
    private String identification;
    private String answer;

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

    public String toString() {
        return "Student ID is " + identification + " Student answer is " + answer; 
    }

   /*   public void randomizedStudentAnswer(int typeOfQuestion, int numberOfChoices) {
        if(typeOfQuestion == 1) {
            this.answer = multipleChoiceQuestions(numberOfChoices);
        }
        else if(typeOfQuestion == 0) {
            this.answer = singleChoiceQuestion(numberOfChoices); 
        }
    }
    

    protected String getRandomID(int IDLength) {
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random(); 
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int rand = r.nextInt(random.length()); 
            str.append(random.charAt(rand)); 

        }
        return str.toString(); 
        /*String responseChars = "ABCDEFGHIJKLMNOPQRSTUV1234567890"; 
        StringBuilder str = new StringBuilder(IDLength); 
        for(int i = 0; i < IDLength; i++) {
            double ch = responseChars.length() * Math.random(); 
            int cha = (int)(ch); 
            str.append(responseChars.charAt(cha)); 
        }
        return str.toString(); 

        /*while (response.length() < IDLength) {
            int index = (r.nextInt() * responseChars.length());
            response.append(responseChars.charAt(index)); 
        }
        String responseStr = response.toString(); 
        return responseStr;
        */ 
    }

    
   /* public String singleChoiceQuestion(int numberOfChoices) {
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

    /*  public String multipleChoiceQuestions(int numberOfChoices) {
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
     */







