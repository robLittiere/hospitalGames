package com.company;

import java.util.Scanner;

public class Song {
    private String author;
    private String songName;
    private String duration;
    private String songNameAsked;
    private String songAuthorAsked;

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


    public static void isInThePlaylist(){
        /*for (int i = 0; i < playlistJul.size(); i++) {
            if (playlistJul.get(i).getSongName().equals(songNameAsked) && playlistJul.get(i).getAuthor().equals(songAuthorAsked)) {
                indexCurentSong = playlistJul.indexOf(songNameAsked);
                System.out.println("Your now listening " + playlistJul.get(i).getSongName() + " de " + playlistJul.get(i).getAuthor());
                break;
            } else if (!playlistJul.get(i).getSongName().equals(songNameAsked)) {
                System.out.println("This song is not in your playlist");
            } else if (!playlistJul.get(i).getAuthor().equals(songAuthorAsked)){
                System.out.println("We don't have this song with this author");
            }
        }

        System.out.println("");*/
    }
    public void listenSong(){
        System.out.println("What song do you want to listen ?");
        Scanner songAsked;
        songAsked  = new Scanner(System.in);
        this.songNameAsked = songAsked.next();
        System.out.println("Who is the author?");
        this.songAuthorAsked = songAsked.next();
        isInThePlaylist();
        System.out.println("");
    }
}
