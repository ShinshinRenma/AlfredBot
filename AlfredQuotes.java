import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s to our esteemed guest, %s.", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        return String.format("Today it is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        if(conversation.indexOf("Alexis") > -1) {
            return "I don't think that will be necessary, sir.";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "How may I assist you, sir?";
        }

        return "Very well, sir.  Take care.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

