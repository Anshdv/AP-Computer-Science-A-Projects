package main.java.org.hillcrest.music;

import java.util.Arrays;

/**
 * A class to manage a playlist
 */
public class Playlist {
    private Track[] tracks = new Track[10];
    private int size = 0;

    /**
     * Procedure for adding specified track to the playlist (expands array if necessary)
     * @param track the track to add to the playlist
     */
    public void addTrack(Track track) {
        if (size >= tracks.length) {
            growArray();
        }
        tracks[size] = track;
        size++;
    }

    /**
     * Procedure for removing specified track from the playlist
     * @param title the title of the track to remove from the playlist
     */
    public void removeTrack(String title) {
        int position = findTrackIndex(title);

        for (int i = position + 1; i < tracks.length; i++) {
            tracks[i-1] = tracks[i];
        }
        size--;
    }

    /**
     * Prints information of all the tracks in the playlist
     */
    public void display() {
        if (size == 0) {
            System.out.println("\nNo tracks in playlist.");
        } else {
            System.out.println("\nPlaylist Contents: ");
            for (int i = 0; i < size; i++) {
                Track track = tracks[i];
                System.out.printf("Title: %s | Artist: %s | Duration: %.2f", track.getTitle(), track.getArtist(), track.getDuration());
                System.out.println();
            }
        }
    }

    /**
     * Searches for a specified track in the playlist and returns its position
     * @param title the title of the track to search for
     * @return the index of the track in the array representing the playlist
     */
    public int findTrackIndex(String title) {
        int index = 0;
        boolean found = false;
        while (!found && index < size) {
            if (tracks[index].getTitle().equals(title)) {
                found = true;
            } else {
                index++;
            }
        }
        return found ? index : -1;
    }

    /**
     * Expands the size of the playlist
     */
    private void growArray() {
        tracks = Arrays.copyOf(tracks, tracks.length*2);
    }
}
