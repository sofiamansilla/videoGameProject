package Logic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<VideoGame> listVideoGames = new ArrayList<VideoGame>();

        VideoGame video1 = new VideoGame(123,"Banjo Kazooie", "Nintendo", 4, "Plataforma");
        VideoGame video2 = new VideoGame(124,"Counter Strike", "PC", 10, "Shooter");
        VideoGame video3 = new VideoGame(125,"Gear of war", "xbox", 12, "Shooter");
        VideoGame video4 = new VideoGame(126,"it take two", "xbox", 2, "Strategy");
        VideoGame video5 = new VideoGame(127,"Fortnite", "Ps4", 20, "Shooter");

        listVideoGames.add(video1);
        listVideoGames.add(video2);
        listVideoGames.add(video3);
        listVideoGames.add(video4);
        listVideoGames.add(video5);

        for (VideoGame video : listVideoGames)
        {
            System.out.println("Title: " + video.getTitle()  + " Console: " + video.getConsole() + " number of players: " + video.getNumberOfPlayers());
        };

        /*Change name and number of players of two games*/

        video1.setTitle("Counter Strike 1.6");
        video1.setNumberOfPlayers(12);

        video3.setTitle("Gear of war 3");
        video3.setNumberOfPlayers(4);

        for (VideoGame video : listVideoGames)
        {
            if (video.getConsole().equals("xbox")){
                System.out.println(video.toString());
            };
        };





    }
}
