import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int sizeArray = Integer.parseInt(sc.nextLine());
        int [] arr=new int[sizeArray];
        for(int i=0;i<sizeArray;i++){
            System.out.printf(" phần tử thứ: %d là:  ",i);
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        int max = arr[0];
        int min= arr[0];
        for(int i=0;i<sizeArray;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.printf("\n giá trị max: %d",max);
        System.out.printf("\ngiá trị min: %d ",min);

    }
}
