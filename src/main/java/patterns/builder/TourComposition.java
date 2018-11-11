package patterns.builder;

/**
 * Created by Yuliia Tesliuk on 11/11/2018
 */
public class TourComposition {
    private boolean transferToAirport;
    private boolean transferFromAirport;
    private boolean flightTicketTo;
    private boolean flightTicketFrom;
    private boolean hotelReservation;
    private boolean insurance;

    public TourComposition(){
    }

    public boolean isTransferToAirport() {
        return transferToAirport;
    }
    public void setTransferToAirport(boolean transferToAirport) {
        this.transferToAirport = transferToAirport;
    }
    public boolean isTransferFromAirport() {
        return transferFromAirport;
    }
    public void setTransferFromAirport(boolean transferFromAirport) {
        this.transferFromAirport = transferFromAirport;
    }
    public boolean isFlightTicketTo() {
        return flightTicketTo;
    }
    public void setFlightTicketTo(boolean flightTicketTo) {
        this.flightTicketTo = flightTicketTo;
    }
    public boolean isFlightTicketFrom() {
        return flightTicketFrom;
    }
    public void setFlightTicketFrom(boolean flightTicketFrom) {
        this.flightTicketFrom = flightTicketFrom;
    }
    public boolean isHotelReservation() {
        return hotelReservation;
    }
    public void setHotelReservation(boolean hotelReservation) {
        this.hotelReservation = hotelReservation;
    }
    public boolean isInsurance() {
        return insurance;
    }
    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "TourComposition: "
                + "\nTransfer to airport: " + isIncluded(transferToAirport)
                + "\nTransfer from airport: " + isIncluded(transferFromAirport)
                + "\nTickets to destination: " + isIncluded(flightTicketTo)
                + "\nTickets from destination: " + isIncluded(flightTicketFrom)
                + "\nHotel reservation: " + isIncluded(hotelReservation)
                + "\nInsurance: " + isIncluded(insurance);
    }

    private String isIncluded(boolean bool){
        return bool ? "included" : "not included";
    }
}
