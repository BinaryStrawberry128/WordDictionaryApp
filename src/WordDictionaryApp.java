import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WordDictionaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordBook wordBook = new WordBook();

        while(true){
            System.out.println("-------Menu-------");
            System.out.println("1. Add Word");
            System.out.println("2. Find Word");
            System.out.println("3. Delete Word");
            System.out.println("4. Print Dictionary");
            System.out.println("5. Get Count");
            System.out.println("6. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter word:");
                    String word = scanner.nextLine();
                    System.out.println("Enter definition:");
                    String definition = scanner.nextLine();
                    wordBook.addWord(word, definition);
                    break;
                case "2":
                    System.out.println("Enter word:");
                    word = scanner.nextLine();
                    String definitionResult = wordBook.getDefinition(word);
                    if(definitionResult != null){
                        System.out.println("Definition: " + definitionResult);
                    }else{
                        System.out.println("Word does not exist");
                    }
                    break;
                case "3":
                    System.out.println("Enter word:");
                    word= scanner.nextLine();
                    wordBook.deleteWord(word);
                    break;
                case"4":
                    wordBook.printDictionary();
                    break;
                case"5":
                    System.out.println("Number of words: " + wordBook.getCount());
                    break;
                case "6":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}