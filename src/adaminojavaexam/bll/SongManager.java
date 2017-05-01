/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.bll;

import adaminojavaexam.be.Song;
import adaminojavaexam.dal.SongDAO;
import java.util.List;

public class SongManager {

    private final SongDAO songDAO;

    public SongManager() {
        songDAO = new SongDAO();
    }

    /**
     * Get all songs from DB
     *
     * @return
     */
    public List<Song> getAllSongs() {
        return songDAO.getAllSongs();
    }

}
