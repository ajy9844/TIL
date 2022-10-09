package designpattern.adapter.robot;

public interface Order {
    void run(Robot robot);
}

class MoveBackOrder implements Order {
    private int block;

    public MoveBackOrder(int block) {
        this.block = block;
    }

    public void run(Robot robot) {
        robot.turn(Robot.Direction.LEFT);
        robot.turn(Robot.Direction.LEFT);
        robot.moveForward(block);
    }
}
