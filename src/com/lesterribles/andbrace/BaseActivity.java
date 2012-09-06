package com.lesterribles.andbrace;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.tournament.BracketActivity;

public class BaseActivity extends Activity {
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
			Intent startNewActivityOpen = new Intent(this, BracketActivity.class);
			startActivityForResult(startNewActivityOpen, 0);
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