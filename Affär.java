import java.util.Scanner;

public class Affär
{
    public static void main(String[] args)
    {
        int MaxVaror = 10;
        int VarorPris = 20;
        Scanner scan = new Scanner(System.in); //skannern för hur många varor kunden köpt
        System.out.println("Hur många varor har du köpt?");
        int AntalVaror = scan.nextInt(); //kollar hur många varor kunden köpt

        if (AntalVaror < MaxVaror) //om varor som kunden har köpt är mindre än 10
        {
            int AntalVarorPris = AntalVaror * VarorPris;
            System.out.printf("Antal varor du vill köpa är mindre än 10, kostnaden blir %s kr", AntalVarorPris);
        }
        else //om varor som kunden har köpt är mer än 10
        {
            Scanner sc = new Scanner(System.in); //skannern för om kunden är VIP
            System.out.println("Är du VIP kund? Ange true eller false");
            Boolean VIP = sc.nextBoolean(); //kollar om kunden är VIP
            if (VIP = true) //Om kunden är VIP
            {
                double AntalVarorPris = AntalVaror * VarorPris * 0.9; 
                System.out.printf("Antal varor du vill köpa är mer än 10 och är VIP kund och får därför reducerat pris! Kostnaden blir %s kr", AntalVarorPris);
            }
            if (VIP = false) //om kunden inte är VIP
            {
                int AntalVarorPris = AntalVaror * VarorPris;
                System.out.printf("Antal varor du vill köpa är mer än 10 men är inte VIP kund så du får inte reducerat pris. Kostanden blir %s kr", AntalVarorPris);
            }
        }
    }
}
