package Lindsoft;

public class PlayField {
    private static String[][] playFieldXY;

    public static void buildPlayfield(int sizePlayfield) {
        // this method creates the playfield, the array created should be seen as coordinates, playfield[x][y]. The
        // size of the playfield is given in the methods argument.
        playFieldXY = new String[sizePlayfield][sizePlayfield + 2];

        for (int i = 0; i < sizePlayfield; i++) {
            // This loops put frames on the playfield coordinates x=0 is the upper frame, coordinate i y=0 and last y
            // is the side frames.
            playFieldXY[i][0] = "|  ";
            playFieldXY[i][sizePlayfield + 1] = "  |";
        }

        for (int x = 0; x < sizePlayfield; x++) {
            for (int y = 0; y < sizePlayfield; y++) {
                playFieldXY[x][y] = " ";
            }
        }
        printPlayfield();
    }

    public static void printPlayfield() {
        // this method prints the playfield out. (Coordinates tested for marker tested and working)

        for (int i = 0; i < 100; i++) {
            // this loop clears the screen
            System.out.println("\n");
        }

        for (int i = 0; i < playFieldXY.length * 4; i++) {
            // this loop draws the upper frame of the field
            System.out.print("-");
        }


        for (int x = 0; x < playFieldXY.length; x++) {
            // this loop draws the side frames, the grid and the markers
            System.out.println("");


            for (int y = 0; y < playFieldXY.length; y++) {
                if (y == 0) {
                    System.out.print("| ");
                }

                System.out.print(playFieldXY[x][y] + " | ");

            }


            System.out.println("");

            for (int z = 0; z < playFieldXY.length * 4; z++) {
                System.out.print("-");

            }
        }

    }

    public static void placeMarker(int xPosition, int yPosition, String marker) {
        // places marker on coordinates location. See the xPosition and yPosition as coordinates. X = width, Y=depth,
        // coordinates starts at 0,0

        if (playFieldXY[xPosition][yPosition] == " ") {
            playFieldXY[xPosition][yPosition] = marker;
        } else {
            System.out.println("position is taken, please place your marker on a position that is not taken by another player");
        }
        printPlayfield();
    }
}
