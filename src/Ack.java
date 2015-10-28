import java.util.Scanner;

/**
 * Created by Вадик on 29.10.2015.
 */
public class Ack {
    public static void main(String args[]) {

        //Запрос значений для функции Акермана
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Ack(m, n));
        }

        //Запрос и вывод степенной функции
        if(sc.hasNext()){
            System.out.println(pow(sc.nextInt(),sc.nextInt()));
        }

    }

    //Реализация функции Акермана. Осторожно - вылетает уже при малых значениях м и н!!!
    public static int Ack(int m, int n){
        if(m == 0){
            return (n+1);
        } else if(m>0 && n==0){
            return Ack(m-1, 1);
        } else if (m > 0 && n > 0) {
                return (Ack(m - 1, Ack(m, n - 1)));
        }
        return 0;
    }

    //Реализация степенной функции
    public static int pow(int x, int n){
        if(n==1){
            return x;
        } else {
            return x*pow(x, n - 1);
        }
    }
    }





