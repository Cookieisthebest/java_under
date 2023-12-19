package a_thno;

//import java.util.*;
//import java.lang.*;
//import java.math.*;
//import java.io.*;
//import java.text.*;
//import java.util.concurrent.TimeUnit;
////

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
 
import java.util.stream.Collectors;
 
 
public class hehe {
    public static void main(String[] args) throws ParseException {
 
/*không được sử dụng new Date vì nó sẽ tính từ thời gian 1970 =)))
//        Date d1 = new Date("13/01/2021");
//        Date d2 = new Date("15/01/2021");
*/
 
        SimpleDateFormat cuc = new SimpleDateFormat("dd/MM/yyyy");
        String k1 = "13/01/2021";
        String k2 = "15/01/2021";
        Date d1 = cuc.parse(k1);
        Date d2 = cuc.parse(k2);
        Long a1 = d2.getTime() - d1.getTime();//số mili giây 1 ms = 1000s
    //Tính số ngày trong khoảng d1 và d2
        Long a21 =  TimeUnit.MILLISECONDS.toDays(a1);
        Long a22 = TimeUnit.DAYS.convert(a1, TimeUnit.MILLISECONDS);
        Long a23 = ChronoUnit.DAYS.between(d1.toInstant(), d2.toInstant());
        Long a24 = a1 / (1000*60*24*60);
 
        System.out.println(a24);
 
//ngày 4 tháng 12 tìm được thêm 6 cách in mới ----------------------------
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        //
        String s1 = "02/12/2023";
        String s2 = "04/12/2023";
        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);
        Long d = d2.getTime() - d1.getTime();
        Long i1 = d / (1000 * 24 * 60 * 60);
        Long i2 = TimeUnit.MILLISECONDS.toDays(d);
        Long i3 = TimeUnit.DAYS.convert(d, TimeUnit.MILLISECONDS);
        Long i4 = ChronoUnit.DAYS.between(d1.toInstant(), d2.toInstant());
        Long i5 = Duration.between(d1.toInstant(), d2.toInstant()).toDays();
 
        SimpleDateFormat sdv = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        Date b1 =sdv.parse("11/12/2021 16:35:00"); 
 
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime b2 = LocalDateTime.parse("11/12/2021 16:40:00", dtf);
        LocalDateTime b3 = LocalDateTime.parse("11/12/2021 17:10:00", dtf);
        Long i6 = Duration.between(b2.toInstant(ZoneOffset.UTC), b3.toInstant(ZoneOffset.UTC)).toMinutes();
       System.out.println(i5);
 
 
//ngày 5 tháng 12 học kdl calendar ---------------------      
        Calendar ca =  Calendar.getInstance();
        //System.out.println(ca + "\n");-> ca1
 
        //System.out.println(ca.getTime());
        SimpleDateFormat cuc = new SimpleDateFormat("dd/MM/yyyy");
        Date ck = cuc.parse("03/10/2023");
        //System.out.println(ck.getTime());
        ////
        ca.setTime(ck);//đặt ca là thời gian của ck -> ca2
        ca.add(Calendar.MONTH, 2); //chuyển đổi ca2 thành ca3 với tăng thêm 2 tháng
       // System.out.println(ca.getTime());//in ra ca3 ở kdl DATE
        System.out.println(cuc.format(ca.getTime()));
 
//ngày 7 tháng 12  - làm về thời gian trôi--------------      
        SimpleDateFormat ngu = new SimpleDateFormat("hh:mm");
        Date k1 = ngu.parse("15:30");
        Date k2 = ngu.parse("18:00");
        Long k = k2.getTime() - k1.getTime();
        Long r1 = TimeUnit.HOURS.convert(k, TimeUnit.MILLISECONDS);
        Long r2 = TimeUnit.MINUTES.convert(k,TimeUnit.MILLISECONDS);
       System.out.println(r2);
 
 
    }
 
}