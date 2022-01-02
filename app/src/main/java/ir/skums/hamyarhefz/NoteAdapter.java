package ir.skums.hamyarhefz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NoteAdapter extends ArrayAdapter<Note>
{
    public NoteAdapter(Context context, List<Note> notes)
    {
        super(context,0,notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Note note = getItem(position);
        if(convertView==null);
             convertView = LayoutInflater.from(getContext()).inflate(R.layout.note_cell,parent,false);
        TextView nameSure = convertView.findViewById(R.id.txtNameSure_note_cell);
        TextView numberAye = convertView.findViewById(R.id.txtNumberAye_note_cell);
        TextView aye = convertView.findViewById(R.id.txtAye_note_cell);
        nameSure.setText(note.getNameSure());
        numberAye.setText(note.getNumberAye());
        aye.setText(note.getAye());
        return convertView;
    }
}
