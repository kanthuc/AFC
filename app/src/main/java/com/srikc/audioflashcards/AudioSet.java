package com.srikc.audioflashcards;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by srikc on 2/17/2017.
 */

public class AudioSet implements Serializable {
    String title;
    List cardList;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCardList(List cardList){
        this.cardList = cardList;
    }

    public List getCardList(){
        return cardList;
    }
}
