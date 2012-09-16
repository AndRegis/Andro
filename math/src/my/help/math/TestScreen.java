package my.help.math;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.content.Intent;

public class TestScreen extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);      
        setContentView(R.layout.test_screen);
        
        View MyButton2 = findViewById(R.id.button1);
        MyButton2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.test_screen, menu);
        return true;
    }
    
	public void onClick(View view) {
		Intent intent = new Intent(this, Result.class);
		startActivity(intent);	
	}
}
