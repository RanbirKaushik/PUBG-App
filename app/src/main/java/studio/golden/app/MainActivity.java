package studio.golden.app;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button readStory = findViewById(R.id.readStory);
        Button more = findViewById(R.id.more);
        Button about_Us = findViewById(R.id.about_Us);

        MobileAds.initialize(this, "ca-app-pub-9508056847332120~3743065394");


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9508056847332120~3743065394");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        readStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readStoryIntent = new Intent(MainActivity.this,ReadStoryActivity.class);
                startActivity(readStoryIntent);
                mInterstitialAd.show();
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readStoryIntent = new Intent(MainActivity.this,MoreActivity.class);
                startActivity(readStoryIntent);
                mInterstitialAd.show();
            }
        });

        about_Us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readStoryIntent = new Intent(MainActivity.this,AboutUsActivity.class);
                startActivity(readStoryIntent);
                mInterstitialAd.show();
            }
        });
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager conMan = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(conMan.getActiveNetworkInfo() != null && conMan.getActiveNetworkInfo().isConnected())
            return true;
        else
            return false;
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(!isNetworkAvailable(this)) {
            Toast.makeText(this,"Connect to internet first", Toast.LENGTH_LONG).show();
            finish(); //Calling this method to close this activity when internet is not available.
        }


    }
}
