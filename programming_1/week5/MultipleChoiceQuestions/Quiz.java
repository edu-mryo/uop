/**
 * Quiz
 */

// The new version using metho / function
public class Quiz {

        // Previous Quiz.java code

        public static void main(String[] args) {
                Question question = new MultipleChoiceQuestion(
                                "What is the meaning of life in the book 'Hitchicker's guide to the galaxy'?", "42",
                                "Pay the rent",
                                "Eat,Pray,Love", "Go to University", "Run", "a");
                question.check();

                question = new MultipleChoiceQuestion(
                                "What is the well-known video app created by a company called 'Baidu'",
                                "YouTube", "DuoLingo", "TikTok", "DBS", "Instagram", "c");
                question.check();

                question = new MultipleChoiceQuestion("What is the talest building in the world ?", "Mt.Fuji",
                                "The Empire State Building", "Burj Khalifa", "Shanghai Tower", "Hogwarts School", "C");
                question.check();

                question = new MultipleChoiceQuestion("What is the capital of Japan ?", "Tokyo",
                                "NewYork", "London", "Hong Kong", "Moscow", "a");
                question.check();

                question = new MultipleChoiceQuestion("Who is the current CEO of Alphabet/Google Inc?",
                                "My neighbor Charlie",
                                "Borris Johnson", "Pikachu", "Brad Pitt", "Sundar Pichai", "e");
                question.check();

                Question TFQuestion = new TrueFalseQuestion("The Current Year is 2023", "TRUE");
                TFQuestion.check();

                TFQuestion = new TrueFalseQuestion("Joe Biden is the current President of the United States", "TRUE");
                TFQuestion.check();

                TFQuestion = new TrueFalseQuestion("Kali Linux is a type of mobile OS", "FALSE");
                TFQuestion.check();

                TFQuestion = new TrueFalseQuestion("Eart is the biggest planet ever measured", "FALSE");
                TFQuestion.check();

                TFQuestion = new TrueFalseQuestion("TCP requires three way handshake", "TRUE");
                TFQuestion.check();

                Question.showResults();

        }

}