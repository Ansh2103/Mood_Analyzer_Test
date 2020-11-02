import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

     @Test
     public void testMood_WhenStringContainSad_ShouldReturnSad() {
         MoodAnalyzer moodAnalyser = new MoodAnalyzer();
         String isMoodSad = moodAnalyser.analyzeMood("I am in Sad Mood");
         Assert.assertEquals("SAD" , isMoodSad);
     }

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String isMoodHappy = moodAnalyser.analyzeMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", isMoodHappy);
    }
}
