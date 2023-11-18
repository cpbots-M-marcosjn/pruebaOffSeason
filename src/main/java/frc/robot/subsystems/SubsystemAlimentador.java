// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.nio.channels.Channel;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class SubsystemAlimentador {

   private final Talon m_alimentador=new Talon (1);
   
   public void inicio (XboxController Control){
    m_alimentador.set (-Control.getLeftTriggerAxis());
    m_alimentador.set (Control.getRightTriggerAxis());
    
   }
}
 
