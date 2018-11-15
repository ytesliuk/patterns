package patterns.task.adapter;

/**
 * Created by Yuliia Tesliuk on 11/15/2018
 */
public class SvgaPortAdapter extends VDIPort {
    private SvgaPort svgaPort;

    public SvgaPortAdapter(SvgaPort svgaPort) {
        super();
        this.svgaPort = svgaPort;
        connectTo(svgaPort);
        setName("SVGA adapter");
    }

    private void connectTo(SvgaPort svgaPort) {
        System.out.println("SVGA adapter is connected to " + svgaPort.getName());
    }

}
