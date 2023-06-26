package input;

import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;
    public InputReader() {
        this.scanner = new Scanner(System.in);
    }
    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
