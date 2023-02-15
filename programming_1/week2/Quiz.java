
/**
 * Quiz
 */

import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {

        // for(int i =1;i<10;i++){
        //     System.out.println("Hello");
        // }



        String question = "What is the tallest building in the world ? \n";
        question += "A. Mt.Fuji\n";
        question += "B. The Empire State Building\n";
        question += "C. Burj Khalifa\n";
        question += "D. Shanghai Tower\n";
        question += "E. Hogwarts School\n";

        while (true) {
            String answer = JOptionPane.showInputDialog(null, question);
            answer = answer.toUpperCase();
            switch (answer) {
                case "A", "B", "D", "E" -> JOptionPane.showMessageDialog(null, "Incorrect");
                case "C" -> {
                    JOptionPane.showMessageDialog(null, "Correct!");
                    return;
                }
                default -> JOptionPane.showConfirmDialog(null, "Invalid Answer: Please enter A,B,C,D or E.");
            }

        }

    }

}