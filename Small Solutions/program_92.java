public class program_92 {
 //add total of a row of a 2d array
    public static void main(String[] args) {
            int[][] numbers = {{ 1, 2, 3, 4},
                   {5, 6, 7, 8},
                   {9, 10, 11, 12}};
        int total;

    for (int row = 0; row < numbers.length; row++) {
  total = 0;
    for (int col = 0; col < numbers[row].length; col++)
     total =total+ numbers[row][col];
        System.out.println("Total of row " + row + " is " + total);
    }
     /* int[][] add={{2,4,6},{1,3,5},{8,9,6}};
        int sum=0;
            for(int i=0; i<3;i++){
                for(int j=0;j<3; j++)
                    System.out.println(add[i][j]);
                    System.out.println();
    }
      //System.out.println(sum);     
                }*/  
    }
}


