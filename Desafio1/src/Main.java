import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,nums;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero de itens a serem inseridos");
        n=in.nextInt();
        if(n<0 && n>100000){
            System.out.println("Insira um numero maior que zero ou menor que 100000");
            n=in.nextInt();
        }
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Insira um valor");
            nums=in.nextInt();
            if(nums<0){
                System.out.println("Insira um valor não negativo");
                nums=in.nextInt();
            }
            if(nums%2==0){
                numerosPares.add(nums);
            }else {
                numerosImpares.add(nums);
            }
        }

        for (int num:numerosPares) {
            System.out.println(num);
        }
        for (int num:numerosImpares) {
            System.out.println(num);
        }

    }
}