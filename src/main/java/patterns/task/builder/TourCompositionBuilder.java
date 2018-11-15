package patterns.task.builder;

/**
 * Created by Yuliia Tesliuk on 11/11/2018
 */
public class TourCompositionBuilder {
    private TourComposition composition;
    private boolean transferToAirport;
    private boolean transferFromAirport;
    private boolean flightTicketTo;
    private boolean flightTicketFrom;
    private boolean hotelReservation;
    private boolean insurance;

    public TourCompositionBuilder(){
        composition = new TourComposition();
    }

    public TourCompositionBuilder setTransferToAirport(boolean bool){
        composition.setTransferToAirport(bool);
        return this;
    }
    public TourCompositionBuilder setTransferFromAirport(boolean bool){
        composition.setTransferFromAirport(bool);
        return this;
    }
    public TourCompositionBuilder setFlightTicketTo(boolean bool){
        composition.setFlightTicketTo(bool);
        return this;
    }
    public TourCompositionBuilder setFlightTicketFrom(boolean bool){
        composition.setFlightTicketFrom(bool);
        return this;
    }
    public TourCompositionBuilder setHotelReservation(boolean bool){
        composition.setHotelReservation(bool);
        return this;
    }
    public TourCompositionBuilder setInsurance(boolean bool){
        composition.setInsurance(bool);
        return this;
    }
    public TourComposition build(){
        return composition;
    }

}
