package main.java.com.epam.online.service;

import main.java.com.epam.online.entity.Gamer;
import main.java.com.epam.online.repository.PlayerRepository;

public class PlayerService {
    private PlayerRepository activePlayerRepository = new PlayerRepository();

    public Gamer getActivePlayer() {
        return activePlayerRepository.getActivePlayer();
    }

    public void setActivePlayer(Gamer gamer) {
        activePlayerRepository.setActivePlayer(gamer);
    }

    public Gamer getPassivePlayer() {
        return activePlayerRepository.getPassivePlayer();
    }
}
