
import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(null, question);
            answer = answer.toUpperCase();
            switch (answer) {
                case "F","FALSE", "N", "NO" -> {

                    return "FALSE";
                }
                case "T", "TRUE", "Y", "YES" -> {

                    return "TRUE";
                }
                default -> JOptionPane.showConfirmDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            }

        }

    }

    public TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE " + question;
        this.correctAnswer = answer;
    };

};
