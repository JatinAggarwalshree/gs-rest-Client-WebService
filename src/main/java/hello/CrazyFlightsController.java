package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CrazyFlightsController {

	FlightsService flightsService = new FlightsService();//Service which will do all data retrieval/manipulation work

    @RequestMapping(value = "/flightSearchCrazyAir/{origin}/{destination}/{departureDate}/{returnDate}/{numberOfPassengers}", method = RequestMethod.GET)
    public ResponseEntity<String> getAllFlights(@PathVariable("origin") String origin,
						    		@PathVariable("destination") String destination,
						    		@PathVariable("departureDate") String departureDate,
						    		@PathVariable("returnDate") String returnDate,
						    		@PathVariable("numberOfPassengers") int numberOfPassengers) {
    	System.out.println("Fetching Flight Detail for Airlines with origin {}" + origin);
    	System.out.println("Fetching Flight Detail for Airlines with destination {}" +  destination);
    	System.out.println("Fetching Flight Detail for Airlines with departureDate {}" +  departureDate);
    	System.out.println("Fetching Flight Detail for Airlines with returnDate {}" +  returnDate);
    	System.out.println("Fetching Flight Detail for Airlines with numberOfPassengers {}" +  numberOfPassengers);
    	
        String flightsList = flightsService.findAllFlightsForCA(origin,destination, departureDate, returnDate, numberOfPassengers);
        
        System.out.println(flightsList);
        //return new ResponseEntity<CrazyAirResponse>(HttpStatus.OK);
        ResponseEntity<String> responseEntity = new ResponseEntity<>(flightsList,
                HttpStatus.OK);
        return responseEntity;
    }
    
    @RequestMapping(value = "/flightSearchToughJet/{origin}/{destination}/{departureDate}/{returnDate}/{numberOfPassengers}", method = RequestMethod.GET)
    public ResponseEntity<String> getAllFlightsTJ(@PathVariable("origin") String origin,
						    		@PathVariable("destination") String destination,
						    		@PathVariable("departureDate") String departureDate,
						    		@PathVariable("returnDate") String returnDate,
						    		@PathVariable("numberOfPassengers") int numberOfPassengers) {
    	System.out.println("Fetching Flight Detail for Airlines with origin {}" + origin);
    	System.out.println("Fetching Flight Detail for Airlines with destination {}" +  destination);
    	System.out.println("Fetching Flight Detail for Airlines with departureDate {}" +  departureDate);
    	System.out.println("Fetching Flight Detail for Airlines with returnDate {}" +  returnDate);
    	System.out.println("Fetching Flight Detail for Airlines with numberOfPassengers {}" +  numberOfPassengers);
    	
        String flightsList = flightsService.findAllFlightsForTJ(origin,destination, departureDate, returnDate, numberOfPassengers);
        
        System.out.println(flightsList);
        
        //return new ResponseEntity<CrazyAirResponse>(HttpStatus.OK);
        ResponseEntity<String> responseEntity = new ResponseEntity<>(flightsList,
                HttpStatus.OK);
        return responseEntity;
    }
}
