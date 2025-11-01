package opgave05.model;

import java.util.ArrayList;

public class Serie {
    private String title;
    private ArrayList<String> cast = new ArrayList<>();
    private ArrayList<Episode> episodes = new ArrayList<>();

    public Serie(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
    }
    public String getTitle() {
        return title;
    }
    public ArrayList<String> getCast() {
        for (String actor : cast) {
            System.out.println(actor);
        }
        return cast;
    }
    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }
    public int gettotalMinutesOfSerie(){
        int totalMinutes = 0;
        for (Episode episode : episodes){
            totalMinutes += episode.getMinutes();
        }
        return totalMinutes;
    }
public ArrayList<String> getGuestStars(){
        for (Episode episode : episodes){
            for (String guestStar : episode.getGuestStars()){
                if(!cast.contains(guestStar)){
                    System.out.println(guestStar);
                    return episode.getGuestStars();
                }
            }
        }
        return null;
}

    }

