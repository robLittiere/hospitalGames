package com.company;

import java.util.*;

public class playlistLaunch {



    public static String playlistLaunch(String menu){
        while(true){
            System.out.println("Hi this is where you manage and listen to your playlist");
            System.out.println("Press --Enter-- to start listening to music");
            System.out.println("You can write --quit-- or --q-- to go back to the main menu if you want to");
            String choice = Menu.scanEntry();
            if (choice.equals("quit") || choice.equals("q")) {
                menu = "m";
                break;
            }
            else if(choice.toLowerCase().equals("enter") || choice.equals("e")){
                while(true) {
                    if (Main.listePlaylist.isEmpty()) {
                        System.out.println("I can see you currently have no playlist registered, let's create one !");
                        System.out.println();
                        System.out.println("Enter the name of your first playlist ");
                        String playlistName = Menu.scanEntry();
                        Playlist playlist1 = new Playlist(playlistName);

                        //Add playlist to the list of playlist
                        Main.listePlaylist.add(playlist1);
                        System.out.println("You can write --add-- to add a song to your playlist or write --quit-- to go back to the main menu");

                        String userInput = Menu.scanEntry();
                        if(userInput.equals("quit") || userInput.equals("q")){
                            menu = "m";
                            break;
                        }

                        else if (userInput.equals("add") || userInput.equals("a")){
                            Song song = Song.createSong();
                            playlist1.addSongs(song);

                        }
                    }

                    else{
                        System.out.println("|-------------------------------|");
                        System.out.println("Here are your playlists");
                        System.out.println();
                        Playlist.printAllPlaylist();


                        System.out.println();
                        System.out.println("Enter --play-- to listen to one your playlists");
                        System.out.println("Enter --manage-- to start managing your playlists");
                        System.out.println("Enter --quit-- to go back to the main menu");
                        System.out.println("|-------------------------------|");

                        choice = Menu.scanEntry();

                        if (choice.equals("quit") || choice.equals("q")) {
                            menu = "m";
                            break;
                        }
                        else if (choice.equals("play") || choice.equals("p")) {
                                //Start playing a song
                                play();

                            }
                        else if (choice.equals("manage") || choice.equals("m")) {
                            while (true) {     //Start managing playlists
                                System.out.println("Enter --access-- to access a specific playlist and add or delete songs");
                                System.out.println("Enter --create-- to create a playlist");
                                System.out.println("Enter --clear-- to clear a playlist");
                                System.out.println("Enter --delete--to delete a playlist ");
                                System.out.println("Enter --quit-- to go back to the main menu");


                                choice = Menu.scanEntry();

                                if (choice.equals("quit") || choice.equals("q")){
                                    break;
                                }

                                else if (choice.equals("access") || choice.equals("a")) {

                                    while (true) {
                                        System.out.println("Here you'll be able to add or delete songs");
                                        System.out.println();
                                        System.out.println("Here are your playlists");
                                        System.out.println();
                                        Playlist.printAllPlaylist();
                                        System.out.println();

                                        System.out.println("Enter the name of the playlist you wish to modify");
                                        System.out.println("Enter --quit-- to go back to the previous menu");
                                        String playlistName = Menu.scanEntry().toLowerCase();
                                        if (playlistName.equals("quit") || playlistName.equals("q")) {
                                            break;
                                        }
                                        Playlist playlistUser = Playlist.findPlaylist(playlistName);

                                        System.out.println();
                                        System.out.println("Very well, now enter --add-- or --delete-- to add or delete a song in " + playlistUser.getPlaylistName());
                                        System.out.println("Enter --quit-- to go back to the previous menu");
                                        choice = Menu.scanEntry();

                                        if (choice.equals("quit") || choice.equals("q")) {
                                            break;

                                        } else if (choice.equals("add") || choice.equals("a")) {
                                            System.out.println("Let's add a song in " + playlistUser.getPlaylistName());
                                            Song song = Song.createSong();
                                            playlistUser.addSongs(song);
                                            System.out.println();
                                            System.out.println(song.getSongName() + " by " + song.getAuthor() + " has been added to " + playlistUser.getPlaylistName());

                                        } else if (choice.equals("delete") || choice.equals("d")) {
                                            System.out.println("Let's delete a song from " + playlistUser.getPlaylistName());
                                            System.out.println();
                                            System.out.println("Here are all the songs in " + playlistUser.getPlaylistName());
                                            System.out.println();
                                            playlistUser.printAllSongs();

                                            System.out.println("Please indicate the title of the song you wish to delete");
                                            String songToDelete = Menu.scanEntry();
                                            if (playlistUser.deleteSong(songToDelete)) {
                                                System.out.println(songToDelete + " has been deleted from your playlist " + playlistUser.getPlaylistName());
                                            }
                                        }


                                    }

                                } else if (choice.equals("create") || choice.equals("c")) {
                                    while (true) {
                                        System.out.println("Here you can create a playlist");
                                        System.out.println();
                                        System.out.println("Enter the name of your playlist ");
                                        System.out.println("You can go back to the previous menu by entering --quit--");
                                        String playlistName = Menu.scanEntry();

                                        if (playlistName.equals("quit") || playlistName.equals("q")) {
                                            break;
                                        }

                                        Playlist playlist2 = new Playlist(playlistName);
                                        Main.listePlaylist.add(playlist2);
                                        System.out.println();
                                        System.out.println("The playlist " + playlist2.getPlaylistName() + " has been added");
                                    }
                                } else if (choice.equals("clear") || choice.equals("cl")) {
                                    while(true) {
                                        System.out.println("Here are your playlists");
                                        System.out.println();
                                        Playlist.printAllPlaylist();
                                        System.out.println();
                                        System.out.println("You can enter the name of the playlist you wish to clear");
                                        System.out.println("Or enter --quit-- to go back to the previous menu");
                                        String playlistName = Menu.scanEntry();
                                        if (playlistName.equals("quit") || playlistName.equals("q")) {
                                            break;
                                        }
                                        Playlist playlistToClear = Playlist.findPlaylist(playlistName);
                                        playlistToClear.clearPlaylist();
                                        System.out.println("Your playlist " + playlistName + " has been cleared");
                                    }

                                } else if (choice.equals("delete") || choice.equals("d")) {
                                    while(true) {
                                        System.out.println("Here are your playlists");
                                        System.out.println();
                                        Playlist.printAllPlaylist();
                                        System.out.println();
                                        System.out.println("Enter the name of the playlist you wish to delete");
                                        System.out.println("Enter --quit-- to go back to the previous menu");
                                        String playlistName = Menu.scanEntry();
                                        if(playlistName.equals("quit") || playlistName.equals("q")){
                                            break;
                                        }
                                        Playlist playlistToDelete = Playlist.findPlaylist(playlistName);
                                        playlistToDelete.deletePlaylist();
                                        System.out.println("Your playlist " + playlistName + " has been deleted");
                                    }
                                }

                            }

                        }

                    }
                    break;
                }


            }
            break;


        }








        return menu;
    }

