import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int highest_score=Integer.MIN_VALUE, lowest_score=Integer.MAX_VALUE,score;
        float arithmetic_average,suma=0,elements=0;
        System.out.println("| Introduceti un punctaj intre 0 si 10 | Introduceti 99 pentru a opri programul | :");
        Scanner inputDevice = new Scanner(System.in);
        score=inputDevice.nextInt();
        inputDevice.nextLine();
        while(score!=99)
        {
            if(score>=0 && score<=10)
            {
                if(lowest_score>score)
                    lowest_score=score;
                if(highest_score<score)
                    highest_score=score;
                suma=suma+score;
                elements++;
            }
            else
                System.out.println("Punctajul introdus nu este intre 0 si 10 ! Acesta nu va fi introdus.");
            System.out.println("| Introduceti un punctaj intre 0 si 10 | Introduceti 99 pentru a opri programul | :");
            score=inputDevice.nextInt();
            inputDevice.nextLine();
        }
        arithmetic_average=suma/elements;
        System.out.println("| "+"Lowest score: "+lowest_score+" |"+" Highest score: "+highest_score+" |"+" Arithmetic average: "+arithmetic_average+" |");
    }
}