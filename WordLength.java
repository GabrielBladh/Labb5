import java.util.Scanner;

public class WordLength
{
    public static void main(String[] Args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv ett ord");
        String ord = scan.nextLine();
        int OrdLängd = ord.length();
        System.out.printf("Ordet %s är %d långt !%n", ord, OrdLängd);
    }
}