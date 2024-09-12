package Template_Method_Pattern;

public class Client {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        game = new Cricket();
        game.play();
    }
}
