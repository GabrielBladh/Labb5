import java.util.Scanner;

public class Selections
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ange ett heltal");  
    int Heltal = scan.nextInt();
    if (Heltal > 67)
    {
        System.out.println("Heltalet är större än 67");
    }
    if (Heltal == 3 || Heltal == 6 || Heltal == 9)
    {
        System.out.println("Heltalet är antingen 3, 6 eller 9");
    }
    if (Heltal >= 25 && Heltal <= 50)
    {
        System.out.println("Heltalet är mellan 25 och 50");
    }
    if (Heltal >= 1 && Heltal <= 4 || Heltal >= 7 && Heltal <= 9)
    {
        System.out.println("Heltalet är mellan 1 och 4 eller mellan 7 och 9");
    }
    if (Heltal < 0 || Heltal > 10)
    {
        System.out.println("Heltalet är antingen mindre än 0 eller större än 10");
    }
    } 
}
