public class Processor extends Components implements ComponentsChange{

    private int procesorClockSpeed;

    public Processor(String name, String producer, String serialNumber, int procesorClockSpeed) {
        super(name, producer, serialNumber);
        this.procesorClockSpeed = procesorClockSpeed;
    }

    public int getProcesorClockSpeed() {
        return procesorClockSpeed;
    }

    public void setProcesorClockSpeed(int procesorClockSpeed) {
        this.procesorClockSpeed = procesorClockSpeed;
    }


    @Override
    public int processorClockSpeedTemp(int newProcessorClockSpeed) {
       // int newProcessorClockSpeed =0;
        return (newProcessorClockSpeed-getProcesorClockSpeed())/ComponentsChange.PROCESSOR_TEMP;
    }

}
