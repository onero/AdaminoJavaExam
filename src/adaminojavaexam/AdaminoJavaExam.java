/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam;

import adaminojavaexam.gui.view.MyTunesViewMain;

/**
 *
 * @author Adamino
 */
public class AdaminoJavaExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyTunesViewMain main = new MyTunesViewMain();
        main.start();

        // Assignment 1
        /*
         * Create a MSSQL DB which should initially contain three tables
         *
         * -"Song"
         * This table needs the following columns:
         * ID -int- (Primary Key) AUTO INCREMENT
         * Title -nvarchar-
         * ArtistName -nvarchar- ALLOW NULL (Foreign Key to table Artist)
         * CategoryID -int- ALLOW NULL (Foreign key to table Category)
         * Duration -int- ALLOW NULL
         *
         * -"Artist"
         * ArtistID -int- (Primary Key) AUTO INCREMENT
         * Name -nvarchar- UNIQUE
         *
         * -"Category"
         * ID -int- (Primary Key) AUTO INCREMENT
         * Name -nvarchar- UNIQUE
         *
         * -Make sure to add a java user for the DB, which should have
         * db_datareader and db_datawriter under Membership!
         */
        //Assignment 2
        /*
         * -Add the Artist "Michael Jackson" to your DB
         * -Add the Category "POP" to your DB
         * -Add a Song by the artist in the category you added with an appr.
         * duration in whole minutes
         *
         */
        //Assignment 3
        /*
         * -Import the "sqljdbc4.jar" jar and fix the issues in
         * DBConnectionManager
         * -Copy the DB_Template file found in the root folder of the project to
         * a new file called DB in root and fill it
         * with your database and user information
         */
        //Assignment 4
        /*
         * -Implement functionality to System.out.println all the information
         * about all songs from the DB
         * in the method "start" in
         * MyTunesViewMain
         */
        //Assignment 5
        /*
         * -Import the "InputReaders.jar" and fix issues in the UserInput class
         * -Investigate the UserInput class and implement af method called
         * "addSongFromUser" in
         * MyTunesViewMain to create a new song and add it to the DB
         * (The creation in DAL should only take "Title" and "ID" as arguments,
         * for this project we choose to always put "1" as "ArtistID" and "1" as
         * "CategoryID". Just leave out duration (will make it NULL))
         */
        //Assignment 6
        /*
         * -Refactor your code to print out information about all songs in DB to
         * a method in MyTunesViewMain called "displayAllSongs"
         * Make sure that this is the only method called from the start method
         * in MyTunesViewMain
         */
        //Assignment 7
        /*
         * -Create a new method called "updateSong" which should ask the user
         * for an ID of a song to update and then ask for a new "Title" and
         * parse that to the DB
         * Make sure that this is the only method called from the start method
         * in MyTunesViewMain
         * (Check if UserInput has a method to help with the input of ID and new
         * title!)
         */
        //Assignment 8
        /*
         * -Create a new method called "deleteSong" which should ask the user
         * for an ID of a song to delete and then parse it to the DB
         * Make sure that this is the only method called from the start method
         * in MyTunesViewMain
         * (Again UserInput might have a handy method to get the ID)
         */
        //Assignment 9
        /*
         * This project has a method called "promptUser" which has been
         * commented out
         * -Comment it back in, also in the start method and try to run the
         * program.
         * If you get a fully functional menu you've passed the exam!
         */
    }

}
