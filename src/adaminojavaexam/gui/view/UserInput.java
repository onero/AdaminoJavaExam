/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.gui.view;

import adaminojavaexam.be.Song;

public class UserInput {

    /**
     * Get a new song from user input
     *
     * @return
     */
    public static Song createSongFromUserInput() {
        System.out.println();
        System.out.println("Add new song:");
        String title = Console.Readers.readString("Name = ");
        Song newSong = new Song(title);
        return newSong;
    }

    /**
     * Get ID on song to update
     *
     * @return
     */
    public static int getSongIDToUpdate() {
        System.out.println();
        System.out.println("Please write the ID of the song you wish to update ");
        int userChoice = Console.Readers.readInt("Your choice: ");
        return userChoice;
    }

    /**
     * Get the new title for the song
     *
     * @return
     */
    public static String getNewTitleForSong() {
        System.out.println();
        String title = Console.Readers.readString("Please type the new Title for the song\n");
        return title;
    }

    /**
     * Get ID of song to delete
     *
     * @return
     */
    public static int getSongToDelete() {
        System.out.println();
        int id = Console.Readers.readInt("Please type ID of song to delete: ");
        return id;
    }

}
