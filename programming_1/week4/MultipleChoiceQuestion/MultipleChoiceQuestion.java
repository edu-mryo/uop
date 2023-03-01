
/**
 * MultipleChoiceQuestion
 */

package MultipleChoiceQuestion;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {

    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

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

    void check() {
        nQuestions++;
        String answer = ask();
        // System.out.println(answer.equals(correctAnswer)); //for testing purpose

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }

    };

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");

    }

    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {

        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";

        correctAnswer = answer.toUpperCase();

    }

}