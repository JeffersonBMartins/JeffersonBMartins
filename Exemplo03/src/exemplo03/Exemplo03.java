package exemplo03;
import java.util.Scanner;
public class Exemplo03 
{
    public static void main(String[] args) 
    {
        //float a, b, c, delta, x1, x2;
        double a, b, c, delta, x1, x2;
        float Xv, Yv;
        String resultado="";
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Digite o valor de A: ");
        a = entrada.nextFloat();
        System.out.print("\n Digite o valor de B: ");
        b = entrada.nextFloat();
        System.out.print("\n Digite o valor de C: ");
        c = entrada.nextFloat();
        delta = (Math.pow(b, 2)) - (4*a*c);
        if(delta > 0)
        {// Temos duas raízes reais diferentes.
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            resultado = " X1: "+x1+" X2: "+x2;
        }
        if(delta == 0)
        {// Temos duas raízes reais iguais.
            x1 = (-b + Math.sqrt(delta))/(2*a);
            resultado = " X1 = X2: "+x1;
        }
        if(delta < 0)
        {// Não há raízes reais.
            resultado = " Não há raízes reais";
        }
        System.out.print(resultado);
        // Concavidade.
        if(a > 0)
        {
            System.out.print("\n A concavidade é para cima");
        }else{
            System.out.print("\n A concavidade é para baixo");
        }
        // Vértice.
        Xv = (float)(-b/(2*a));
        Yv = (float)(-delta/(4*a));
        System.out.print("\n O valor de Xv é "+Xv+" e o valor de Yv é"+Yv);
    }
}
