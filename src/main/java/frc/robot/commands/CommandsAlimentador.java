// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.SubsystemAlimentador;

/** Add your docs here. */
public class CommandsAlimentador extends CommandBase {
 private final SubsystemAlimentador  m_SubsystemAlimentador;

 public CommandsAlimentador (SubsystemAlimentador SubsistemaAlimentador){
    this.m_SubsystemAlimentador = SubsistemaAlimentador;

   addRequirements(SubsistemaAlimentador);

 }
  
 @Override
  public void initialize (){}

 
@Override
  public void execute (){

    m_SubsystemAlimentador.Control(null);

  }

/**
 * 
 */
@Override
  public void end (){

   Double isFinished = 0.0;

  }
  
  }


