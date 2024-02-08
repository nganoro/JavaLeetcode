public class AngleOfClock {
    public static float angle(int hour, int min){
        int result = 0;
        float angleOfHour = 1;
        float angleOfMinute = 1;
        float minToHour = (float)(min) / (float)(60);

        angleOfHour = ((float)(hour) + minToHour) * 30;
        angleOfMinute = ((float)min * 6);

        return Math.abs(angleOfHour - angleOfMinute);
    }
    public static void main(String[] args) {
        int hour = 3;
        int min = 15 ;
        System.out.println(angle(hour, min));
    }
}
