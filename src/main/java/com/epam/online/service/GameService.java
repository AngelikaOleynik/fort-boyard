package main.java.com.epam.online.service;

import main.java.com.epam.online.entity.Computer;
import main.java.com.epam.online.entity.Human;

public class GameService {
    private int counterOfMove = 1;
    private ComputerService computerService = new ComputerService();
    private HumanService humanService = new HumanService();
    private PlayerService playerService = new PlayerService();
    private Computer computer = new Computer();
    private Human human = new Human();
    private PrintService printService = new PrintService();
    private SticksService sticksService = new SticksService();


    public void startGame() {
        while (true) {
            computerMove();
            if (sticksService.getSticksLeft() == 1) {
                break;
            }
            humanMove();
        }
        printService.printTheWinner(playerService.getPassivePlayer());
    }

    private void computerMove() {
        playerService.setActivePlayer(computer);
        printService.printSticksLeft(sticksService.getSticksLeft());
        printService.printComputerPull(computerService.pullMatches(counterOfMove, humanService.getLastMove()));
        sticksService.pull(computerService.pullMatches(counterOfMove, humanService.getLastMove()));
        counterOfMove++;
    }

    private void humanMove() {
        playerService.setActivePlayer(human);
        printService.printSticksLeft(sticksService.getSticksLeft());
        printService.printHumanPull();
        sticksService.pull(humanService.pullMatches());
        if (humanService.getLastMove() < 1 || humanService.getLastMove() > 3) {
            printService.errorValue();
            humanMove();
        }
    }
}
