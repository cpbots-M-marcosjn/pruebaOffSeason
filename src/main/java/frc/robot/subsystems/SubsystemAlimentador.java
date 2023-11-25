// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemAlimentador extends SubsystemBase{

   private final Talon m_alimentador=new Talon(0);
   
   public SubsystemAlimentador() {
   
   }


   public void Control (XboxController Control){
    m_alimentador.set (-Control.getLeftTriggerAxis());
    m_alimentador.set (Control.getRightTriggerAxis());
    
   }

   @Override
    public void periodic (){}



}
 
