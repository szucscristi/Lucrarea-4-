import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int Art,Bob,Cal,Dan,Eli;
        System.out.print("Cate puncte a facut Art?: ");
        Scanner inputDevice= new Scanner(System.in);
        Art=inputDevice.nextInt();
        System.out.print("Cate puncte a facut Bob?: ");
        Bob=inputDevice.nextInt();
        System.out.print("Cate puncte a facut Cal?: ");
        Cal=inputDevice.nextInt();
        System.out.print("Cate puncte a facut Dan?: ");
        Dan=inputDevice.nextInt();
        System.out.print("Cate puncte a facut Eli?: ");
        Eli=inputDevice.nextInt();
        System.out.println("\nPunctele din meci: \n");

        System.out.print("Art: ");
        asterisk(Art);
        System.out.print("\nBob: ");
        asterisk(Bob);
        System.out.print("\nCal: ");
        asterisk(Cal);
        System.out.print("\nDan: ");
        asterisk(Dan);
        System.out.print("\nEli: ");
        asterisk(Eli);
    }
    public static void asterisk(int nume)
    {
        while(nume!=0)
        {
            System.out.print("*");
            nume--;
        }
    }

}