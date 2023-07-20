import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]= scanner.nextInt();
        }
        int result =0;
        for(int i=0;i<size;i++)
        {
            result=result^array[i];
        }
        System.out.println(result);
    }
}