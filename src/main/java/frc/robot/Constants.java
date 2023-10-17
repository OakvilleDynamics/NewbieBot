// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
<<<<<<< HEAD
  public final int rightMotor1=2;
  public final int rightMotor2=3;
public final int leftMotor1=5

=======
  // Hardware CAN IDs
  public class HardwareConstants {
    public static final int powerDistribution = 2;
    public static final int pneumaticControl = 7;
  }

  // Drivetrain CAN IDs
  public class DrivetrainConstants {
    public static final int rightMotor1 = 3;
    public static final boolean rightMotor1Inverted = true;

    public static final int rightMotor2 = 4;
    public static final boolean rightMotor2Inverted = true;

    public static final int leftMotor1 = 5;
    public static final boolean leftMotor1Inverted = false;

    public static final int leftMotor2 = 6;
    public static final boolean leftMotor2Inverted = false;
  }

  // PCM Ports for Pneumatics
  public class PneumaticsConstants {
    public static final int openSolenoid = 0;
    public static final int closeSolenoid = 1;
  }

  // Controllers
  public class ControllersConstants {
    public static final int driverControllerPort = 0;
    public static final int operatorControllerPort = 1;
    public static final int pistonButtonOpen = 1;
    public static final int pistonButtonClose = 2;
  }
>>>>>>> 653a22f7e8bda1dc43939c83c9b25e15344335e1
}
