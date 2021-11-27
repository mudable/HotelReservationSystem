import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import com.bridgelabz.hotelreservationstsyem.Hotel;
import com.bridgelabz.hotelreservationstsyem.HotelReservationSystem;

	public class TestHotelReservationSystem {

	    @Test
	    public void whenHotelAdded_ToSystem_ShouldGetAdded() {
	        Hotel hotel1 = new Hotel("Lakeewood", 110, 90, 80, 80, 3);
	        Hotel hotel2 = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
	        Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
	        Hotel[] hotelList = {hotel1, hotel2, hotel3};
	        List<Hotel> hotels = Arrays.asList(hotelList);
	        HotelReservationSystem hotelReservation = new HotelReservationSystem();
	        hotelReservation.add(hotel1);
	        hotelReservation.add(hotel2);
	        hotelReservation.add(hotel3);
	        List<Hotel> result = hotelReservation.getHotelList();
	        assertEquals(hotels, result);
	    }
	    @Test
	    public void whenGivenDateRangeShouldReturnCheapestHotel()
	    {
	        Hotel hotel1 = new Hotel("Lakewood", 110, 90, 80, 80, 3);
	        Hotel hotel2 = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
	        Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
	        HotelReservationSystem hotelReservation = new HotelReservationSystem();
	        hotelReservation.add(hotel1);
	        hotelReservation.add(hotel2);
	        hotelReservation.add(hotel3);
	        Map<Integer, Hotel> result = hotelReservation.searchFor("10Sep2020", "11Sep2020");
	        result.forEach((k, v) -> System.out.println(v.getName() + " " + k));
	        assertNotNull(result);
	    }
	}