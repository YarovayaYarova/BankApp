package HomeWork;

public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static int writeNumOfPlayersPerTeam(GameType game) {
        int NumOfPlayers = 0;
        try {
            switch (game) {
                case SOCCER:
                    NumOfPlayers = 11;
                    break;
                case HOCKEY:
                    NumOfPlayers = 6;
                    break;
                case RUGBY:
                    NumOfPlayers = 15;
                    break;
                default:
                    NumOfPlayers = 0;
            }
        } catch (Exception error) {
            System.out.println("Something bad has happened");
            throw error;
        }

        return NumOfPlayers;
    }

}

