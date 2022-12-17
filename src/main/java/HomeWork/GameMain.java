package HomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class GameMain {
    public static void main(String[] args) {
//        int result = Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
//        System.out.println("Num Of Players Per Team: " + result);
        String file = String.valueOf(Game.GameType.RUGBY);
        GameMain gameMain = new GameMain();
   //     gameMain.createFile(file);
        gameMain.writToFile(file, String.valueOf(Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY)));
    }


    public void writToFile (String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }

    }
}