package com.lesterribles.andbrace;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NavUtils;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TableLayout table = new TableLayout(this);  
        
        table.setStretchAllColumns(true);  
        table.setShrinkAllColumns(true);
        
        setContentView(R.layout.activity_main);
        
    }
    
    public MainActivity() {
	   // TODO Auto-generated constructor stub
   }
    
	@Override
   public void onClick(View v) {
   }
	
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 1, 0, "View");
		menu.add(0, 2, 0, "Upload");
		menu.add(0, 3, 0, "Send");
		menu.add(0, 4, 0, "Search");
		menu.add(0, 5, 0, "Settings");
		menu.add(0, 6, 0, "Info");
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case 1:
			Toast.makeText(this, String.valueOf((item.getItemId())), Toast.LENGTH_LONG).show();
			return true;
		case 2:
			Toast.makeText(this, String.valueOf((item.getItemId())), Toast.LENGTH_LONG).show();
			return true;
		case 3:
			Toast.makeText(this, String.valueOf((item.getItemId())), Toast.LENGTH_LONG).show();
			return true;
		case 4:
			Toast.makeText(this, String.valueOf((item.getItemId())), Toast.LENGTH_LONG).show();
			return true;
		case 5:
			Toast.makeText(this, String.valueOf((item.getItemId())), Toast.LENGTH_LONG).show();
			return true;
		case 6:
			Toast.makeText(this, String.valueOf((item.getItemId())), Toast.LENGTH_LONG).show();
			return true;
		default:
			return false;
		}

	}

}
