/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.gui.model;

import adaminojavaexam.be.Song;
import adaminojavaexam.bll.SongManager;
import java.util.ArrayList;
import java.util.List;

public class SongModel {

    private List<Song> songsFromDB;

    private final SongManager songManager;

    public SongModel() {
        songManager = new SongManager();
        songsFromDB = new ArrayList<>(songManager.getAllSongs());
    }

    /**
     * Add song from user
     *
     * @param userSong
     */
    public void addSong(Song userSong) {
        songManager.addSongToDB(userSong);
    }

    /**
     * Delete song by id
     *
     * @param id
     */
    public void deleteSongByID(int id) {
        songManager.deleteSongByID(id);
    }

    /**
     *
     * @return new List of all Songs in DB
     */
    public List<Song> getSongsFromDB() {
        songsFromDB = new ArrayList<>(songManager.getAllSongs());
        return new ArrayList<>(songsFromDB);
    }

    /**
     * Update song in DB
     *
     * @param title
     * @param id
     */
    public void updateSong(String title, int id) {
        songManager.updateSong(title, id);
    }

}
