import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PlayerActivity extends AppCompatActivity {
    TextView song_name, artist_name,duration_played,duration_total;
    ImageView cover_art,nextbtn,prevbtn,backbtn,shufflebtn,repeatbtn;
    FloatingActionButton playPausebtn;
    SeekBar seekBar;
}
