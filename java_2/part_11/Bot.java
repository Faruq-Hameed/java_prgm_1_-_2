public class Bot extends Player {

    @Override
    public void play() {
        System.out.println(" is playing as a bot.");
    }

    public void addMove(String move) {
        System.out.println("Bot move: " + move);
    }
}
