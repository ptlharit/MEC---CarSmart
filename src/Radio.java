/*
 * Name: Nisarg Patel
 * McMaster Engineering Competition 2015
 * Purpose: This is a Radio class for the system design.
 */

public class Radio 
{
	private Mode current_radio_mode; // Private for information protection
	private double current_radio_frequency; // Private

	/// Radio can be ON or OFF.
	private enum Mode {
		ON, OFF
	}

	/// Public Constructor. Initializes the Radio of the Car and all the variables. Note: Default Car Radio Mode is ON and the Default Radio Frequency is 99.9 FM.
	public Radio()
	{
		System.out.println("Radio System Initialized");
		setCurrent_radio_mode(Mode.OFF);
		current_radio_frequency = 99.9; // Default frequency
	}

	/// Returns ON/OFF by examining the status of the Car's Radio
	public Mode getCurrent_radio_mode() {
		return current_radio_mode;
	}

	/// Sets the Car's Radio Mode to be ON or OFF, as specified by the final_mode value
	private void setCurrent_radio_mode(Mode final_mode) {
		this.current_radio_mode = final_mode;
	}

	/// This function turns ON the Radio in the car
	public void TurnON()
	{
		setCurrent_radio_mode(Mode.ON);
		System.out.println("Your Car Radio is " + getCurrent_radio_mode().toString());
	}

	/// This function turns OFF the Radio in the car
	public void TurnOFF()
	{
		setCurrent_radio_mode(Mode.OFF);
		System.out.println("Your Car Radio is " + getCurrent_radio_mode().toString());
	}

	/// Returns the Car's Current Radio Frequency
	public double getCurrent_radio_frequency()
	{
		System.out.println("Your Car Radio frequency is " + this.current_radio_frequency + " FM");
		return this.current_radio_frequency;
	}

	/// Sets the Car's Radio Frequency to setfrequency value. Note: The value of the setfrequency must be a double and has to be between 88 and 108
	public void setCurrent_radio_frequency(double setfrequency)
	{
		if (setfrequency < 88 || setfrequency > 108) // Out of range Frequency
		{
			System.out.println("The given set frequency is not valid");
			System.out.println("Please enter a FM frequency between 88 MHz to 108 MHz");
		}
		else // Frequency is in the range
		{
			if (getCurrent_radio_mode() == Mode.ON) // Radio is ON
			{
				this.current_radio_frequency = setfrequency;	
			}
			else // Radio is OFF. So, turn on the Radio for the user and set the frequency
			{
				System.out.println("Your Car Radio System is currently OFF");
				System.out.println("The System is turning your Car Radio System ON for you");
				TurnON(); // Turn ON the Car Radio System for the user
				this.current_radio_frequency = setfrequency;
			}
		}
	}
}