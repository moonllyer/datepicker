package net.simonvt.datepicker.samples;

import net.simonvt.datepicker.DatePickDialog;
import net.simonvt.datepicker.DatePickDialog.OnDateSetListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;


public class DialogSample extends Activity {

	private TextView txtShowResult;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        initView();

        findViewById(R.id.btnDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            	new DatePickDialog(DialogSample.this, "����ѡ��", "ȷ��", "ȡ��").show();
            	DatePickDialog datepiker = new DatePickDialog(DialogSample.this,
            			new OnDateSetListener(){
							@Override
							public void onDateSet(
									net.simonvt.datepicker.DatePicker view,
									int year, int monthOfYear, int dayOfMonth) {
								// TODO Auto-generated method stub
								txtShowResult.setText(year + "��" +
								monthOfYear + "��" +
								dayOfMonth + "��");
							}
            		
            	},"����ѡ��", "ȷ��", "ȡ��");
            	datepiker.show();
            }
        });

    }
    
    private void initView(){
    	txtShowResult = (TextView) findViewById(R.id.date_result);
    }
}
