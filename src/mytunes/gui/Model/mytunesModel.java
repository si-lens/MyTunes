/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.gui.Model;

import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mytunes.be.Playlist;
import mytunes.be.Song;
import mytunes.bll.myTunesManager;
import mytunes.bll.mytunesLogicFacade;

/**
 *
 * @author Szymon
 */
public class mytunesModel {

    public final mytunesLogicFacade mytun;
    public ObservableList olSongs;
    public ObservableList olPlaylists;
    public mytunesModel() throws IOException {
        olSongs = FXCollections.observableArrayList();
        olPlaylists = FXCollections.observableArrayList();
        mytun = new myTunesManager();
    }

    public ObservableList getSongsAsObservable(){
        olSongs.addAll(getAllSongs());
    return olSongs;
    }
    public ObservableList getPlaylistsAsObservable(){
        olPlaylists.addAll(getAllPlaylists());
    return olPlaylists;
    }
    
    public ObservableList testMethod(){
    ObservableList test = FXCollections.observableArrayList();
    test.addAll(getAllSongs());
            return test;
    }
    public void createPlaylist(String nameOfplaylist) {
        mytun.createPlaylist(nameOfplaylist);
    }

    public void deletePlaylist(Playlist playlistToDelete) {
        mytun.deletePlaylist(playlistToDelete);
    }

    public List<Playlist> getAllPlaylists() {
        List<Playlist> p = mytun.getAllPlaylists();
        return p;
    }

    public void updatePlaylist(Playlist p) {
        mytun.updatePlaylist(p);
    }

    public void createSong(int id, String title, String artist, String category, String time, String path) {
        mytun.createSong(id, title, artist, category, time, path);
    }

    public void deleteSong(Song song) {
        mytun.deleteSong(song);
    }

    public List<Song> getAllSongs() {
        List<Song> s = mytun.getAllSongs();
        return s;
    }

    public void updateSong(Song song) {
        mytun.updateSong(song);
    }

    public List<Song> searchSong(String query) {
        List<Song> s = mytun.searchSong(query);
        return s;
    }

    public Integer nextAvailableSongID() {
        return mytun.nextAvailableSongID();
    }

    public Integer nextAvailablePlaylistID() {
        return mytun.nextAvailablePlaylistID();
    }
    public List<Song> getPlaylistSongs(Playlist p){
    return mytun.getPlaylistSongs(p);
    }
    
    public void addSongToPlaylist(Song s, Playlist p){
    mytun.addSongToPlaylist(s, p);
    }
}
