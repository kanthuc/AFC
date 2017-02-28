package com.srikc.audioflashcards.api;

import android.support.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by srikc on 2/17/2017.
 */

public class AudioSet implements Serializable {
    String title;
    List<Card> cardList;

    //properties not serialized
    private List<Card> randomizedCardList;

    public AudioSet(String title) {
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    protected void setCardList(List<Card> cardList){
        this.cardList = cardList;
        this.randomizedCardList = cardList;
    }

    public List<Card> getCardList(){
        if (cardList == null) {
            cardList = new ArrayList<Card>();
        }
        return cardList;
    }

    @JsonIgnore
    public List<Card> getRandomizedCardList() { return randomizedCardList; }

    @JsonIgnore
    protected void setRandomizedCardList(List<Card> cardList) { this.randomizedCardList = cardList; }
}
