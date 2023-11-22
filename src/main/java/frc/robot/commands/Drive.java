// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase {

  // The subsystem the command runs on
  /private final Drivetrain m_subDrivetrain;

  // The controller the command runs on
 // private final Joystick m_driverController ;
  //    new Joystick(Constants.ControllersConstants.driverControllerPort);

  /**
   * Creates a new Drive command.
   *
   * @param subsystem The subsystem used by this command.
   */
  //public Drive(Drivetrain subsystem) {
    m_subDrivetrain = subsystem;
   
  }

  /** Called every time the scheduler runs while the command is scheduled. */
  @Override
  public void execute() {
   // m_subDrivetrain.arcadeDrive(m_driverController.getX(), m_driverController.getY());
  }

  /** Called once the command ends or is interrupted. */
  @Override
  public void end(boolean interrupted) {
    m_subDrivetrain.arcadeDrive(0, 0);
    System.out.println("Drive ended");
  }

  /** Returns true when the command should end. */
  @Override
  public boolean isFinished() {
    return false;
  }
}
