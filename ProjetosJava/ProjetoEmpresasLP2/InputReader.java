package projetofinal;

import java.util.Scanner;

/* InputReader reads typed number or text input from the standard text terminal. 
 * The text or number typed by a user is returned.
 */
public class InputReader {

    private Scanner reader;

    public InputReader() {
        reader = new Scanner(System.in);
    }

    private void showFormattedQuestion(String question) {
        if (question == null) {
            question = "";
        }
        question += "> ";
        System.out.print(question);
    }

    public double getRealNumber(String question) {
        showFormattedQuestion(question);

        while (!reader.hasNextDouble()) {
            reader.nextLine();
            showFormattedQuestion(question);
        }
        double number = reader.nextDouble();
        reader.nextLine();
        return number;
    }

    public int getIntegerNumber(String question) {
        showFormattedQuestion(question);

        while (!reader.hasNextInt()) {
            reader.nextLine();
            showFormattedQuestion(question);
        }
        int number = reader.nextInt();
        reader.nextLine();
        return number;
    }

    public String getText(String question) {
        showFormattedQuestion(question);

        return reader.nextLine();
    }
}
