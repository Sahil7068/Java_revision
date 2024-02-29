public class patternNumber {

    public static void main(String[] args) {
        for (int i =0; i<=4; i++){
            int k =1;
            for (int j =0; j<=4; j++){
                if (j<=i){
                    System.out.print(k);
                    k++;
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
