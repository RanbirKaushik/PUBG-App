package studio.golden.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MoreActivity extends AppCompatActivity {


    MediaPlayer player;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        getSupportActionBar().setTitle("Listen Story...");

        mAdView = findViewById(R.id.adViewMore);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9508056847332120~3743065394");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }

    public void play(View v){

        if(player == null){
            player = MediaPlayer.create(this,R.raw.story_woman);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
            mInterstitialAd.show();
        }
        player.start();
    }

    public void pause(View v){
        if(player != null){
            player.pause();
        }
        mInterstitialAd.show();
    }

    public  void stop(View v){
        stopPlayer();
    }

    private void stopPlayer(){
        if(player !=null){
            player.release();
            player = null;
            Toast.makeText(this,"Media Player released",Toast.LENGTH_SHORT).show();
        }
        mInterstitialAd.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
        mInterstitialAd.show();
    }
}
