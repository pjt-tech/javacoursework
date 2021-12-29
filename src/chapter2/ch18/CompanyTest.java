package chapter2.ch18;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1 == company2);

        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String timeFormat = format.format(time);
        System.out.println(timeFormat);
    }
}
