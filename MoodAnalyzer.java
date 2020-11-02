public class MoodAnalyzer {

    public String analyzeMood(String mood){
        if (mood.contains("Sad")){
            return "SAD";
        }
        else{
            return "HAPPY";
        }
    }
}
