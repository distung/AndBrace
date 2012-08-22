package com.lesterribles.andbrace;

import com.tournament.BracketView;

import android.os.Build;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.PopupMenu;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public MainActivity() {
	   // TODO Auto-generated constructor stub
   }
    
	@Override
   public void onClick(View v) {
		
	   BracketView bracket = (BracketView) this.findViewById(R.id.bview);
      // Popup Menu
   	int version = Integer.parseInt(Build.VERSION.SDK);
   				
   	//if (version >= Build.VERSION_CODES.HONEYCOMB) {
   		//com.lesterribles.andbrace.Menu menu = new com.lesterribles.andbrace.Menu(this, this.findViewById(R.id.bview));
   	//}
   }
	
	
	@TargetApi(11)
	public void showPopup(View v) {
	    PopupMenu popup = new PopupMenu(this, v);
	    MenuInflater inflater = popup.getMenuInflater();
	    inflater.inflate(R.menu.actions, popup.getMenu());
	    popup.show();
	}
	
	
	// menu button
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
