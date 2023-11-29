// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.SubsystemChasis;

public class ChasisCommads extends CommandBase {
SubsystemChasis ChasisCommand1;


  public ChasisCommads(SubsystemChasis ChasisiCommand1) {
    this.ChasisCommand1=ChasisiCommand1;
    addRequirements(ChasisCommand1);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
   ChasisCommand1.Control(RobotContainer.ControlDrive1);
  }
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
