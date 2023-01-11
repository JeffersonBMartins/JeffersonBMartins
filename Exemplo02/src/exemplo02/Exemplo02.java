package exemplo02;
import java.util.Scanner;
public class Exemplo02 
{
    public static void main(String[] args) 
    {
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Digite o valor: ");
        valor = entrada.nextInt();
        if((valor % 2)==0)
        {
            System.out.print("\n Este valor é par ");
        }else{
            System.out.print("\n Este valor é ímpar ");
        }
    } 
}
