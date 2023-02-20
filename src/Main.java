import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int broj;
        int suma =0;
        Scanner ulaz = new Scanner(System.in); // Ulazni objekat
        System.out.println("unes te broj: ");
        broj = ulaz.nextInt();
        for (int i = 1; i <broj+1; i++) {
            suma=i%10+((i-i%10)/10);

            if(i%suma==0)
            {
                System.out.println("broj je paran:" + i);
            }
        }

    }
}