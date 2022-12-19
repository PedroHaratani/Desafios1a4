import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k,resultado,count=0;
        System.out.println("Insira quantos item no array você quer inserir");
        n=in.nextInt();
        System.out.println("Informe o valor de K alvo");
        k=in.nextInt();

        List<Integer> lista = new ArrayList<>();

        for(int i =0;i<n;i++){
            System.out.println("Informe os numeros do seu array");
            lista.add(i,in.nextInt());
        }

        for(int j =0;j<n;j++){
            for(int l =0;l<n;l++){
                if(lista.get(j)>lista.get(l)){
                    resultado = lista.get(j)-lista.get(l);
                    if(resultado==k){
                        count++;
                    }
                }
            }

        }
        System.out.println(count);


    }
}