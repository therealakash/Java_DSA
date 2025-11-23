
//. Check if an array is sorted.
class checksorted{
     static boolean checksorted(int[] arr){
        boolean check=false;
        for(int i =0;i<arr.length;i++){
                if(arr[i]<=arr[i+1]){
                    continue;
                    check=true;
                }
                else{
                    break;
                }
        }
        return  check;
     }

    public static void main(String[] args) {
        
    }
}
