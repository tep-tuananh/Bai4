import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhâp số lượng mang: ");
        int sizeArray=Integer.parseInt(sc.nextLine());
        int [] arr=new int[sizeArray];
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]: ",i);
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        for (int temp:arr) {
            System.out.printf("%d\t",temp);
        }
        System.out.printf("\nNhập giá trị cần thay đổi: ");
        int addValue=Integer.parseInt(sc.nextLine());
        System.out.printf("\n Nhập vị trí cần thay đổi: ");
        int indexValue=Integer.parseInt(sc.nextLine());
        for(int i=0;i<arr.length;i++)
        {
            if(i==indexValue){
                arr[i]=addValue;
            }
        }
        System.out.printf("Sau khi được update lại!\n");
        for (int temp:arr) {
            System.out.printf("%d\t",temp);
        }
    }
}
