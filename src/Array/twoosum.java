package Array;

public class twoosum {

    public static int tww(int a[], int k){
        int n = a.length;
        int count = 0;
        for (int i =0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (a[i] + a[j] == k){
                    count ++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int a[] = {2,3,5,7,4,2};
        int k = 9;
        System.out.println(tww(a, k));
    }
}
