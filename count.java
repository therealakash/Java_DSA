

class count{
public static void main(String[] args) {
    int n =1234;
    int cnt =0;
        while(n!=0){
            cnt++;
            n=n/10;
        }
        System.out.println(cnt);
}
}
