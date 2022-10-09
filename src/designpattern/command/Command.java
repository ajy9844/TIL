package designpattern.command;

import static designpattern.command.Robot.*;

abstract class Command {
    protected Robot robot;

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public abstract void execute();
}

class MoveForwardCommand extends Command {
    int space;

    public MoveForwardCommand(int space) {
        this.space = space;
    }

    @Override
    public void execute() {
        robot.moveForward(space);
    }
}

class TurnCommand extends Command {
    Direction direction;

    public TurnCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void execute() {
        robot.turn(direction);
    }
}

class PickupCommand extends Command {
    @Override
    public void execute() {
        robot.pickup();
    }
}
