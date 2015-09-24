package moblieprogramming.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import moblieprogramming.calc.R;

public class MainActivity extends Activity {
    EditText edit1, edit2;
    Button btnAdd, btnAdd1, btnAdd2, btnAdd3, btnAdd4;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnAdd1 = (Button) findViewById(R.id.BtnAdd1);
        btnAdd2 = (Button) findViewById(R.id.BtnAdd2);
        btnAdd3 = (Button) findViewById(R.id.BtnAdd3);
        btnAdd4 = (Button) findViewById(R.id.BtnAdd4);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });
        btnAdd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnAdd3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세용", Toast.LENGTH_SHORT).show();
                else if( Double.parseDouble(num2) == 0)
                    Toast.makeText(getApplicationContext(), "0은 안됩니다", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnAdd4.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if( Double.parseDouble(num2) == 0)
                    Toast.makeText(getApplicationContext(), "0으로 나누었습니다.", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });
    }
}