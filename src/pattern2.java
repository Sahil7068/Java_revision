public class pattern2 {
    public static void main(String[] args) {
        int k =1;

        for (int i =1; i<=3; i++){

            for (int j =1; j<=5; j++){

                if (j>=4-i && j<=2+i){
                    System.out.print(k);
                }

                else {
                    System.out.print(" ");
                }



            }
            System.out.println();
            k++;
        }
    }
}
