package exemplo05;
import java.util.Scanner;
public class Exemplo05 
{
    public static void main(String[] args) 
    {
        double x1, x2, y1, y2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Digite X1: ");
        x1 = entrada.nextDouble();
        System.out.print("\n Digite Y1: ");
        y1 = entrada.nextDouble();
        
        System.out.print("\n Digite X2: ");
        x2 = entrada.nextDouble();
        System.out.print("\n Digite Y2: ");
        y2 = entrada.nextDouble();
        
        System.out.print("\n Distância euclidiana: "+Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)));
    }
}
