// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intecchasis extends SubsystemBase {
  private final TalonSRX m_360Srx=new TalonSRX(3);

  public intecchasis() {}
public void Intec(XboxController controlK){

}

  
  public void periodic() {
    
  }
}
