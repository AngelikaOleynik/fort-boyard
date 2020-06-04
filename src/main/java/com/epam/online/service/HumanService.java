package main.java.com.epam.online.service;

import javax.print.PrintService;
import java.util.Scanner;

public class HumanService {
    private int lastMove=0;;

    public int pullMatches() {
        Scanner scanner  = new Scanner(System.in);
        lastMove = scanner.nextInt();
        if(lastMove<1||lastMove>3){
            lastMove=0;
        }
        return lastMove;
    }
    public int getLastMove(){
        return lastMove;
    }
}
