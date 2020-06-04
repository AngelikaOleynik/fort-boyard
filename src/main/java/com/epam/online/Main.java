package main.java.com.epam.online;

import main.java.com.epam.online.service.GameService;

public class Main {
    public static void main(String[] args) {
        System.out.println("В игре «Палочки» Вам необходимо будет продемонстрировать своё умение просчитывать ходы наперёд." +
                " На игровом поле перед Вами находятся двадцать деревянных палочек. Вы и Мэтр Теней, по очереди, будете брать" +
                " одну, две или три палочки (сколько именно брать — решать игроку). Взявший последнюю палочку проигрывает," +
                " поэтому цель игры заключается в том, чтобы оставить эту палочку оппоненту.");

        GameService gameService = new GameService();
        gameService.startGame();
    }
}
