package hello;

public class FlightsService {
	String responseJson;
	
	public String findAllFlightsForCA(String origin, String destination, String departureDate, String returnDate,
			int numberOfPassengers) {
		responseJson = ""
				+ "[{\"airline\": \"Emirates\",\"price\": \"87655\",\"cabinclass\": \"B\",\"departureAirportCode\": \"LHR\","
				+ "\"destinationAirportCode\": \"AMS\",	\"departureDate\": \"2017-12-03\",\"arrivalDate\": \"2017-12-15\"},	"
				+ "{\"airline\": \"Emirates\",\"price\": \"65334\",	\"cabinclass\": \"E\",	\"departureAirportCode\": \"LHR\",	"
				+ "\"destinationAirportCode\": \"AMS\",	\"departureDate\": \"2017-12-03\",	\"arrivalDate\": \"2017-12-15\"	},	"
				+ "{\"airline\": \"Emirates\",	\"price\": \"65330\",	\"cabinclass\": \"E\",	\"departureAirportCode\": \"LHR\",	"
				+ "\"destinationAirportCode\": \"AMS\",	\"departureDate\": \"2017-12-03\",	\"arrivalDate\": \"2017-12-15\"	}	]";
		return responseJson;
	}
	
	public String findAllFlightsForTJ(String origin, String destination, String departureDate, String returnDate,
			int numberOfPassengers) {
		
		responseJson = ""
				+ "[{\"carrier\": \"kingfisher\",\"basePrice\": \"85655\",\"tax\": \"1234\",\"discount\": \"3\",\"departureAirportName\": \"LHR\","
				+ "\"arrivalAirportName\": \"AMS\",	\"outboundDateTime\": \"2017-12-03\",\"inboundDateTime\": \"2017-12-15\"},	"
				+ "{\"carrier\": \"kingfisher\",\"basePrice\": \"64234\",\"tax\": \"1067\",\"discount\": \"2\",	\"departureAirportName\": \"LHR\",	"
				+ "\"arrivalAirportName\": \"AMS\",	\"outboundDateTime\": \"2017-12-03\",	\"inboundDateTime\": \"2017-12-15\"	},	"
				+ "{\"carrier\": \"kingfisher\",	\"basePrice\": \"64321\",\"tax\": \"999\",\"discount\": \"4\",	\"departureAirportName\": \"LHR\",	"
				+ "\"arrivalAirportName\": \"AMS\",	\"outboundDateTime\": \"2017-12-03\",	\"inboundDateTime\": \"2017-12-15\"	}	]";
		return responseJson;
	}
}
