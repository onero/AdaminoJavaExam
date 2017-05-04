/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.be;

public class Song {

    private int mID;
    private final String mTitle;
    private String mArtist;
    private String mCategory;
    private int mDuration;

    public Song(int ID, String title, String artist, String category, int duration) {
        this.mID = ID;
        this.mTitle = title;
        this.mArtist = artist;
        this.mCategory = category;
        this.mDuration = duration;
    }

    public Song(String title) {
        mTitle = title;
    }

    public int getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getCategory() {
        return mCategory;
    }

    public int getDuration() {
        return mDuration;
    }

}
