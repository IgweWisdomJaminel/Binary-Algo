import java.util.*;

public class Day10 {


    public static void hackerRankSolution(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int max=0;
        while(n>0){
            if(n%2==1){
                count++;

                if(count>max){
                    max=count;
                }
                else{
                    count=0;
                }

            }
            n=  n/2;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;

            list.add(remainder);


        }
        Collections.reverse(list);
        System.out.println(list.toString());


        int count = 0;
        int max=0;

        for(int basetwo : list) {
            if (basetwo == 0) {
                count = 0;

            }else {
                count++;
                if(count>max){
                    max = count;
                }

            }


        }
        System.out.println(max);
    }

    }

