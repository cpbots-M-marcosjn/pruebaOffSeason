// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.ResourceBundle.Control;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemChasis extends SubsystemBase {
  /** Creates a new SubsystemChasis. */
  final CANSparkMax m_leftDrive1 =new CANSparkMax(1, MotorType.kBrushed);
  final CANSparkMax m_leftDrive2=new CANSparkMax(2, MotorType.kBrushed);
  final CANSparkMax m_rigthDrive3=new CANSparkMax(3, MotorType.kBrushed);
  final CANSparkMax m_rigthDrive4=new CANSparkMax(4, MotorType.kBrushed);
   
  


  public SubsystemChasis() {}
  
    public void Control (XboxController Control){ 
     double potencia=1;

      if(Control.getRightBumperPressed()){
      potencia=potencia+.25;
    }

    if (Control.getLeftBumperPressed()){
      potencia=potencia-.25;
    }

    if(Control.getAButtonPressed()){
        m_leftDrive1.set(-1*potencia);
        m_leftDrive2.set(-1*potencia);
        m_rigthDrive3.set(1*potencia);
        m_rigthDrive4.set(1*potencia);
    }else{
      if(Control.getYButtonPressed()){
        m_leftDrive1.set(1*potencia);
        m_leftDrive2.set(1*potencia);
        m_rigthDrive3.set(-1*potencia);
        m_rigthDrive4.set(-1*potencia);
      } else{
      if(Control.getXButtonPressed()){
        m_leftDrive1.set(-1*potencia);
        m_leftDrive2.set(-1*potencia);
        m_rigthDrive3.set(-1*potencia);
        m_rigthDrive4.set(-1*potencia);
      }
      else{
        if(Control.getBButtonPressed()){
          m_leftDrive1.set(1*potencia);
          m_leftDrive2.set(1*potencia);
          m_rigthDrive3.set(1*potencia);
          m_rigthDrive4.set(1*potencia);
        } else{
          m_leftDrive1.set(Control.getLeftY()*potencia);
          m_leftDrive2.set(Control.getLeftY()*potencia);
          m_rigthDrive3.set(-Control.getRightY()*potencia);
          m_rigthDrive4.set(-Control.getRightY()*potencia);  
          }
        }
      }
    }
}

  
 @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
