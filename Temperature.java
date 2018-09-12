public class Temperature {


    public static void main(String[]args){
        int grid [][]= new int[7][4];
        grid[0][0]=68;
        grid[0][1]=76;
        grid[0][2]=73;
        grid[0][3]=64;


        grid[1][0]=70;
        grid[1][1]=76;
        grid[1][2]=72;
        grid[1][3]=65;


        grid [2][0]=76;
        grid [2][1]=87;
        grid [2][2]=81;
        grid [2][3]=69;


        grid [3][0]=70;
        grid [3][1]=84;
        grid [3][2]=78;
        grid [3][3]=68;

        grid [4][0]=68;
        grid [4][1]=82;
        grid [4][2]=76;
        grid [4][3]=70;

        grid [5][0]=71;
        grid [5][1]=75;
        grid [5][2]=73;
        grid [5][3]=74;

        grid [6][0]=75;
        grid [6][1]=83;
        grid [6][2]=77;
        grid [6][3]=72;

        for (int i=0; i<grid.length; i++) {
            int sum = 0;
            for (int g=0; g< grid[i].length; g++) {
                sum+=grid[i][g];
                System.out.print(grid[i][g] +"  ");
            }
            System.out.println(sum/grid[i].length);
            System.out.println();
        }








    }

}
