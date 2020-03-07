

public class Main {
private static int arr[];
    public static void main(String[] args) {
        arr=new int[]{31,42,12,56,50};
        sort(arr);
        print();

    }

    private static void sort(int[] arr) {

        for (int i=0;i<arr.length;i++){
           int min=i;
           for (int j=i+1;j<arr.length;j++){
            if (arr[j]<arr[min]){
                min=j;
            }
           }
            swap(i,min);
        }

    }
    public static void swap(int i,int j){


        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void print(){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }


}
