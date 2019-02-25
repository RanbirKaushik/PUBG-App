package studio.golden.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class ReadStoryActivity extends AppCompatActivity {


    ListView mListView;
    private AdView mAdView;


    int[] images = {R.drawable.h,
                    R.drawable.pubg,
                R.drawable.a,
                R.drawable.c,
                R.drawable.e,
                R.drawable.f,
                R.drawable.r,
                R.drawable.i,
                R.drawable.l,
                R.drawable.m,
                R.drawable.n,
                R.drawable.o,
                R.drawable.q,
                R.drawable.v,
                R.drawable.a,
            R.drawable.x,
            R.drawable.y,
            R.drawable.z,
            R.drawable.za,
            R.drawable.zb,
            R.drawable.zc,
            R.drawable.zd,
            R.drawable.j,
                    };

    String[] text = {"In today's world everyone know the name PUBG(Player Unknown Battleground). But no one know about the real story of PUBG. " +
                    "So today, We research about the story of PUBG game and after a successful research we gathered all the information and " +
                    "want to show you. This story has very struggle behind the game. In this research we tell you that how PUBG became successful.",
                    "PlayerUnknown's Battlegrounds (PUBG) is a 2017 online multiplayer battle royal game developed and published by PUBG Corporation, a subsidiary of South Korean video game company Bluehole. ",
                    "A wrangle doesn't have much of a back story. It's a vaguely Soviet, post-apocalyptic,\n" +
                            "distopian,abandoned hellhole,full of guns and home to loot.",
                    "you and 99 strangers are \n" +
                    "are jumping from off of a burning plane right into it. ",
                    "Your parachute will ensure the fall\n" +
                            "doesn't kill you , but once you are down there. It's you against the island. 99 strangers are on the hunt for you and each other. "+
                            "Every single one of them want to be the last one standing.Every single one of them want to win.",
                    "The loot home as soon as they land. Hunting for weapons and armor scrounging the map to find \n" +
                            "anything that could be of use. ",
                    "Looking down your sights as you open the door and a guy with\n" +
                            "a shotgun blasts in the face. " +
                            "People have always wanted a Battle Royal Video game. But it never happened.\n" +
                            "First came the original team death match island Battle Royal.The Japanese book and movie told \n" +
                            "the story of 42 students dropped on a deserted island, and force to kill each other until only one was left.\n" +
                            "You have been brought to this uninhabited island.It got people asking\n" +
                            "what they would do if they were in that situation? But the movie was not released in the west for years leaving it an obscure cult classic.\n" +
                            "Then years later, Hunger Games came around ,and it re-ignited the fire. People wanted Battle games. But no one was making them, but one person want it more than anybody else.",
                    "Brenden (Player Unknown) Green. Brendon green was not a game designer. He was an Irish photographer and web designer who followed the love of his life to Brazil."+
                            "Two year later , he was divoreced and looking to get his life back on track.He made it back\n" +
                            "home to Ireland. And while living on welfare, Greene discovered the games ARMA and DayZ.",
                    "For those who don't know ARMA is a hyper-realstic military shooter.\n" +
                            "Known for the scale of its combat, its attention to detail,and graphic fidelity. Also known for being the foundation for a number of mods.\n" +
                            "Many of which were spun off of into their own games.",
                    "DayZ is one of the best- known ARMA modes. Which use the hyper-realistic combat machines to simulate a \n" +
                            "zombie apocalypse.\n" +
                            "The Battle Royal mod for ARMA 2 was a departed from the tightly directed experiences offered by Triple A games lige Assassin's creed.",
                    "Green was not interested in those type of games. He was something looser, something grittier. Something that gave you the freedom to show what you would do in a battle to the death .As DayZ broke free of ARMA and became a standlone game. Other developers took notice of how popular Green's modes were in the nichie ARMA cocmmunity.\n" +
                            "Sony Online Entertainment. Now known as DayBreak, hired Greene as a consultant on there own DayZ style zombie survival game.That mode eventually became H1Z1 ",
                    "king of the kill.But by February 2016, Green had a moved on. He wad headed to Korea where he got an interesting offer.\n" +
                            "Chang Han Kim game designer working for Blue Hole wanted a Battle Royal game. He was inspired by DayZ , but when he researched the Battle Royal format more and more.\n" +
                            "He kept coming cross Green. And less than one month later, he was Blue Hole creative director. Development moved fast. Green and Kim's team had the autonomy to crate the game\n" +
                            "that they wanted. And they wanted it to playable within one year. ",
                    "The game started it's development in 2016. And the plan was to follow an early access schedule. Green and Kim wanted to get the game in customers hands fast for a low cost and keep\n" +
                            "improving it over time. But the foundation need to be laid down before anything else. The team made a small game, one map,",
                    "one mode, a handful of weapons were added after the launch.But from the day it was released on early accessed in March 2017\n" +
                            "to today, Battleground has been the same game. However it first came out there wasn't quite\n" +
                            "anything like it. Sure Green's modes were still out there. But modes are never quote as popular as standalone games. Battleground was a breath of fresh air amidest the high budget lavishly produced shooter on the market. It was messy. It was tense. And it was complicated. But most importantly it was fun.",
            "The island is the most important part too. While green has said that his team is working on more maps. A wrangle will always be the most iconic thing about Battleground\n" +
                    "It's the game main character with  familiar landmarks, wide open spaces, ",
            "and bizarre unique topography. It's not realistic. Swamps, farmland, mountain, and towns all mingle together to make a backdrop that has much of a hand in the action as the player do. And the players came to Battleground fast.\n" +
                    "For only $20, they got to live the fantasy of surviving the apocalypse. The game players base grew every week. 10 million round of Battleground were played in the game's first four months.\n" +
                    "And it made 11 million dollars in three days.",
            "By april it had sold a million copies. One month later. It was at two million, the next month it hit 4 million. In August, Battleground became \n" +
                    "the most played game on Stream in terms of concurrent players. By September, it had beaten Dota 2's record of 1.29 million concurrent players. By october it had hit 2 million player on stream.\n" +
                    "And became the most popular game in South Korean PC bangs. Beating long time king, League of Legends. When the game cracked 2 million copies sold, Blue hole held a charity invitational tournament.\n" +
                    "Three month later ESL ",
            "held the first major Battleground tournament cementing a possible eSport future for the game. Green told game industries that he has always envisioned his mods to be a spectator sport \n" +
                    "someday. And his baby was finally talking its first steps. People still ask if Battleground can be an eSport it has the audience and the player base. The only problem is logistics. Gathering one hundred people \n" +
                    "for a LAN tournament ",
            "is not easiest thing in the world. Which might limited it to events like ESL ones and Dreamhacks. But eSport is not the only place Battleground is growing. The game is selling more and more \n" +
                    "copies by the day and even bigger companies are taking notice. ",
            "Tencent made a deal to publish the game in China.",
            "Facebook cut a streaming deal with Blue Hole. Epic game who assisted in modifying the Unreal Engine\n" +
                    "for Battlegrounds. Made a Battleground inspired play mode for their game Fortnite. ",
            "And Microsoft touted a timed console exclusive version of battleground for Xbox one at E3 2017. And it said: \"We can't wait to bring \n" +
                    "PlayerUnkown'sBattlegrounds execlusivly to Xbox One later this year with an update for Xbox One X enhancement shipping with the final version.\"",
            "Battleground future is bright. There's no sign that the game will stop growing anytime soon and with imitators starting to crop up. That just give Battleground more chance to innovate and be better than the competition.\n" +
                    "Battleground is the beginning of a new video game gerner and no one saw it coming.    "
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_story);

        mAdView = findViewById(R.id.adViewRead);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        getSupportActionBar().setTitle("Read story");


        mListView = findViewById(R.id.listView);
        CustomAdaptor customAdaptor =  new CustomAdaptor();
        mListView.setAdapter(customAdaptor);


    }

    class CustomAdaptor extends BaseAdapter{


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView);
            TextView mTextView = view.findViewById(R.id.textView);

            mImageView.setImageResource(images[position]);
            mTextView.setText(text[position]);
            return view;
        }

    }
}
