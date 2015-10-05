package activity.ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class aboutActivity extends AppCompatActivity
{
    private Button food;
    private Button school;
    private Button tV;
    private Button games;
    private Button program;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        food = (Button) findViewById(R.id.food);
        school = (Button) findViewById(R.id.school);
        tV = (Button) findViewById(R.id.tV);
        games = (Button) findViewById(R.id.games);
        program = (Button) findViewById(R.id.program);
        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        food.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), FoodActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        school.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), SchoolActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        games.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), GamesActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        tV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), TvActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        school.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), SchoolActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        program.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), ProgrammingActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
