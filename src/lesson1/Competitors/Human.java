package lesson1.Competitors;

public class Human implements Competitor{
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    private boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " " + " успешно справился с кросс");
        } else {
            System.out.println(name + " " + " не смог преодолеть кросс");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " " + " успешно справился с препятствием");
        } else {
            System.out.println(name + " " + " не смог преодолеть препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }

    public String getName() {
        return this.name;
    }
    public int maxRunDistance() {
        return this.maxRunDistance;
    }
    public int maxJumpHeight() {
        return this.maxJumpHeight;
    }
    public int maxSwimDistance() {
        return this.maxSwimDistance;
    }

    public String getType() {
        return "Человек";
    }

}
