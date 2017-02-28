package com.srikc.audioflashcards.api;

/**
 * Created by srikc on 2/25/2017.
 */

import java.util.Collections;

/**
 * Manages the cards in a single AudioSet
 */
public class AudioSetManager {
    private AudioSet audioSet;

    public AudioSetManager(AudioSet audioSet) {
        this.audioSet = audioSet;
    }

    /**
     * Shuffle the cards in the set so that they can be played in random order
     */
    public void randomize() {
        Collections.shuffle(audioSet.getRandomizedCardList());
    }

    /**
     * Add a new card to the set
     * @param card
     */
    public void addCard (Card card) {
        card.setNumber(audioSet.getCardList().size() + 1);
        audioSet.getCardList().add(card);
    }

    /**
     *
     * @param number
     */
    public void deleteCard (int number) {

        audioSet.getCardList().remove(number - 1);
    }

    public void updateCard (Card card) {

    }
}
