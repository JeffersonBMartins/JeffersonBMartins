package exemplo04;
import java.util.Scanner;
public class Exemplo04 
{
    public static void main(String[] args) 
    {
        int valor, cont, dedoDuro=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Digite o valor: ");
        valor = entrada.nextInt();
        cont = 1;
        while (cont <= valor)
        {
            if((valor % cont)==0)
            {
                dedoDuro++;
            }
            cont++;
        }
        if(dedoDuro != 2)
        {
            System.out.print("O valor não é primo");
        }else{
            System.out.print("O valor é primo");
        }
    }
}
