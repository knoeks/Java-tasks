package account;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
//        String dayStr;
//        String monthStr;
//        if (day < 10) {
//            dayStr = "0" + day;
//        } else {
//            dayStr = String.valueOf(day);
//        }
//
//        if (month < 10) {
//            monthStr = "0" + month;
//        } else {
//            monthStr = String.valueOf(month);
//        }

//        return dayStr + "/" + monthStr + "/" + year;
        return String.format("%4d/%02d/%02d", year, month, day);
    }
}
