package com.company;

import java.util.Scanner;

public class Song {
    private String author;
    private String songName;
    private String duration;
    private String songNameAsked;
    private String songAuthorAsked;

    public Song(String author, String songName, String duration) {
        this.songName = songName;
        this.author = author;
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public String getSongName() {
        return songName;
    }

    public String getDuration() {
        return duration;
    }


    public static Song createSong(){
        System.out.println("Alrighty, write the name of the song you want to add");
        String songName = Menu.scanEntry();
        System.out.println("Now, write which artist made the song");
        String songArtist = Menu.scanEntry();
        System.out.println("Finally, write the duration in seconds of the song");
        String songDuration = Menu.scanEntry();
        Song song = new Song(songArtist, songName, songDuration);
        return song;
    }
}
