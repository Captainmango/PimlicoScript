package windows;

public enum Trades {
	
	Plumbing(0),
	Roofing(1),
	Electrics(2),
	Appliances(3),
	Carpentry(4),
	Heating(5),
	Drainage(6),
	Building(7),
	Unsure(8);

	private final int trade;
	
	private Trades(int trade) {
		this.trade = trade;
	}
	
	    public final int getValue() {
	        return trade;	
		
	    }
		public static String getStringValueFromInt(int i) {
		     for (Trades trade : Trades.values()) {
		         if (trade.getValue() == i) {
		             return trade.toString();
		
		      	}
		         throw new IllegalArgumentException("the given number doesn't match any Trades listed.");
		     
		     }
			return null;
		}
	}
		     

	
		      
		
	  
