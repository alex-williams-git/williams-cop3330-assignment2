package ex35;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testWinner()
    {
        ArrayList<String> contestantList = new ArrayList<String>();

        contestantList.add("Joe");
        contestantList.add("Billy");
        contestantList.add("Megan");
        contestantList.add("Alex");

        String winner = App.pickWinner(contestantList);

        int Boolean = 0;
        int length = contestantList.size();

        for(int i = 0; i < length; i++)
        {
            if(winner.equals(contestantList.get(i)))
                Boolean = 1;
        }

        assertEquals(1, Boolean);
    }
}