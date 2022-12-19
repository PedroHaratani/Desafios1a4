import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor;
        int nota100 = 0,nota50,nota20,nota10,nota5,nota2,moeda1,moeda50,moeda25,moeda10,moeda5,moeda1c;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Insira um valor");
        valor = in.nextFloat();
        if(valor <0 ) {
            System.out.println("Insira um valor positivo");
            valor = in.nextFloat();
        }

        nota100 = (int) valor/100;
        valor -= nota100*100;
        nota50 = (int) valor/50;
        valor -=nota50*50;
        nota20 =(int) valor/20;
        valor -=nota20*20;
        nota10 = (int)valor/10;
        valor -= nota10*10;
        nota5 = (int)valor/5;
        valor -= nota5*5;
        nota2=(int)valor/2;
        valor -= nota2*2;
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        valor =  Float.parseFloat(df.format(valor).replace(",","."));

        double moedas = valor*100;
        moeda1= (int)moedas/100;
        moedas -=moeda1*100;
        moeda50 = (int)moedas/50;
        moedas -= moeda50*50;
        moeda25 = (int) moedas/25;
        moedas -= moeda25*25;
        moeda10 = (int)moedas/10;
        moedas -= moeda10*10;
        moeda5 = (int)moedas/5;
        moedas -= moeda5*5;
        moeda1c=(int)moedas;

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1c + " moeda(s) de R$ 0.01");
    }

}