/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import ohtuesimerkki.*;

/**
 *
 * @author alpa
 */
public class StatisticsTest {

    Reader readerStub = new ReaderStub();
    Statistics stats = new Statistics(readerStub);

    @Test
    public void searchReturnsRightPlayer() {
        assertEquals("Kurri", stats.search("Kurri").getName());
    }

    @Test
    public void searchDoesntReturnInexistantPlayer() {
        assertEquals(null, stats.search("Paavola"));
    }

    @Test
    public void teamReturnsAllTeamMembers() {
        assertEquals(3, stats.team("EDM").size());
        assertEquals(1, stats.team("DET").size());
    }

    @Test
    public void teamDoesntReturnInexistantTeam() {
        assertEquals(0, stats.team("HUP").size());
    }

    @Test
    public void topScorerReturnRightTopPlayer() {
        assertEquals("Gretzky", stats.topScorers(1).get(0).getName());
    }

    @Test
    public void topScorerReturnsRightAmountOfPlayers() {
        assertEquals(4, stats.topScorers(3).size());
    }
}
