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
         * ArtistName -nvarchar- (Foreign Key to table Artist)
         * CategoryID int ALLOW NULL (Foreign key to table Category)
         * Duration int ALLOW NULL
         *
         * -"Artist"
         * ArtistID -int- (Primary Key) AUTO INCREMENT
         * Name -nvarchar- UNIQUE
         *
         * -"Category"
         * ID -int- (Primary Key) AUTO INCREMENT
         * Name -nvarchar-
         *
         * -Make sure to add a java user for the DB, which should have
         * db_datareader and db_datawriter under Membership!
         */
        //Assignment 2
        /*
         * -Import the sqljdbc4 jar and fix the issues in DBConnectionManager
         * -Edit the DB_Template file found in the root folder of the project
         * with your database and user information
         */
        //Assignment 3
        /*
         * -Add an Artist to your DB
         * -Add a Category to your DB
         * -Add a Song by the artist in the category you added with an appr.
         * duration in whole minutes
         *
         */
        //Assignment 4
        /*
         * -Structure this app into 3-layered architecture
         * -Create a SongDAO with a method to get all songs from the DB
         * -System.out.println all the information about all songs in
         * MyTunesViewMain
         */
    }

}
