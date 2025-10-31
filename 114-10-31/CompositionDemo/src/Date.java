public class Date {
    private int month; // 月份：1-12
    private int day; // 日期：根據月份為 1-31
    private int year; // 年份：任意年份

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // 建構子：確認在指定年份下月份與日期是否正確
    public Date(int month, int day, int year) {
        // 檢查月份範圍
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    "月份 (" + month + ") 必須是 1-12");
        }

        // 檢查日期是否在該月份範圍內
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("日期 (" + day +
                    ") 超出指定月份或年份的範圍");
        }

        // 若為 2 月 29 日，檢查是否為閏年
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("日期 (" + day +
                    ") 超出指定月份或年份的範圍");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        // System.out.printf("Date object constructor for date %s%n", this);
    }

    // 回傳字串，格式為 月/日/年
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}