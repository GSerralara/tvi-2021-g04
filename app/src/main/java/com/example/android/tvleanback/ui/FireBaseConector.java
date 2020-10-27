package com.example.android.tvleanback.ui;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.android.tvleanback.model.Video;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;

import static android.content.ContentValues.TAG;

public class FireBaseConector {
    public FireBaseConector() {
    }

    public static void write(Video mSelectedVideo) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("stream");
        myRef.setValue(mSelectedVideo);

    }
/**
    public void read() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("stream");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //cuando hay cambios en el database se autoejecutara esta funcion
                //ToDo: coger video que se recibe y reproducirlo
                //Crear un Video Obj
                Video video = new Video(dataSnapshot.getValue(String.class));
                Intent intent = new Intent(act, PlaybackActivity.class);
                intent.putExtra(VideoDetailsActivity.VIDEO, video);
                startActivity(intent);
                //Pasar obj a PlaybackFragment

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
 **/
}
