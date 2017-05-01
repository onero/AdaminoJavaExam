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
    public Song promptUserToAddNewSong() {
        System.out.println();
        System.out.println("Add new song:");
        String name = Console.Readers.readString("Name = ");
        String artistName = Console.Readers.readString("Artist Name = ");
        String categoryName = Console.Readers.readString("Category Name = ");
        int duration = Console.Readers.readInt("Duration = ");
        Song newSong = new Song(name, artistName, name, duration);
        return newSong;
    }

}
