/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.gui.view;

import adaminojavaexam.be.Song;
import adaminojavaexam.gui.model.SongModel;

public class MyTunesViewMain {

    public static void main(String[] args) {
        SongModel songModel = new SongModel();

        for (Song song : songModel.getSongsFromDB()) {
            System.out.println(song.getID());
            System.out.println(song.getTitle());
            System.out.println(song.getArtist());
            System.out.println(song.getCategory());
            System.out.println(song.getDuration());
        }
    }

}
