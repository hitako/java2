package lesson1;

import lesson1.Competitors.Competitor;

public class Team {

    public Competitor[] competitors;

    public Team(Competitor[] competitors) {
        this.competitors = competitors;
    }

    public String getCompetitorsInfo() {
        String info = "";
        for(Competitor competitor: this.competitors) {
            showInfo("Тип", competitor.getType());
            showInfo("Имя", competitor.getName());
            showInfo("Максимальная дистанция кросса", competitor.maxRunDistance());
            showInfo("Максимальная высота прыжка", competitor.maxJumpHeight());
            showInfo("Максимальная дальность плавания", competitor.maxSwimDistance());
            System.out.println("====================================================");
        }

        return info;
    }

    private void showInfo(String prop, String value) {
        System.out.println(prop + ": " + value);
    }

    private void showInfo(String prop, int value) {
        System.out.println(prop + ": " + value);
    }

    public void showResult() {
        for(Competitor competitor: this.competitors) {
            System.out.println(competitor.getName() + " прошел все дистанции: " + competitor.isOnDistance());
        }
    }

}
