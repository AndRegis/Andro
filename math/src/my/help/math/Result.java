package my.help.math;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class Result extends Activity implements OnClickListener {	
	
	String ololo="";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);      
        setContentView(R.layout.result);
        
        View MyButton3 = findViewById(R.id.button3);
        MyButton3.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.result, menu);
        return true;
    }
    
	public void onClick(View view) {
		ololo += "Hello, string! \n";
        TextView MyResult = (TextView) findViewById(R.id.resultField);
        MyResult.setText(Html.fromHtml(ololo));
	}
}