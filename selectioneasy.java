public class selectioneasy {
    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
             int temp=arr[i];
        arr[i]=arr[minindex];
        arr[minindex]=temp;

        }
       
    }
static void insertion_sort(int[]arr){
    int element,j;
    for(int i=0;i<arr.length-1;i++){
        element=arr[i+1];
        j=i+1;
        while(j>0&& arr[j-1]>element){
            arr[j]=arr[j-1];
        }
        arr[j]=element;
    }
}


    public static void main(String[] args) {
        int[] arr={12,54,12,54,45,85};
        selection(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("insertion sort:");
        insertion_sort(arr);
         for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
