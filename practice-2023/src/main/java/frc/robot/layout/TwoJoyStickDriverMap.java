package frc.robot.layout;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.util.controllers.ButtonMap.Axis;
import frc.robot.util.controllers.ButtonMap.Button;
import frc.robot.util.controllers.GameController;

@SuppressWarnings("unused")
public class TwoJoyStickDriverMap extends DriverMap {

  public TwoJoyStickDriverMap(GameController controller) {
    super(controller);
  }

  public JoystickButton getMotorButton() {
    return controller.getButton(Button.BUTTON_A);
  }

  @Override
  public void registerCommands() {
    super.registerCommands();
  }
}
