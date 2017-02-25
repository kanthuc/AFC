package com.srikc.audioflashcards;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * Created by srikc on 2/17/2017.
 */

public class Engine {

    private List<AudioSet> audioSets;

    public void init() throws Exception{
        File file = new File("c:\\audiocard.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(file, new TypeReference<List<AudioSet>>() {});

    }

    public void createAudioSet(){

    }

    public void createCard(){

    }

    public void record(){

    }

    public AudioSet getSet(){
        return new AudioSet();
    }

    public void setAudioSets(List<AudioSet> audioSets){
        this.audioSets = audioSets;
    }

    public List<AudioSet> getAudioSets(){
        return audioSets;
    }
}
