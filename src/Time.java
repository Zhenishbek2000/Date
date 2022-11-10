public class Time {
    private long second;
    private int minute;
    private int hour;

    public Time(long second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public long getSecond() {
        return second;
    }

    public void setSecond(long second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        @Override
        public String toString () {
            String strHour = "";
            String strMinute = "";
            String strSecond = "";
            String result = null;
            if (hour >= 0 && hour <= 23) {
                if (minute >= 0 && minute <= 59) {
                    if (second >= 0 && second <= 59) {
                        if (this.hour <= 9) {
                            strHour = "0";
                        }
                        if (this.minute <= 9) {
                            strMinute = "0";
                        }
                        if (this.second <= 9) {
                            strSecond = "0";
                        }
                        result = strHour + hour + ":" + strMinute + minute + ":" + strSecond + second;
                    } else {
                        result = " Invalid your number : " + second;
                    }
                } else {
                    result = " Invalid your number : " + minute;
                }
            } else {
                result = " Invalid your number : " + hour;
            }

            return result;
        }
        public void nextSecond () {
            if (second == 59) {
                if (minute == 59) {
                    if (hour == 23) hour = 0;
                    else hour++;
                    minute = 0;
                } else minute++;
                second = 0;
            } else second++;
        }

        public void previoussecond () {

            if (second == 0) {
                if (minute == 0) {
                    if (hour == 0) hour = 23;
                    else hour--;
                    minute = 59;
                } else minute--;
                second = 59;
            } else second--;

        }

    }
}

