package it.saimao.tainote;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

// We don't create method body, room will automatically create for us.
// It's good to create one dao for one entity
@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM note")
    void deleteAllNotes();

    @Query("SELECT * FROM note ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();

}
