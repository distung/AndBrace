package com.tournament;

import com.lesterribles.andbrace.BaseActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BracketActivity extends BaseActivity {
	
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       
       RelativeLayout layout = new RelativeLayout(this);
       RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
       layout.setLayoutParams(layoutParams);

       RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params6 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       RelativeLayout.LayoutParams params7 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       

       TextView text1 = new TextView(this);
       TextView text2 = new TextView(this);
       TextView text3 = new TextView(this);
       TextView text4 = new TextView(this);
       TextView text5 = new TextView(this);
       TextView text6 = new TextView(this);
       TextView text7 = new TextView(this);
       View view = new View(this);
       view.setBackgroundColor(Color.DKGRAY);
       RelativeLayout.LayoutParams viewParams1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
       viewParams1.height = 1;
       viewParams1.width = 100;
       viewParams1.addRule(RelativeLayout.RIGHT_OF, 7);
       
       
       text1.setId(1);
       text2.setId(2);
       text3.setId(3);
       text4.setId(4);
       text5.setId(5);
       text6.setId(6);
       text7.setId(7);
       
       text1.setBackgroundColor(Color.WHITE);
       text2.setBackgroundColor(Color.RED);
       text3.setBackgroundColor(Color.YELLOW);
       text4.setBackgroundColor(Color.CYAN);
       text5.setBackgroundColor(Color.MAGENTA);
       text6.setBackgroundColor(Color.BLUE);
       text7.setBackgroundColor(Color.GREEN); 
       
       text1.setText("FUCK GUIS");
       text2.setText("FUCK GUIS");
       text3.setText("FUCK GUIS");
       text4.setText("FUCK GUIS");
       text5.setText("FUCK GUIS");
       text6.setText("FUCK GUIS");
       text7.setText("FUCK GUIS");
       
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
              
       text1.setLayoutParams(params1);
       text2.setLayoutParams(params2);
       text3.setLayoutParams(params3);
       text4.setLayoutParams(params4);
       text5.setLayoutParams(params5);
       text6.setLayoutParams(params6);
       text7.setLayoutParams(params7);
       view.setLayoutParams(viewParams1);

       layout.addView(text1);
       layout.addView(text2);
       layout.addView(text3);
       layout.addView(text4);
       layout.addView(text5);
       layout.addView(text6);
       layout.addView(text7);
       layout.addView(view, viewParams1);
       
       setContentView(layout);
       
   }
}