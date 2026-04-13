// Define the interface as a base
interface MobilePhoneState 
{
    public void incomingCall(MobilePhone mobilePhone);
}

class Silent implements MobilePhoneState 
{
    @Override
    public void incomingCall(MobilePhone phone) 
    {
         System.out.println("...");
    }
}
 
class VibrateOnly implements MobilePhoneState
{
    @Override
    public void incomingCall(MobilePhone phone) 
    {
        System.out.println("Bzzz");
    }
}
 
class SoundOnly implements MobilePhoneState
{
   @Override
   public void incomingCall(MobilePhone phone) 
   {
       System.out.println("Beep!");
   }
}

class SoundAndVibrate implements MobilePhoneState
{

	@Override
	public void incomingCall(MobilePhone phone) {
		
		System.out.println("BzzzBeepBzzz");
		
	}
	
}
 
// Our EnemyRobot class
class MobilePhone
{
    private MobilePhoneState currentState;	// The current state
 
    public MobilePhone(MobilePhoneState initialState)
    {
        currentState = initialState;		// Constructor setting initial state
    }
 
    public void setState(MobilePhoneState state)
    {
        currentState = state;
    }
 
    public void incomingCall() 					// Perform the unique action of the state
    {
        currentState.incomingCall(this);
    }
}
 
public class State 
{
    public static void main(String[] args) 
    {
    	// Create the state
        MobilePhone phone= new MobilePhone(new SoundOnly());
        phone.incomingCall();
        // Switch to Silent mode
        phone.setState(new Silent());
        phone.incomingCall();
        // Switch to Vibrate mode
        phone.setState(new VibrateOnly());
        phone.incomingCall();
        // Switch to Sound mode
        phone.setState(new SoundOnly());
        phone.incomingCall();
        // Switch to sound and vibrate mode
        phone.setState(new SoundAndVibrate());
        phone.incomingCall();
    }
}