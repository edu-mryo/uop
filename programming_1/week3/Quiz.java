
/**
 * Quiz
 */

import javax.swing.JOptionPane;

// The new version using metho / function
public class Quiz {

    static int nQuestions = 0;
    static int nCorrect = 0;

    static void check(String question, String correctAnswer) {
        nQuestions++;
        String answer = ask(question);
        // System.out.println(answer.equals(correctAnswer)); //for testing purpose

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }

    };

    static String ask(String question) {

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

    };

    // Previous Quiz.java code

    public static void main(String[] args) {

        String question = "What is the tallest building in the world ? \n";
        question += "A. Mt.Fuji\n";
        question += "B. The Empire State Building\n";
        question += "C. Burj Khalifa\n";
        question += "D. Shanghai Tower\n";
        question += "E. Hogwarts School\n";

        // check(answer,'C');
        check(question, "C");

        question = "What is the capital of Japan ? \n";
        question += "A. Tokyo\n";
        question += "B. New York\n";
        question += "C. London\n";
        question += "D. Hong Kong\n";
        question += "E. Moscow\n";
        check(question, "A");

        question = "Who is the current CEO of Alphabet/Google Inc? \n";
        question += "A. My neighbor Charlie\n";
        question += "B. Borris Johnson\n";
        question += "C. Pikachu\n";
        question += "D. Brad Pitt\n";
        question += "E. Sundar Pichai\n";
        check(question, "E");

        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");

    }

}