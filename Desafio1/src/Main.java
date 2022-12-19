import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,nums;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for(int i = 0; i < n; i++){
            nums=in.nextInt();
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