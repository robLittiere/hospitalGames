package com.company;

public class Song {
    private String author;
    private String songName;
    private String duration;

    public Song(String author, String songName, String duration) {
        this.author = author;
        this.songName = songName;
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
}
