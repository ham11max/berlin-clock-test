package berlinclock;

import java.util.Arrays;

public class BerlinClockModel {
    private String topYellowSecondLamp;
    private String[] topHourLamps;
    private String[] bottomHourLamps;
    private String[] topMinuteLamps;
    private String[] bottomMinuteLamps;

    public BerlinClockModel() {
        topYellowSecondLamp = "O";
        topHourLamps = new String[]{"O", "O", "O", "O"};
        bottomHourLamps = new String[]{"O", "O", "O", "O"};
        topMinuteLamps = new String[]{"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"};
        bottomMinuteLamps = new String[]{"O", "O", "O", "O"};
    }


    public void setTopYellowSecondLamp(String topYellowSecondLamp) {
        this.topYellowSecondLamp = topYellowSecondLamp;
    }

    public void setTopHourLamps(int hours) {
        for (int i = 0; i < hours / 5; i++) {
            topHourLamps[i] = "R";
        }

    }

    public void setBottomHourLamps(int hours) {
        for (int i = 0; i < hours % 5; i++) {
            bottomHourLamps[i] = "R";
        }
    }

    public void setTopMinuteLamps(int minutes) {
        for (int i = 0; i < minutes / 5; i++) {
            if (i % 3 == 0 && i != 0) {
                topMinuteLamps[i] = "R";
            } else {
                topMinuteLamps[i] = "Y";
            }
        }
    }

    public void setBottomMinuteLamps(int minutes) {
        for (int i = 0; i < minutes % 5; i++) {
            bottomMinuteLamps[i] = "Y";
        }
    }

    @Override
    public String toString() {
        return "Berlin Clock time: \n"
                + topYellowSecondLamp + "\n"
                + Arrays.toString(topHourLamps) + "\n"
                + Arrays.toString(bottomHourLamps) + "\n"
                + Arrays.toString(topMinuteLamps) + "\n"
                + Arrays.toString(bottomMinuteLamps) + "\n";
    }
}
