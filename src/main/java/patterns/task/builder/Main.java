package patterns.task.builder;

/**
 * Created by Yuliia Tesliuk on 11/11/2018
 */
public class Main {
    public static void main(String[] args){
        TourCompositionBuilder builder = new TourCompositionBuilder();

        TourComposition composition = builder.setTransferToAirport(true)
                .setTransferFromAirport(false)
                .setFlightTicketTo(true)
                .setFlightTicketFrom(true)
                .setHotelReservation(true)
                .setInsurance(false)
                .build();

        System.out.println(composition);
    }
}
