import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kz.first.myapplication.R;


        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

    public class calculator extends AppCompatActivity {

        Button btnOne, btnTwo, btnThird, btnFirth, btnFive, btnSix, btnSeven, btnEight, btnNine;
        Button  btnOshiru, btnPlusMinus;
        TextView textsan;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.calculatorhw);

            btnOne = findViewById(R.id.btnOne);
            btnTwo = findViewById(R.id.btnTwo);
            btnThird = findViewById(R.id.btnThird);
            btnFirth = findViewById(R.id.btnFfirth);
            btnFive = findViewById(R.id.btnFive);
            btnSix = findViewById(R.id.btnSix);
            btnSeven = findViewById(R.id.btnSeven);
            btnEight = findViewById(R.id.btnEight);
            btnNine = findViewById(R.id.btnNine);


            btnOshiru = findViewById(R.id.btnOshiru);
            btnPlusMinus = findViewById(R.id.btnPlusMinus);






            textsan = findViewById(R.id.textsan);


            View.OnClickListener buttonSandar = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String aldingiSan = textsan.getText().toString();
                    String basilganSan = "";
                    String songiResult = "";
                    switch (view.getId()){
                        case R.id.btnOne:
                            basilganSan = "1";
                            break;
                        case R.id.btnTwo:
                            basilganSan = "2";
                            break;
                        case R.id.btnThird:
                            basilganSan = "3";
                            break;
                        case R.id.btnFfirth:
                            basilganSan = "4";
                            break;
                        case R.id.btnFive:
                            basilganSan = "5";
                            break;
                        case R.id.btnSix:
                            basilganSan = "6";
                            break;
                        case R.id.btnSeven:
                            basilganSan = "7";
                            break;
                        case R.id.btnEight:
                            basilganSan = "8";
                            break;
                        case R.id.btnNine:
                            basilganSan = "9";
                            break;

                    }
                    if (!aldingiSan.equals("0")) songiResult = aldingiSan + basilganSan;
                    else songiResult = basilganSan;
                    textsan.setText(songiResult);
                }
            };
            btnOne.setOnClickListener(buttonSandar);
            btnTwo.setOnClickListener(buttonSandar);
            btnThird.setOnClickListener(buttonSandar);
            btnFirth.setOnClickListener(buttonSandar);
            btnFive.setOnClickListener(buttonSandar);
            btnSix.setOnClickListener(buttonSandar);
            btnSeven.setOnClickListener(buttonSandar);
            btnEight.setOnClickListener(buttonSandar);
            btnNine.setOnClickListener(buttonSandar);

            View.OnClickListener buttonOwiruPlusMinus = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()){
                        case R.id.btnOshiru:
                            textsan.setText("0");
                            break;

                        case R.id.btnPlusMinus:

                            String sanText = textsan.getText().toString();
                            int san = Integer.parseInt(sanText);

                            if(san > 0) textsan.setText("-"+sanText);

                            else{
                                san = san * (-1);
                                textsan.setText(""+san);
                            }


                            break;
                    }

                }
            };

            btnOshiru.setOnClickListener(buttonOwiruPlusMinus);
            btnPlusMinus.setOnClickListener(buttonOwiruPlusMinus);


        }
    }



