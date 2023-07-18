package sg.rp.edu.rp.c346.id22038845.demotodolist;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;

    int layout_id;

    ArrayList<ToDoItem> toDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.toDoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvDate = rowView.findViewById(R.id.tvDate);

        ToDoItem currentToDO = toDoList.get(position);

        tvTitle.setText(currentToDO.getTitle());
        tvDate.setText(currentToDO.toString()); //if done in currentToDo.getDate().toString() --> it is getting the value from the native Calendar class instead of the created ToDoItem class

        return rowView;
    }
}
