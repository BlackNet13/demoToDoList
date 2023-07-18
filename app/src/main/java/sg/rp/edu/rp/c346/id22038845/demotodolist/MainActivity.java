package sg.rp.edu.rp.c346.id22038845.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<ToDoItem> al;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2020,8,1);
        date2.set(2020, 8,2);

        al.add(new ToDoItem("Go for movie",date1)); //calendarD(2020,"AUG",1)
        al.add(new ToDoItem("Go for haircut",date2));

        adapter = new CustomAdapter(this, R.layout.row, al);

        lv.setAdapter(adapter);

    }


    /*
    private static Calendar calendarD(int year, String month, int day){
        Map<String, Integer> mthParse = createMonthStr();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH,mthParse.get(month));
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar;
    }

    private static Map<String, Integer> createMonthStr(){
        Map<String, Integer> mthParse = new HashMap<>();
        mthParse.put("JAN",Calendar.JANUARY);
        mthParse.put("FEB",Calendar.FEBRUARY);
        mthParse.put("MAR",Calendar.MARCH);
        mthParse.put("APR",Calendar.APRIL);
        mthParse.put("MAY", Calendar.MAY);
        mthParse.put("JUN",Calendar.JULY);
        mthParse.put("AUG",Calendar.AUGUST);
        mthParse.put("SEP",Calendar.SEPTEMBER);
        mthParse.put("OCT",Calendar.OCTOBER);
        mthParse.put("NOV",Calendar.NOVEMBER);
        mthParse.put("DEC",Calendar.DECEMBER);
        return mthParse;
    }
    */

}