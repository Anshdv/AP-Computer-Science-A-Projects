package main.java.org.hillcrest.music;

import java.util.Scanner;

/**
 * Main UI for user to create their own playlist with multiple tracks
 */
public class MusicApp {
    /**
     * Main method
     * @param args arguments passed into the code
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Playlist myPlaylist = new Playlist();
        System.out.println("\nWelcome to the Music Playlist App!");

        int userInput = 1;
        boolean repeat = true;

        while (repeat) {
            printMenu();
            System.out.print("Enter choice: ");
            userInput = in.nextInt();
            in.nextLine();

            if (userInput == 1) {
                addTrack(in, myPlaylist);
            } else if (userInput == 2) {
                removeTrack(in, myPlaylist);
            } else if (userInput == 3) {
                myPlaylist.display();
            } else if (userInput == 4){
                System.out.println("Goodbye!");
                repeat = false;
            } else {
                System.out.println("\nYou did not enter one of the choices. Try again.");
            }
        }
    }

    /**
     * Prints the options to modify the playlist
     */
    private static void printMenu() {
        System.out.println("""
                \n---------------------------------------
                1) Add Track
                2) Remove Track
                3) Display Playlist
                4) Exit
                ---------------------------------------
                """);
    }

    /**
     * Adds a track to the playlist
     * @param in the Scanner to receive the input of the user
     * @param playlist the playlist to add the track to
     */
    private static void addTrack(Scanner in, Playlist playlist) {
        System.out.print("\nEnter title: ");
        String title = in.nextLine();
        System.out.print("Enter artist: ");
        String artist = in.nextLine();
        System.out.print("Enter duration: ");
        double duration = in.nextDouble();

        if (duration < 0) {
            System.out.println("\nInvalid duration. Track not added.");
        } else {
            Track newTrack = new Track(title, artist, duration);
            playlist.addTrack(newTrack);
            System.out.println("\nTrack added!");
        }
    }

    /**
     * Removes a track from the playlist
     * @param in the Scanner to receive the input of the user
     * @param playlist the playlist to remove the track from
     */
    private static void removeTrack(Scanner in, Playlist playlist) {
        System.out.print("Enter title of track to remove: ");
        String title = in.nextLine();

        if (playlist.findTrackIndex(title) == -1) {
            System.out.println("\nTrack not found.");
        } else {
            playlist.removeTrack(title);
            System.out.println("\nTrack removed!");
        }
    }
}
