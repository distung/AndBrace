package com.lesterribles.andbrace;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.view.MenuInflater;
import android.widget.PopupMenu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends BaseActivity implements OnClickListener {

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
		
	   //BracketView bracket = (BracketView) this.findViewById(R.id.bview);
      // Popup Menu
   	//int version = Integer.parseInt(Build.VERSION.SDK);
   				
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

}