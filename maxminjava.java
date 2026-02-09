package day_1_array;
class maxminjava {
    static void printmaxmin(int[] arr) {
        int mxmin = Integer.MAX_VALUE;
        int mxmax = Integer.MIN_VALUE;
        int sdmin = 0;
        int dsmx = 0;
        for (int x : arr) {
            if (x < mxmin) {
                sdmin = mxmin;
                mxmin = x;
            } else if (x < sdmin && x != mxmin) {
                sdmin = x;
            }
            if (x > mxmax) {
                dsmx = mxmax;
                mxmax = x;
            } else if (x > dsmx && x != mxmax) {
                dsmx = x;
            }

        }
        System.out.println("the second mix is:"+sdmin);
        System.out.println("the second max is :"+dsmx);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 7, 9};
        printmaxmin(arr1);
    }

}