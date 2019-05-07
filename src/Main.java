import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        int decimal_number, i=0;
        int bin_number[] = new int[100];

        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        decimal_number = scan.nextInt();

        while(decimal_number != 0)
        {
            bin_number[i++] = decimal_number%2;
            decimal_number = decimal_number/2;
            //System.out.println(decimal_number+" -> " +" bin_num["+(i-1)+"] = " + bin_number[i-1]  );
        }

        System.out.print("Binary number is: ");
        for( int j= i-1 ; j > -1 ; j--)
        {
            System.out.print(bin_number[j]);
        }

    }

}
