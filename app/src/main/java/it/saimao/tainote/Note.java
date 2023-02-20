package it.saimao.tainote;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "note") // change table name
public class Note {

    // ID for this table
    @PrimaryKey(autoGenerate = true)
    private int id;

    // Room will automatically generate these properties for table columns
    private String title;
    private String description;

    // To change column name
    @ColumnInfo(name = "priority")
    private int priority;

    @Ignore // Room will ignore this property
    private boolean complete;

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;

    }

    // Room will use this method to set id
    public void setId(int id) {
        this.id = id;
    }

    // Getter methods are necessary
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
