package lesson1;

import lesson1.Competitors.Competitor;
import lesson1.obstacles.Obstacle;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for(Competitor competitor: team.competitors) {
            for(Obstacle obstacle: obstacles) {
                obstacle.doIt(competitor);
            }
        }
    }
}
