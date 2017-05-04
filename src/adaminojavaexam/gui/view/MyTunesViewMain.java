/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.gui.view;

import adaminojavaexam.be.Song;
import adaminojavaexam.gui.model.SongModel;

public class MyTunesViewMain {

    private SongModel songModel;

    public void start() {
        songModel = new SongModel();

        promptUser();
    }

    /**
     * Display all songs from DB
     */
    private void displayAllSongs() {
        for (Song song : songModel.getSongsFromDB()) {
            System.out.println();
            System.out.println("SongID: " + song.getID()
                    + "\nSong Title: " + song.getTitle()
                    + "\nSong Artist: " + song.getArtist()
                    + "\nSong Category: " + song.getCategory()
                    + "\nSong Duration: " + song.getDuration());
            System.out.println();
        }
    }

    /**
     * Add song to DB
     */
    private void addSongFromUser() {
        String title = UserInput.createSongFromUserInput();
        Song userSong = new Song(title);
        songModel.addSong(userSong);
    }

    /**
     * Updates the song in the DB
     */
    private void updateSong() {
        int id = UserInput.getSongIDToUpdate();
        String title = UserInput.getNewTitleForSong();
        songModel.updateSong(title, id);
    }

    /**
     * Choose song to delete
     */
    private void deleteSong() {
        int id = UserInput.getSongToDelete();
        songModel.deleteSongByID(id);
    }

    /**
     * Prompt user for choice
     */
    private void promptUser() {
        int userChoice = Integer.MAX_VALUE;

        while (userChoice != 0) {
            userChoice = UserMenu.getUserChoice();
            switch (userChoice) {
                case 0:
                    System.out.println("Exiting system!");
                    break;
                case 1:
                    addSongFromUser();
                    break;
                case 2:
                    displayAllSongs();
                    break;
                case 3:
                    displayAllSongs();
                    updateSong();
                    break;
                case 4:
                    displayAllSongs();
                    deleteSong();
                    break;
                default:
                    System.out.println("That's not an option!");
            }
        }
    }

}
