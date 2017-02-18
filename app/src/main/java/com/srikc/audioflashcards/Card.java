package com.srikc.audioflashcards;

import java.io.File;
/**
 * Created by srikc on 2/17/2017.
 */

public class Card {
    private String title;
    private File term;
    private File definition;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTerm(File term){
        this.term = term;
    }

    public File getTerm(){
        return term;
    }

    public void setDefinition(File definition){
        this.definition = definition;
    }

    public File getDefinition(){
        return definition;
    }
}
