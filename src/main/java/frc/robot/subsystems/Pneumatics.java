// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pneumatics extends SubsystemBase {

  // The double solenoid that controls the piston
  private DoubleSolenoid doubleSolenoid =
      new DoubleSolenoid(
          Constants.HardwareConstants.pneumaticControl,
          PneumaticsModuleType.CTREPCM,
          Constants.PneumaticsConstants.openSolenoid,
          Constants.PneumaticsConstants.closeSolenoid);

  /** Creates a new Pneumatics subsystem. */
  public Pneumatics() {
    System.out.println("Pneumatics initialized");
    SmartDashboard.putBoolean(getName(), false);
  }

  /** Opens the piston */
  public void open() {
    doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    SmartDashboard.putBoolean(getName(), true);
  }

  /** Closes the piston */
  public void close() {
    doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    SmartDashboard.putBoolean(getName(), false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
