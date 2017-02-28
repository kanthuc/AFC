package com.srikc.audioflashcards.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by srikc on 2/25/2017.
 */

public class Manager {
    private HashMap<String, AudioSet> audioSets;
    private String fileRootPath;

    public Manager(String fileRootPath) throws Exception {
        readAudioSets();
    }

    /**
     * Read all the flash cards from the json file
     * @throws Exception
     */
    private void readAudioSets() throws Exception {
        //TODO this should move to the filemanager
        File file = new File(fileRootPath + "audiocard.json");
        ObjectMapper mapper = new ObjectMapper();
        List<AudioSet> audioSetList = mapper.readValue(file, new TypeReference<List<AudioSet>>() {
        });

        audioSets = new HashMap<String, AudioSet>();
        for (AudioSet audioSet : audioSetList) {
            audioSets.put(audioSet.getTitle(), audioSet);
        }
    }

    /**
     * Save the file to the file system
     */
    public void saveAudioSets() throws Exception {
        //TODO this should move to FileManager
        File file = new File(fileRootPath + "audiocard.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(file, audioSets.values());
    }

    /**
     * Get a specific AudioSet by title
     * @param title
     * @return AudioSet
     */
    public AudioSet getAudioSet(String title) {
        if (audioSets != null) {
            return audioSets.get(title);
        }
        return null;
    }

    /**
     * Get an AudioSetManager for a specific AudioSet by title
     * @param title
     * @return AudioSetManager
     */
    public AudioSetManager getAudioSetManager(String title) {
        if (audioSets != null) {
            return new AudioSetManager(audioSets.get(title));
        }
        return null;
    }

    /**
     * Return list of all the audioSet names
     * @return List of names of audio sets
     */
    public Set<String> getAudioSets() {
        return audioSets.keySet();
    }

    /**
     * Adds a new audioSet to the HashMap and returns the new audioSet
     * @param title
     * @return new audio set
     */
    public AudioSet addAudioSet(String title) throws Exception {
        AudioSet audioSet = new AudioSet(title);
        audioSets.put(title, audioSet);
        saveAudioSets();
        return audioSet;
    }

    /**
     * update the HashMap with the modified audioSet
     * @param title
     * @param audioSet
     */
    public void updateAudioSet(String title, AudioSet audioSet) throws Exception {
        audioSets.put(title, audioSet);
        saveAudioSets();
    }

    /**
     * deletes an audioSet with the given title
     * @param title
     */
    public void deleteAudioSet (String title) throws Exception {
        audioSets.remove(title);
        saveAudioSets();
    }
}
