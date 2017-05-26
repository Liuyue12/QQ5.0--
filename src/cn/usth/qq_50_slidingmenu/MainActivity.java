package cn.usth.qq_50_slidingmenu;

import cn.usth.qq_50_slidingmenu.view.SlidingMenu;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.os.Build;

public class MainActivity extends Activity {

	private SlidingMenu mLeftMenu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		mLeftMenu=(SlidingMenu) findViewById(R.id.id_menu);
	}
	
	public void toggleMenu(View v){
		mLeftMenu.toggle();
	}


}
