// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {

  /** The motors on the right side of the drive. */
  private CANSparkMax rightMotor1 =
      new CANSparkMax(Constants.DrivetrainConstants.rightMotor1, MotorType.kBrushed);

  private CANSparkMax rightMotor2 =
      new CANSparkMax(Constants.DrivetrainConstants.rightMotor2, MotorType.kBrushed);

  /** The motors on the left side of the drive. */
  private CANSparkMax leftMotor1 =
      new CANSparkMax(Constants.DrivetrainConstants.leftMotor1, MotorType.kBrushed);

  private CANSparkMax leftMotor2 =
      new CANSparkMax(Constants.DrivetrainConstants.leftMotor2, MotorType.kBrushed);

  /** Configuration for the motor controllers to run together in a group. */
  MotorControllerGroup rightMotors = new MotorControllerGroup(rightMotor1, rightMotor2);

  MotorControllerGroup leftMotors = new MotorControllerGroup(leftMotor1, leftMotor2);

  /** The robot's drive. */
  private final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  /** Creates a new Drivetrain subsystem. */
  public Drivetrain() {
    System.out.println("Drivetrain initialized");
  }

  /**
   * Arcade drive method for differential drive platform. The calculated values will be squared to
   * decrease sensitivity at low speeds.
   *
   * @param speed The robot's speed along the X axis [-1.0..1.0]. Forward is positive.
   * @param rotation The robot's rotation rate around the Z axis [-1.0..1.0]. Clockwise is positive.
   */
  public void arcadeDrive(double speed, double rotation) {
    drive.arcadeDrive(speed, rotation);
  }

  @Override
  /**
   * Periodic method for the drivetrain subsystem. This method will be called once per scheduler
   * run.
   */
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
