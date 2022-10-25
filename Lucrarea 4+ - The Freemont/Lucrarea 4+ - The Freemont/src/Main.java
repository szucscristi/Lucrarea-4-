public class Main
{

    public static void main(String[] args)
    {
        double parts_per_month=4000,percentage;
        int month=1,ok=0;
        while(month<=24)
        {
            System.out.println("In luna "+month+" muncitorul a produs "+parts_per_month+" piese.");
            percentage=0.06*parts_per_month;
            parts_per_month=(double)Math.round((parts_per_month+percentage) * 100d) / 100d;
            if(parts_per_month>7000 && ok==0)
            {
                System.out.println("In luna a " + month + "-a muncitorul a inceput sa produca peste 7000 de piese pe luna. Merita o marire de salar.");
                ok=1;
            }
            month++;
        }
    }

}