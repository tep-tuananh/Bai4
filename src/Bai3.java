import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột: ");
        int colum=Integer.parseInt(sc.nextLine());
        int [][] numbers=new int[row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                System.out.printf("number[%d][%d]: ",i,j);
                numbers[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        for (int i=0;i<row;i++) {
            for(int j=0;j<colum;j++)
            {
                System.out.printf(" %d\t",numbers[i][j]);
            }
            System.out.println("\n");
        }
    }
}
