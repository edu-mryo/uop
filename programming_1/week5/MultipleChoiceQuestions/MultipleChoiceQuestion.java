
/**
 * MultipleChoiceQuestion
 */
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {


    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {

        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";

        correctAnswer = answer.toUpperCase();

    

    }
    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(null, question);
            answer = answer.toUpperCase();
            switch (answer) {
                case "A", "B", "C", "D", "E" -> {
                    return answer;
                }
                default -> JOptionPane.showConfirmDialog(null, "Invalid Answer: Please enter A,B,C,D or E.");
            }

        }

    }

    

}