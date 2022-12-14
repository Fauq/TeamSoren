// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.io.IOException;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.Constants.IOConstants;
import frc.robot.Constants.ShootConstants;
import frc.robot.Pathing.PathChooser;
import frc.robot.commands.Auton.AutonPhaseGroup;
import frc.robot.commands.Auton.FollowTrajectory;
import frc.robot.commands.Drive.Cartesian;
import frc.robot.commands.Drive.ReverseDrive;
import frc.robot.commands.Misc.DriveBack;
import frc.robot.commands.Shooter.DriveBall;
import frc.robot.commands.Shooter.PIDPewPew;
import frc.robot.commands.Winch.ToggleSolomon;
import frc.robot.commands.Winch.WinchPull;
import frc.robot.commands.Winch.WinchPush;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.MecanumDrivetrain;
import frc.robot.subsystems.PIDShooter;
import frc.robot.subsystems.Winch;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drivetrain drive = new Drivetrain();
  private final MecanumDrivetrain m_drive = new MecanumDrivetrain();

  private final Joystick joystickOne = new Joystick(IOConstants.LEFT_JOYSTICK);
  private final Joystick joystickTwo = new Joystick(IOConstants.RIGHT_JOYSTICK);
  


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
