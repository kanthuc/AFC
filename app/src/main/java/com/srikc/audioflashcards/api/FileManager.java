package com.srikc.audioflashcards.api;

/**
 * Created by srikc on 2/27/2017.
 */

/**
 * This class managers all the file I/O operations
 */
public class FileManager {
    private final String fileRootPath;

    public FileManager(String fileRootPath) {
        this.fileRootPath = fileRootPath;
    }

    /**
     * Root Path where all the audio files and the json files are stored
     * @return
     */
    protected String getFileRootPath() { return fileRootPath; }
}
