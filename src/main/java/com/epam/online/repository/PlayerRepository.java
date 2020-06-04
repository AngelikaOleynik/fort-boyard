package main.java.com.epam.online.repository;

import main.java.com.epam.online.entity.Gamer;

public class PlayerRepository {
    private Gamer activePlayer;
    private Gamer passivePlayer;

    public Gamer getActivePlayer() {
        return activePlayer;
    }
    public Gamer getPassivePlayer(){
        return passivePlayer;
    }

    public void setActivePlayer(Gamer gamer) {
        this.passivePlayer= this.activePlayer;
        this.activePlayer = gamer;
    }


}
