package berlinclock;

public class Service {
    public void timeTransferCalculation(String inputTime) {
        BerlinClockModel berlinClockModel = new BerlinClockModel();

        String[] timeArray = inputTime.split(":");

        int hours = Integer.valueOf(timeArray[0]);
        int minutes = Integer.valueOf(timeArray[1]);
        int seconds = Integer.valueOf(timeArray[2]);

        berlinClockModel.setTopYellowSecondLamp((seconds % 2 == 0) ? "O" : "Y");
        berlinClockModel.setTopHourLamps(hours);
        berlinClockModel.setBottomHourLamps(hours);
        berlinClockModel.setTopMinuteLamps(minutes);
        berlinClockModel.setBottomMinuteLamps(minutes);

        System.out.println("Input time : " + inputTime);
        System.out.println(berlinClockModel);
    }
}
