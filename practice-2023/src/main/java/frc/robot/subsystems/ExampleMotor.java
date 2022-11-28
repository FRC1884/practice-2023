package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap.MotorMap;

public class ExampleMotor extends SubsystemBase {
  private static ExampleMotor instance;

  public static ExampleMotor getInstance() {
    if (instance == null) instance = new ExampleMotor();
    return instance;
  }

  // Motors
  private CANSparkMax motor;

  // Constructor
  private ExampleMotor() {
    motor = new CANSparkMax(MotorMap.MOTOR, MotorType.kBrushless);
  }

  // Methods
  public void switchState() {
    if (motor.get() != 0) {
      motor.set(1.0);
    }

    else {
      motor.set(0.0);
    }
  }
}
