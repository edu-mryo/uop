import javax.swing.JOptionPane;

/**
 * Question
 */

public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    public void check() {
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

    public static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");
    };

    abstract String ask();
}