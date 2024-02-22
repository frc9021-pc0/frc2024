package frc.robot.subsystems;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants;

public class Intake {
    public XboxController firstDriversController = new XboxController(Constants.ControllersConstants.FIRST_DRIVERS_CONTROLLER);
    public XboxController secondDriversController = new XboxController(Constants.ControllersConstants.SECOND_DRIVERS_CONTROLLER);

    public PWMSparkMax intakeNEO;

    public Intake(){
        intakeNEO = new PWMSparkMax(Constants.IntakesConstants.INTAKE_NEO_MOTOR);
    }

    public void Intake(PWMSparkMax motor){
        motor.set(-firstDriversController.getRightY());

}}
