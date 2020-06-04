package main.java.com.epam.online.service;

public class ComputerService {
    public int pullMatches(int countOfMove, int humanPull) {
        if (countOfMove == 1) {
            return 3;
        } else {
            return 4 - humanPull;
        }

    }
}
