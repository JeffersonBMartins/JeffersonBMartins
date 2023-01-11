package exemplo01;
import java.util.Scanner;
public class Exemplo01 
{
    public static void main(String[] args) 
    {
        int valorA, valorB, resultado;
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Digite o valor A: ");
        valorA = entrada.nextInt();
        System.out.print("\n Digite o valor B: ");
        valorB = entrada.nextInt();
        resultado = valorA+valorB;
        System.out.print("\n A soma de A e B é "+resultado);
        System.out.print("\n Digite seu nome: ");
        nome = entrada.next();
        System.out.print("\n Nome: "+nome);
    }
}
