// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Pneumatics;

public class PistonControl extends CommandBase {

  private final Pneumatics m_subPneumatics;

  private final Joystick m_operatorJoystick =
      new Joystick(Constants.ControllersConstants.operatorControllerPort);

  /** Creates a new PistonControl. */
  public PistonControl(Pneumatics subsystem) {
    m_subPneumatics = subsystem;
    addRequirements(subsystem);

    SmartDashboard.putData(subsystem);
  }

  /** Called when the command is initially scheduled. */
  @Override
  public void initialize() {
    System.out.println("PistonControl initialized");
  }

  /** Called every time the scheduler runs while the command is scheduled. */
  @Override
  public void execute() {
    if (m_operatorJoystick.getRawButton(Constants.ControllersConstants.pistonButtonOpen)) {
      m_subPneumatics.open();
    } else if (m_operatorJoystick.getRawButton(Constants.ControllersConstants.pistonButtonClose)) {
      m_subPneumatics.close();
    }
  }

  /** Called once the command ends or is interrupted. */
  @Override
  public void end(boolean interrupted) {
    System.out.println("PistonControl ended");
  }

  /** Returns true when the command should end. */
  @Override
  public boolean isFinished() {
    return false;
  }
}
