package OOP.Playable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Playable> playables = List.of(new Guitar(), new Piano());

        for (Playable playable : playables) {
            playable.play();
        }
    }
}
