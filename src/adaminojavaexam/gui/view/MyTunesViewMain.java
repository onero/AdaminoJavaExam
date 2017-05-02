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

        for (Song song : songModel.getSongsFromDB()) {
            System.out.println(song.getID());
            System.out.println(song.getTitle());
            System.out.println(song.getArtist());
            System.out.println(song.getCategory());
            System.out.println(song.getDuration());
        }

        addSongFromUser();
    }

    private void addSongFromUser() {
        UserInput inputFromUser = new UserInput();
        Song userSong = inputFromUser.createSongFromUserInput();
        songModel.addSong(userSong);
    }

}
