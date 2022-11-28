package frc.robot.layout;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.util.controllers.CommandMap;
import frc.robot.util.controllers.GameController;

import frc.robot.subsystems.ExampleMotor;

public abstract class DriverMap extends CommandMap {

  public DriverMap(GameController controller) {
    super(controller);
  }

  abstract JoystickButton getMotorButton();

  @Override
  public void registerCommands() {
    ExampleMotor singleMotor = ExampleMotor.getInstance();

    getMotorButton()
    .whenPressed(
      new InstantCommand(singleMotor::switchState)
      );
  }
}
