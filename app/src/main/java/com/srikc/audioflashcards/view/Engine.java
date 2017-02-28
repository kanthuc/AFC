package com.srikc.audioflashcards.view;

import com.srikc.audioflashcards.api.AudioSet;
import com.srikc.audioflashcards.api.Manager;

/**
 * Created by srikc on 2/17/2017.
 */

public class Engine {

    private Manager manager;

    public Engine (String fileRootPath) {
        try {
            manager = new Manager(fileRootPath);
        } catch (Exception e) {
            // show message to user
        }
    }

    public void createAudioSet(){

    }

    public void createCard(){

    }

    public void record(){

    }

    public AudioSet getSet(){
        return new AudioSet("new set");
    }

}
