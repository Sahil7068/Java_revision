package Array;
//
//public class bubbleSort {
//    public static void main(String[] args) {
//        int a[] = {3, 5, 1, 4, 2};
////
////        for (int i = 0; i<a.length-1; i++){
////            for (int j =0; j<a.length - i -1; j++){
////                if (a[j] > a[j + 1]){
////                    int temp = a[j];
////                    a[j] = a [j + 1];
////                    a[j + 1] = temp;
////
////                }
////            }
////        }
////        for (int i =0; i<a.length; i++){
////            System.out.println(a[i]);
////        }
////
////
////    }
//
//        System.out.println("---Descending---");
//
////        int n = a.length;
////
////        for (int i = 0; i < n - 1; i++) {
////            for (int j = 0; j < n - i - 1; j++) {
////                if (a[j] < a[j + 1]) {
////                    int temp = a[j];
////                    a[j] = a[j + 1];
////                    a[j + 1] = temp;
////                }
////            }
////        }
////        for (int i = 0; i < n; i++) {
////            System.out.print(a[i] + " ");
////        }
////        System.out.println();


public class bubbleSort {

    public static void main(String[] args) {
        int a[] = {4, 5, 3, 2, 9};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("The second minimum number is " + a[1]);
        System.out.println("The second largest number is " + a[3]);


    }
}





