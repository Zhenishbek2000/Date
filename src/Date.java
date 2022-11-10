public class Date {
    private long day;
    private long month;
    private long year;

    public Date() {
        System.out.println("day = " + 12);
        System.out.println("month = " + 12);
        System.out.println("year = " + 2023);
    }

    public Date(long day, long month, long year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(long day) {
        this.day = day;
    }

    public void setMonth(long month) {
        this.month = month;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public long getDay() {
        return day;
    }

    public long getMonth() {
        return month;
    }

    public long getYear() {
        return year;
    }

    @Override
    public String toString() {
        String dayNull = "";
        String monthNull = "";
        String result = null;

        if (day >= 1 && day <= 31) {
            if (month >= 1 && month < 12) {
                if (year >= 1 && year <= 9999) {
                    if (day <= 9) {
                        dayNull = "0";
                    }
                    if (month <= 9) {
                        monthNull = "0";
                    }
                    result = dayNull + day + "/" + monthNull + month + "/" + year;
                }
            }
        }
        return result;
    }
}

