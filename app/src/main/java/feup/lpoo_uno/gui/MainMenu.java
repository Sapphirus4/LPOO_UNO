package feup.lpoo_uno.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import feup.lpoo_uno.R;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:13
 */
public class MainMenu extends GameState {

	public MainMenu(){

	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        findViewById(R.id.button_settings).setOnClickListener(handler);
        findViewById(R.id.button_exit_game).setOnClickListener(handler);
    }

    View.OnClickListener handler = new View.OnClickListener(){
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.button_settings:
                    // doStuff
                    startActivity(new Intent(MainMenu.this, Settings.class));
                    break;
                case R.id.button_exit_game:
                    // doStuff
                    finish();
                    break;
            }
        }
    };


    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/

}