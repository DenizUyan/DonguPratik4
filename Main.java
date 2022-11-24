import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,total=1;

        System.out.println("Sayi Giriniz: ");
        n = input.nextInt();

        for(i=1;i<=n;i++){
            total = total * i;

        }
        System.out.println(total);
    }
}