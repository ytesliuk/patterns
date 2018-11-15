package patterns.task.adapter;

/**
 * Created by Yuliia Tesliuk on 11/15/2018
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        VdiConnector connector = new VdiConnector();
        SvgaPortAdapter svgaAdapter = new SvgaPortAdapter(computer.getSvgaPort());

        connector.connectTo(svgaAdapter);
    }
}
