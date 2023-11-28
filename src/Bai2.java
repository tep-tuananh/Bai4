
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        float avgMark=0;
        int sum=0;
        System.out.println("Nhập số phần tử mảng: ");
        int sizeArray=Integer.parseInt(sc.nextLine());
        int [] arrayINT= new int[sizeArray];
        for(int i=0;i<arrayINT.length;i++)
        {
            System.out.printf("phần tử thứ %d : là ",i);
            arrayINT[i]=Integer.parseInt(sc.nextLine());
        }
       for(int i=0;i<arrayINT.length;i++){
            sum+=arrayINT[i];
       }
        System.out.println("Tổng của mảng: "+sum);
             avgMark=(float) sum/sizeArray;
        System.out.printf("Trung bình cộng : %f",avgMark);
    }
}
