package net.gingz.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

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

    public void openProjectOne(View view) {
        Context context = this;
        String myMsg = "This is where you will find the Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, myMsg, duration);
        toast.show();
    }

    public void openProjectTwo(View view) {
        Context context = this;
        String myMsg = "This is the home of the 'Super DUO!' app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, myMsg, duration);
        toast.show();
    }

    public void openProjectThree(View view) {
        Context context = this;
        String myMsg = "Smaller?!  No!  It's the Build it Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, myMsg, duration);
        toast.show();
    }

    public void openProjectFour(View view) {
        Context context = this;
        String myMsg = "Not just any design, but a Material Designed app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, myMsg, duration);
        toast.show();
    }

    public void openProjectFive(View view) {
        Context context = this;
        String myMsg = "Welcome to the world of the Ubiquitous app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, myMsg, duration);
        toast.show();
    }

    public void openProjectSix(View view) {
        Context context = this;
        String myMsg = "*Drumroll*  This is what it all boils down to!  My very own app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, myMsg, duration);
        toast.show();
    }


}
