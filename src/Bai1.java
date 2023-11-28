import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] number= new int[5];
        for(int i=0;i<number.length;i++){
            System.out.printf("Number[%d]: ",i);
            number[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Các thành phần mảng: ");
        for (int temp:number) {
            System.out.printf(" %d \t",temp);
        }
    }
}
