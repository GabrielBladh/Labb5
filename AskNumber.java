import java.util.Scanner;

public class AskNumber{

    public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ange ett heltal");
    int FrågaHelTal = scan.nextInt();
    if (FrågaHelTal > 100)
    {
        System.out.println("Talet är större än 100");
    }
    else 
    {
        System.out.println("Talet är högst 100");
    }
 }
}


