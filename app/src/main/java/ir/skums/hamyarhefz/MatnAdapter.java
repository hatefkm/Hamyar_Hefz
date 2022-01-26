package ir.skums.hamyarhefz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

import java.util.List;


public class MatnAdapter extends ArrayAdapter<ir.skums.hamyarhefz.Matn> {
    Context context;
    int layoutRes;
    List<ir.skums.hamyarhefz.Matn> matnList;
    SQLiteDatabase database;

    public MatnAdapter(Context context, int resource, List<ir.skums.hamyarhefz.Matn> matnList, SQLiteDatabase database){
        super(context,resource, matnList);
        this.context=context;
        this.layoutRes=resource;
        this.matnList = matnList;
        this.database=database;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(layoutRes,null);
        ir.skums.hamyarhefz.Matn matn = matnList.get(position);
        TextView textViewTitleJozha=view.findViewById(R.id.textViewTitleJozha);
        textViewTitleJozha.setText(matn.getMatn());
        return view;
    }
}

