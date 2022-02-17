import java.io.IOException;
import java.text.Format;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double aumento = (((100*B)/A)-100);

        System.out.printf("%.2f", aumento);
        System.out.print("%");

    }

}