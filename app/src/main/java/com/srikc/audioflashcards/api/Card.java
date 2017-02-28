package com.srikc.audioflashcards.api;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.File;
import java.io.Serializable;

/**
 * Created by srikc on 2/17/2017.
 */

public class Card  implements Serializable {
    private int number;
    private String title;
    private String termFileName;
    private String definitionFileName;

    //properties not serialized
    private File term;
    private File definition;

    public Card (String termFileName, String definitionFileName) {
        this.termFileName = termFileName;
        this.definitionFileName = definitionFileName;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String getTermFileName() {
        return termFileName;
    }

    public String getDefinitionFileName() {
        return definitionFileName;
    }

    public void setTermFileName(String termFileName) {
        this.termFileName = termFileName;
    }

    public void setDefinitionFileName(String definitionFileName) { this.definitionFileName = definitionFileName; }

    @JsonIgnore
    public void setTerm(File term){
        this.term = term;
    }

    @JsonIgnore
    public File getTerm(){
        return term;
    }

    @JsonIgnore
    public void setDefinition(File definition){
        this.definition = definition;
    }

    @JsonIgnore
    public File getDefinition(){
        return definition;
    }
}