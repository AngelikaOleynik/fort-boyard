package main.java.com.epam.online.service;

import main.java.com.epam.online.repository.SticksRepository;

public class SticksService {
    SticksRepository sticksRepository = new SticksRepository();
    public void pull(int valueOfMatches){
        sticksRepository.setSticksLeft(sticksRepository.getSticksLeft()-valueOfMatches);

    }
    public int getSticksLeft(){
        return sticksRepository.getSticksLeft();
    }
}
