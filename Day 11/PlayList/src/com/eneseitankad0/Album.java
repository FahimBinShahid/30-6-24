package com.eneseitankad0;

import dev.lpa.Song;
import java.util.LinkedList;

public class Album {
    private LinkedList<Song> albumList = new LinkedList<>();
    private String name;
    private String artist;

    // Constructor for Album
    public Album(String name, String artist) {
        this.artist = artist;
        this.name = name;
        System.out.println("New album added");
    }

    public LinkedList<Song> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(LinkedList<Song> albumList) {
        this.albumList = albumList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to add a song to the album
    public void addSong(String name, double duration) {
        albumList.add(new Song(name, duration));
        System.out.println("New song " + name + ": " + duration + "s" + " added to album " + this.name);
    }

    // Method to print the names of all songs in the album
    public void getSongsFromInside() {
        for (int i = 0; i < this.albumList.size(); i++) {
            System.out.println("    " + this.albumList.get(i).getName());
        }
    }

    // Method to find a song by name in the album
    private Song findSong(String name) {
        for (Song checkedSong : this.albumList) {
            if (checkedSong.getName().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }

    // Method to add a song to a playlist based on track number
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < this.albumList.size())) {
            playlist.add(this.albumList.get(index));
            return true;
        }
        System.out.println("This album does not contain track number: " + trackNumber);
        return false;
    }

    // Method to add a song to a playlist based on song title
    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        Song checkedSong = findSong(songTitle);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            System.out.println("Song " + songTitle + " added to playlist");
            return true;
        }
        System.out.println("Cannot find song");
        return false;
    }
}
