package frc.team1793.robot.commands;

import org.strongback.command.Command;
import org.strongback.components.Solenoid;


public class SolenoidPrimaryCommand extends Command {

    private final Solenoid solenoid;

    public SolenoidPrimaryCommand(Solenoid solenoid) {
        this.solenoid = solenoid;
    }

    @Override
    public boolean execute() {
        solenoid.retract();

        return true;
    }
}

