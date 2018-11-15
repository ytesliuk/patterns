package patterns.task.adapter;

/**
 * Created by Yuliia Tesliuk on 11/15/2018
 */
public class Computer {
    private SvgaPort svgaPort;

    Computer(){
        this.svgaPort = new SvgaPort();
    }

    public SvgaPort getSvgaPort() {
        return svgaPort;
    }
}
