package com.srikc.audioflashcards;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.File;
import java.io.Serializable;

/**
 * Created by srikc on 2/17/2017.
 */

public class Card  implements Serializable {
    private String title;
    private String termFileName;
    private String definitionFileName;
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

    @JsonIgnore
    public File getTerm(){
        return term;
    }

    public void setDefinition(File definition){
        this.definition = definition;
    }

    @JsonIgnore
    public File getDefinition(){
        return definition;
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

    public void setDefinitionFileName(String definitionFileName) {
        this.definitionFileName = definitionFileName;
    }
}
