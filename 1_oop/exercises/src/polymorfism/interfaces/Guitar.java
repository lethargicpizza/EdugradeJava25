package polymorfism.interfaces;

public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}
