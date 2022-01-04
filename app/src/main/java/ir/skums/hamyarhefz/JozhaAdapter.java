package ir.skums.hamyarhefz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class JozhaAdapter extends ArrayAdapter<Jozha> {
    Context context;
    int layoutRes;
    List<Jozha> jozhaList;
    SQLiteDatabase database;

    public JozhaAdapter(Context context,int resource,List<Jozha> jozhaList,SQLiteDatabase database){
        super(context,resource,jozhaList);
        this.context=context;
        this.layoutRes=resource;
        this.jozhaList=jozhaList;
        this.database=database;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(layoutRes,null);
        Jozha jozha=jozhaList.get(position);
        TextView textViewTitleJozha=view.findViewById(R.id.textViewTitleJozha);
        textViewTitleJozha.setText(jozha.getTitle());
        return view;
    }
}

