package com.tournament;

import com.lesterribles.andbrace.BaseActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class BracketActivity extends BaseActivity {
	
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       
       RelativeLayout layout = new RelativeLayout(this);

       RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(10000, 10000);
       layout.setLayoutParams(layoutParams);

       RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params6 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params7 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       

//       TextView text1 = new TextView(this);
//       TextView text2 = new TextView(this);
//       TextView text3 = new TextView(this);
//       TextView text4 = new TextView(this);
//       TextView text5 = new TextView(this);
//       TextView text6 = new TextView(this);
//       TextView text7 = new TextView(this);
       
       Button button1 = new Button(this);
       Button button2 = new Button(this);
       Button button3 = new Button(this);
       Button button4 = new Button(this);
       Button button5 = new Button(this);
       Button button6 = new Button(this);
       Button button7 = new Button(this);
       
       button1.setId(1);
       button2.setId(2);
       button3.setId(3);
       button4.setId(4);
       button5.setId(5);
       button6.setId(6);
       button7.setId(7);
       
       button1.setText("Tung\n McKendon");
       button2.setText("Godzilla\n MechaGodzilla");
       button3.setText("Batman\n Bane");
       button4.setText("Wolverine\n Cyclops");
       button5.setText("Spiderman\n Venom");
       button6.setText("Ironman\n War Machine");
       button7.setText("Superman\n Doomsday");
       
       button1.setHeight(120);
       button2.setHeight(120);
       button3.setHeight(120);
       button4.setHeight(120);
       button5.setHeight(120);
       button6.setHeight(120);
       button7.setHeight(120);
       
       button1.setWidth(450);
       button2.setWidth(450);
       button3.setWidth(450);
       button4.setWidth(450);
       button5.setWidth(450);
       button6.setWidth(450);
       button7.setWidth(450);
       

       
//       text1.setId(1);
//       text2.setId(2);
//       text3.setId(3);
//       text4.setId(4);
//       text5.setId(5);
//       text6.setId(6);
//       text7.setId(7);
//       
//       text1.setBackgroundColor(Color.WHITE);
//       text2.setBackgroundColor(Color.RED);
//       text3.setBackgroundColor(Color.YELLOW);
//       text4.setBackgroundColor(Color.CYAN);
//       text5.setBackgroundColor(Color.MAGENTA);
//       text6.setBackgroundColor(Color.BLUE);
//       text7.setBackgroundColor(Color.GREEN); 
//       
//       text1.setText("FUCK GUIS");
//       text2.setText("FUCK GUIS");
//       text3.setText("FUCK GUIS");
//       text4.setText("FUCK GUIS");
//       text5.setText("FUCK GUIS");
//       text6.setText("FUCK GUIS");
//       text7.setText("FUCK GUIS");
       
       params1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);      
       
       params5.addRule(RelativeLayout.RIGHT_OF, 1);
       params5.addRule(RelativeLayout.BELOW, 1);
       
       params2.addRule(RelativeLayout.LEFT_OF, 5);
       params2.addRule(RelativeLayout.BELOW, 5);
       
       params3.addRule(RelativeLayout.ALIGN_PARENT_LEFT); 
       params3.addRule(RelativeLayout.BELOW, 5);
       
       params6.addRule(RelativeLayout.RIGHT_OF, 3);
       params6.addRule(RelativeLayout.BELOW, 3);
       
       params4.addRule(RelativeLayout.LEFT_OF, 6);
       params4.addRule(RelativeLayout.BELOW, 6);
       
       params7.addRule(RelativeLayout.RIGHT_OF, 5);
       params7.addRule(RelativeLayout.BELOW, 5);
              
//       text1.setLayoutParams(params1);
//       text2.setLayoutParams(params2);
//       text3.setLayoutParams(params3);
//       text4.setLayoutParams(params4);
//       text5.setLayoutParams(params5);
//       text6.setLayoutParams(params6);
//       text7.setLayoutParams(params7);
       
       button1.setLayoutParams(params1);
       button2.setLayoutParams(params2);
       button3.setLayoutParams(params3);
       button4.setLayoutParams(params4);
       button5.setLayoutParams(params5);
       button6.setLayoutParams(params6);
       button7.setLayoutParams(params7);
       
       View view = new View(this);
       view.setBackgroundColor(Color.DKGRAY);
       
       layout.addView(button1);
       layout.addView(button2);
       layout.addView(button3);
       layout.addView(button4);
       layout.addView(button5);
       layout.addView(button6);
       layout.addView(button7);
       layout.addView(view);
       
     //  ScrollView scrollView = new ScrollView(this);
     //  scrollView.setLayoutParams(new LayoutParams(100000,
      //       100000));
      // scrollView.addView(layout);
       
       setContentView(layout);
       
   }
}