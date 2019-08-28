package Lindsoft;

public class PlayField {
    private static String[][] playFieldXY;

    public static void buildPlayfield(int sizePlayfield) {

        // this method creates the playfield, the array created should be seen as coordinates, playfield[x][y]. The
        // size of the playfield is given in the methods argument.
        playFieldXY = new String[sizePlayfield][sizePlayfield];

        for (int x = 0; x < sizePlayfield; x++) {
            for (int y = 0; y < sizePlayfield; y++) {
                playFieldXY[x][y] = " ";
            }
        }
        printPlayfield();
    }

    public static void printPlayfield() {

        for (int x = 0; x < playFieldXY.length; x++) {
            System.out.println("");

            for (int y = 0; y < playFieldXY.length; y++) {
                System.out.print(playFieldXY[x][y] + " | ");

            }

            System.out.println("");

            for(int z= 0; z < playFieldXY.length*4; z++){
                System.out.print("-");

            }
        }

    }
}
