package org.secuso.privacyfriendlymemory;

import org.junit.Before;
import org.junit.Test;
import org.secuso.privacyfriendlymemory.model.CardDesign;
import org.secuso.privacyfriendlymemory.model.MemoryDifficulty;
import org.secuso.privacyfriendlymemory.model.MemoryImages;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MemoryImagesTest {

    private static final int     EXPECTED_SIZE_EASY        = MemoryDifficulty.Easy.getDeckSize()/2;
    private static final int     EXPECTED_SIZE_MODERATE    = MemoryDifficulty.Moderate.getDeckSize()/2;
    private static final int     EXPECTED_SIZE_HARD        = MemoryDifficulty.Hard.getDeckSize()/2;

    private static List<Integer> IMAGES_FIRST_EASY         = new LinkedList<>();
    private static List<Integer> IMAGES_FIRST_MODERATE     = new LinkedList<>();
    private static List<Integer> IMAGES_FIRST_HARD         = new LinkedList<>();

    @Before
    public void setupImages(){
        IMAGES_FIRST_EASY       = MemoryImages.getResIDs(CardDesign.FIRST, MemoryDifficulty.Easy);
        IMAGES_FIRST_MODERATE   = MemoryImages.getResIDs(CardDesign.FIRST, MemoryDifficulty.Moderate);
        IMAGES_FIRST_HARD       = MemoryImages.getResIDs(CardDesign.FIRST, MemoryDifficulty.Hard);
    }

    @Test
    public void testFirstDeck(){
        assertEquals("List size not as expected", EXPECTED_SIZE_EASY, IMAGES_FIRST_EASY.size());
        assertEquals("List size not as expected", EXPECTED_SIZE_MODERATE, IMAGES_FIRST_MODERATE.size());
        assertEquals("List size not as expected", EXPECTED_SIZE_HARD, IMAGES_FIRST_HARD.size());
    }


}