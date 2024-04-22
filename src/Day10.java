import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        List<Integer> list = new ArrayList<>();
        while(n>0) {
            int remainder = n % 2;
            n = n / 2;

           list.add(remainder);

        }
        Collections.reverse(list);
        System.out.println(list.toString());
        for(int basetwo:list){

            sum +=basetwo;
            if (basetwo == 0) {
               break;
            }




        }
        System.out.println(sum);
        }
    }

