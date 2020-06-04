package main.java.com.epam.online.service;

import main.java.com.epam.online.entity.Gamer;

public class PrintService {
    public void printSticksLeft(int sticksLeft) {
        System.out.println("На столе осталось " + sticksLeft + " спичек");
    }

    public void printComputerPull(int pulledMatches) {
        System.out.println("Количество спичек, которые убрал Мэтр Теней:" + pulledMatches);
    }

    public void printHumanPull() {
        System.out.println("Ваш ход. Введите количество спичек (не более 3):");
    }

    public void printTheWinner(Gamer gamer) {
        System.out.println("Последняя списка осталась у " + gamer + ". К сожалению, Вы проиграли.");
    }

    public void errorValue() {
        System.out.println("Вы ввели некорректное значение. Попробуйте еще раз!");
    }
}
