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

    private final List<Song> songsFromDB;

    private final SongManager songManager;

    public SongModel() {
        songManager = new SongManager();
        songsFromDB = new ArrayList<>(songManager.getAllSongs());
    }

    /**
     *
     * @return new List of all Songs in DB
     */
    public List<Song> getSongsFromDB() {
        return new ArrayList<>(songsFromDB);
    }

}
