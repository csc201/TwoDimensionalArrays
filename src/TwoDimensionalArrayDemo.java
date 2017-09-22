/**
 * Created by tkanc on 9/22/2017.
 */
public class TwoDimensionalArrayDemo {
    public static void main (String[]args) {
        final int ROW=12;
        final int COL=24;
        double temperature [][] = new double[ROW][COL];

        temperature[0][0] =  10.5;
        temperature[1][0] =  30.5;

        for(int i=0; i<temperature[0].length; i++) {
            for(int j=0; j<temperature.length; j++) {
                System.out.print(temperature[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
