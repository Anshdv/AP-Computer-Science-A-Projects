package main.java.org.hillcrest.music;

/**
 * Template for a track to add to a playlist
 */
public class Track {
    private String title;
    private String artist;
    private double duration;

    /**
     * Initializes a track with a title, artist, and duration
     * @param title the title of the track
     * @param artist the artist of the track
     * @param duration how long the track is
     */
    public Track(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    /**
     * Retrieves the title of the track
     * @return the title of the track
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves the artist of the track
     * @return the artist of the track
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Retrieves the duration of the track
     * @return how long the track is
     */
    public double getDuration() {
        return duration;
    }

    /**
     * Sets the title of the track
     * @param title the title the track should have
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the artist of the track
     * @param artist the artist the track should have
     */
    public void setArtist(String artist) {
        this.title = artist;
    }

    /**
     * Sets the duration of the track
     * @param duration how long the track should be
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Presents a string representation of the track
     * @return a string representation of the track
     */
    public String toString() {
        return "The track " + title + " by " + artist + " is " + duration + " seconds long.";
    }
}
