public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public StopWatch() {
    }

    public double start(){
        return System.nanoTime();
    }

    public double stop(){
        return System.nanoTime();
    }

    public double getElapsedTIme(){
        return endTime - startTime;
    }
}
