package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.content.Intent;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ShowNoteActivity extends AppCompatActivity {

    private ListView noteListView;
    NoteAdapter noteAdapter;

    SharedPreferences prefNote;

    public static final String NotePref="NotePref";
    String ListIt;
    String ListItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_note);



        initWidgets();
        setNoteAdapter();


        if (Note.noteArrayList.isEmpty()){
        }else {
            Toast.makeText(this, "برای حذف،انگشت خود را روی گزینه نگهدارید", Toast.LENGTH_LONG).show();

        }


        noteListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {


                noteAdapter.notifyDataSetChanged();
                noteAdapter.remove(Note.noteArrayList.remove(i));

                return false;
            }
        });





    }


    private void initWidgets()
    {
        noteListView = findViewById(R.id.noteListView_main);
    }
    private void setNoteAdapter()
    {
        noteAdapter = new NoteAdapter(getApplicationContext() ,Note.noteArrayList);
        noteListView.setAdapter(noteAdapter);

    }

    public void newNote(View view)
    {
        Intent newNoteIntent = new Intent(this,NoteDetailActivity.class);
        startActivity(newNoteIntent);
    }


    @Override
    protected void onResume() {



        super.onResume();
        initWidgets();
        setNoteAdapter();

    }

    @Override
    protected void onStop() {

        super.onStop();
        initWidgets();
        setNoteAdapter();


    }

    public void btn_hazf(View view) {

        noteAdapter.notifyDataSetChanged();
        noteAdapter.clear();

    }
}