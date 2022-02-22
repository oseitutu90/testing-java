
import lombok.Builder;
import lombok.Getter;

import java.awt.*;

@Getter
@Builder
public class Bedroom {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private  int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

}
