import java.util.Scanner;

public class AskAge
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int FrågaÅlder = scan.nextInt();
        if (FrågaÅlder < 18)
        {
            System.out.println("du är ett barn");
        }
        else
        {
            System.out.println("Du är vuxen");
        }
    }
}
