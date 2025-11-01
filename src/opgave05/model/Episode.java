package opgave05.model;

import java.util.ArrayList;

public class Episode {
    private int episodeNumber;
    private ArrayList<String> guestStars = new ArrayList<>();
    private int minutes;

    public Episode(int episodeNumber, ArrayList<String> guestStars, int minutes) {
        this.episodeNumber = episodeNumber;
        this.guestStars = guestStars;
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public ArrayList<String> getGuestStars() {
        return guestStars;
    }
}
