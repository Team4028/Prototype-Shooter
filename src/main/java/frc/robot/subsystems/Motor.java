// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  CANSparkMax _right;
  CANSparkMax _left;
  /** Creates a new Motor. */
  public Motor() {
    _right = new CANSparkMax(6, MotorType.kBrushless);
    _left = new CANSparkMax(4, MotorType.kBrushless);

    //_left.follow(_right);
    _left.restoreFactoryDefaults();
    _right.restoreFactoryDefaults();
    
    _right.follow(_left, true);
  }

  public void runSparks() {
    _left.set(.95);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
