import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

     @Test
     public void testMood_WhenStringContainSad_ShouldReturnSad() {
         MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
         String isMoodSad = moodAnalyser.analyzeMood();
         Assert.assertEquals("SAD" , isMoodSad);
     }

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Any Mood");
        String isMoodHappy = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY", isMoodHappy);
    }
}
