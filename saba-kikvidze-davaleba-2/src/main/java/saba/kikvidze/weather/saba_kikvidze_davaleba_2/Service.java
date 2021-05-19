package saba.kikvidze.weather.saba_kikvidze_davaleba_2;

public class Service {

    public static String answer(String question) {
        API client = new API();

        String result;

        try {
            if (question.equals("all")) {
                result = client.get("weather/");
            } else {
                result = client.get("weather/" + question);
            }
        } catch (Exception e) {
            result = "An error occurred, please try again later";
            System.out.println(e.getMessage());
        }

        return result;
    }
}