    public static void play() {
        Playlist playlist = null;
        List<Song> songs = null;


        Scanner scanner= new Scanner(System.in);

        int indexSong = 0;



        while (true){
            System.out.println("|-------------------------------|");
            System.out.println();
            System.out.println("Write the name of the playlist you want to listen");
            System.out.println();
            System.out.println("|-------------------------------|");
            String playlistName = scanner.next();
            boolean playlistExist = false;

            for (int i = 0; i < Main.listePlaylist.size(); i++) {
                if (Main.listePlaylist.get(i).getPlaylistName().equals(playlistName)){
                    playlistExist = true;
                    playlist = Main.listePlaylist.get(i);
                    songs = playlist.getSongs();
                    break;
                } else {
                    playlistExist = false;
                }
            }
            if (playlistExist == true){
                break;
            }  else {
                System.out.println("This playlist do not exist");
            }
        }
        playlist.printAllSongs();
        System.out.println("|-------------------------------|");
        System.out.println();
        System.out.println("Write --Order-- to listen the playlist in order");
        System.out.println("Write --Random-- to listen the playlist in a random order");
        System.out.println();
        System.out.println("|-------------------------------|");
        String userInput = scanner.next();
            boolean isQuit = false;
            boolean random = false;


            if (playlist.isEmpty()){
                System.out.println("No song in this playlist");
                return;
            }
            else if (userInput.toLowerCase().equals("order") || userInput.toLowerCase().equals("o")){
                random = false;
                indexSong = 0;
                playlist.printCurrentSong(indexSong);
                printMenuSong(random);

            } else if (userInput.toLowerCase().equals("random") || userInput.toLowerCase().equals("r")){
                random = true;
                indexSong = randomSong(songs);
                playlist.printCurrentSong(indexSong);
                printMenuSong(random);
            }

            while (!isQuit){
                String choose = scanner.next();
                scanner.nextLine();

                if (choose.toLowerCase().equals("stop") || choose.toLowerCase().equals("s")){
                    System.out.println("Playlist is done");
                    isQuit = true;
                    break;
                }

                if (choose.toLowerCase().equals("next") || choose.toLowerCase().equals("n")){
                    if (random) {
                        indexSong = randomSong(songs);
                        System.out.println("|-------------------------------|");
                        System.out.println();
                        playlist.printCurrentSong(indexSong);
                    } else if (!random && indexSong < songs.size() -1){
                        indexSong++ ;
                        System.out.println("|-------------------------------|");
                        playlist.printCurrentSong(indexSong);
                    } else {
                        System.out.println("|-------------------------------|");
                        System.out.println("We have reached the end of the playlist");
                    }
                    printMenuSong(random);
                    System.out.println("|-------------------------------|");
                }


                if (choose.toLowerCase().equals("prev") || choose.toLowerCase().equals("p")){
                    if (random) {
                        indexSong = randomSong(songs);
                        System.out.println("|-------------------------------|");
                        playlist.printCurrentSong(indexSong);
                    } else if (!random && indexSong > 0){
                        indexSong--;
                        System.out.println("|-------------------------------|");
                        playlist.printCurrentSong(indexSong);
                    } else{
                        System.out.println("|-------------------------------|");
                        System.out.println("We are at the start of the playlist");
                    }
                    printMenuSong(random);
                    System.out.println("|-------------------------------|");
                }

                if (choose.toLowerCase().equals("replay") || choose.toLowerCase().equals("r")){
                    System.out.println("|-------------------------------|");
                    playlist.printCurrentSong(indexSong);
                    printMenuSong(random);
                    System.out.println("|-------------------------------|");
                }

                if (choose.toLowerCase().equals("random")){
                    random = true;
                    System.out.println("|-------------------------------|");
                    System.out.println("Your now in random order");
                    printMenuSong(random);
                    System.out.println("|-------------------------------|");
                }

                if (choose.toLowerCase().equals("order") || choose.toLowerCase().equals("o")){
                    random = false;
                    System.out.println("|-------------------------------|");
                    System.out.println(" Your now in the basic order ");
                    printMenuSong(random);
                    System.out.println("|-------------------------------|");
                }
            }
        }

    private static void printMenuSong(boolean random) {
        System.out.println();
        System.out.println("What you can do now : ");
        if (!random){
            System.out.println("--Stop--- to stop\n" + "--Next to play next song\n" + "--Prev-- to play previous song\n" + "--Replay-- to replay the current song\n" + "--Random-- to pass to random order");
            System.out.println();
        }
        if (random){
            System.out.println("--Stop--- to stop\n" + "--Next to play next song\n" + "--Prev-- to play previous song\n" + "--Replay-- to replay the current song\n" + "--Order-- to pass to order");
            System.out.println();
        }
    }


    private static int randomSong(List<Song> songs) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(songs.size());
        return randomIndex;
    }
}
