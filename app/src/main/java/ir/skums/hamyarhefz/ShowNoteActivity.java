package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.view.View;
import android.widget.ListView;

public class ShowNoteActivity extends AppCompatActivity {

    private ListView noteListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_note);

        initWidgets();
        setNoteAdapter();
    }


    private void initWidgets()
    {
        noteListView = findViewById(R.id.noteListView_main);
    }
    private void setNoteAdapter()
    {
        NoteAdapter noteAdapter = new NoteAdapter(getApplicationContext() ,Note.noteArrayList);
        noteListView.setAdapter(noteAdapter);
    }

    public void newNote(View view)
    {
        Intent newNoteIntent = new Intent(this,NoteDetailActivity.class);
        startActivity(newNoteIntent);
    }


    @Override
    protected void onResume() {


        initWidgets();
        setNoteAdapter();
        super.onResume();
    }
}