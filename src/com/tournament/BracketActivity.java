package com.tournament;

import java.util.ArrayList;
import java.util.Arrays;

import com.lesterribles.andbrace.BaseActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout; 


public class BracketActivity extends BaseActivity {
	
	private RelativeLayout layout;
	private int currentX;
	private int currentY;
	private int scrollX;
	private int scrollY;
	int boundX = 0;
	int boundY = 0;
	
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       
       layout = new RelativeLayout(this);
       RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(2000, 2000);
       //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
       layout.setLayoutParams(layoutParams);

       // button height: 110, weight: 275

       ArrayList<Player> players = new ArrayList<Player>()
      		 {{ 
      			 add(new Player("a", "a"));
      			 add(new Player("b", "b"));
      			 add(new Player("c", "c"));
      			 add(new Player("d","d"));
      			 add(new Player("e","e"));
      			 add(new Player("f","f"));
      			 add(new Player("g","g"));
      			 add(new Player("h","h"));
      			 add(new Player("j","i"));
      			 add(new Player("k","j"));
      			 add(new Player("l","h"));
      			 add(new Player("m","j"));
      			 add(new Player("n","k"));
      			 add(new Player("o","l"));
      			 add(new Player("p","m"));
      			 add(new Player("q","n"));
      		 }};
       
       
       
       BracketTournament bracketTournament = new BracketTournament(players, new DefaultSeedingStrategy());
//       ArrayList<Match> matchesInLevel = bracketTournament.GetAllMatchesOfLevel(4);
       ArrayList<Player> pl = bracketTournament.GetAllPlayersOfLevel(4);
//       
//
//       Log.d("Something", Arrays.toString(pl.toArray()));
       Log.d("Count", pl.size() + " ");
       
       
//       RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//       RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//       RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//       RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//       RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//       RelativeLayout.LayoutParams params6 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//       
//       Button button1 = new Button(this);
//       Button button2 = new Button(this);
//       Button button3 = new Button(this);
//       Button button4 = new Button(this);
//       Button button5 = new Button(this);
//       Button button6 = new Button(this);
//       Button button7 = new Button(this);
//       
//       button1.setId(1);
//       button2.setId(2);
//       button3.setId(3);
//       button4.setId(4);
//       button5.setId(5);
//       button6.setId(6);
//       button7.setId(7);
//       
//       button1.setText("Superman\n Doomsday");
//       button2.setText("Godzilla\n MechaGodzilla");
//       button3.setText("Batman\n Bane");
//       button4.setText("Wolverine\n Cyclops");
//       button5.setText("Spiderman\n Venom");
//       button6.setText("Ironman\n War Machine");
//       
//       button1.setHeight(110);
//       button2.setHeight(110);
//       button3.setHeight(110);
//       button4.setHeight(110);
//       button5.setHeight(110);
//       button6.setHeight(110);
//       button7.setHeight(110);
//       
//       button1.setWidth(275);
//       button2.setWidth(275);
//       button3.setWidth(275);
//       button4.setWidth(275);
//       button5.setWidth(275);
//       button6.setWidth(275);
//       button7.setWidth(275);
//       
//       
//       params1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);      
//       
//       params5.addRule(RelativeLayout.RIGHT_OF, 1);
//       params5.addRule(RelativeLayout.BELOW, 1);
//       
//       params3.addRule(RelativeLayout.ALIGN_PARENT_LEFT); 
//       params3.addRule(RelativeLayout.BELOW, 5);
//       
//       params6.addRule(RelativeLayout.RIGHT_OF, 3);
//       params6.addRule(RelativeLayout.BELOW, 3);
//       
//       params4.addRule(RelativeLayout.LEFT_OF, 6);
//       params4.addRule(RelativeLayout.BELOW, 6);
//       
//       params2.addRule(RelativeLayout.RIGHT_OF, 5);
//       params2.addRule(RelativeLayout.BELOW, 5);
//       
//       
//       button1.setLayoutParams(params1);
//       button2.setLayoutParams(params2);
//       button3.setLayoutParams(params3);
//       button4.setLayoutParams(params4);
//       button5.setLayoutParams(params5);
//       button6.setLayoutParams(params6);
//       
//       layout.addView(button1);
//       layout.addView(button2);
//       layout.addView(button3);
//       layout.addView(button4);
//       layout.addView(button5);
//       layout.addView(button6);
       
       
       layout.setBackgroundColor(Color.DKGRAY);
       
       // To draw things off the screen.
       FrameLayout frameLayout = new FrameLayout(this);
       frameLayout.addView(layout);
       
       setContentView(frameLayout);
       
   }
   
   
   // allow scrolling
   @Override 
   public boolean onTouchEvent(MotionEvent event) {
     switch (event.getAction()) {
         case MotionEvent.ACTION_DOWN: {
             currentX = (int) event.getRawX();
             currentY = (int) event.getRawY();
             break;
         }

         case MotionEvent.ACTION_MOVE: {
             int x2 = (int) event.getRawX();
             int y2 = (int) event.getRawY();
             scrollX = currentX - x2;
             scrollY = currentY - y2;
             
             if (boundX - scrollX < 0 && boundY - scrollY < 0)
             {
                layout.scrollBy(scrollX , scrollY);
                boundX -= scrollX;
                boundY -= scrollY;
             }
             else if (boundX - scrollX < 0)
             {
            	 layout.scrollBy(scrollX, 0);
            	 boundX -= scrollX;
             }
             else if (boundY - scrollY < 0)
             {
            	 layout.scrollBy(0, scrollY);
            	 boundY -= scrollY;
             }
             
             currentX = x2;
             currentY = y2;
             break;
         }   
         case MotionEvent.ACTION_UP: {
             break;
         }
     }
       return true; 
   }

}
