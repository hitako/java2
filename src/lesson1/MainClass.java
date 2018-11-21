package lesson1;

import lesson1.Competitors.*;
import lesson1.obstacles.Cross;
import lesson1.obstacles.Obstacle;
import lesson1.obstacles.Wall;
import lesson1.obstacles.Water;

public class MainClass {
    public static void main(String[] args) {
        Course c = new Course(new Obstacle[] {new Cross(400), new Wall(2), new Water(1)});
        Team team = new Team(new Competitor[] {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")});
        c.doIt(team);
        team.showResult();
    }
}
