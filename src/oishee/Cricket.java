package mahinurRahman;

public class Cricket  extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of the player: "+player.playerName);
        System.out.println("Jersey number of the player: "+player.jerseyNumber);
    }
}

/*
    Name    : Mahinur Rahman
    ID      : 2012020160
    Section : D
    Batch   : 53rd
    Email   : cse_2012020160@lus.ac.bd | mahi121.mr@gmail.com
    Date    : 10.09.2021
    */
