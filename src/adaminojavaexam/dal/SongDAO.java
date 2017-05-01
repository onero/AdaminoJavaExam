/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.dal;

import adaminojavaexam.be.Song;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SongDAO {

    private DBConnectionManager cm;

    public SongDAO() {
        cm = null;
        try {
            this.cm = DBConnectionManager.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(SongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Get all songs from DB
     *
     * @return
     */
    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();

        try (Connection con = cm.getConnection()) {
            String sql = "SELECT s.ID AS 'SongID', "
                    + "s.Title AS 'SongTitle', "
                    + "a.Name AS 'ArtistName', "
                    + "c.Name AS 'CategoryName', "
                    + "s.Duration AS 'SongDuration' "
                    + "FROM Song s "
                    + "JOIN Artist a ON a.ArtistID = s.ArtistID "
                    + "JOIN Category c ON c.ID = s.CategoryID";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                songs.add(getOneSong(rs));
            }
        } catch (SQLServerException ex) {
            Logger.getLogger(SongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return songs;
    }

    private Song getOneSong(ResultSet rs) throws SQLException {
        int ID = rs.getInt("SongID");
        String title = rs.getString("SongTitle");
        String artist = rs.getString("ArtistName");
        String category = rs.getString("CategoryName");
        int duration = rs.getInt("SongDuration");

        return new Song(ID, title, artist, category, duration);
    }

}
