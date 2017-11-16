package neeraj8le.com.homelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    RelativeLayout l1, l2, l3, l4, l5_1, l5_2, l5_3;
    ImageView tube1, fan1, bulb1, ac1;
    ImageView tube2, fan2, bulb2, ac2;
    ImageView bulb3;
    ImageView bulb4;
    ImageView tube5, fan5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        tube1 = findViewById(R.id.tube_1);
        fan1 = findViewById(R.id.fan_1);
        bulb1 = findViewById(R.id.bulb_1);
        ac1 = findViewById(R.id.ac_1);

        tube2 = findViewById(R.id.tube_2);
        fan2 = findViewById(R.id.fan_2);
        bulb2 = findViewById(R.id.bulb_2);
        ac2 = findViewById(R.id.ac_2);

        bulb3 = findViewById(R.id.bulb_3);

        bulb4 = findViewById(R.id.bulb_4);

        tube5 = findViewById(R.id.tube_5);
        fan5 = findViewById(R.id.fan_5);

        tube1.setOnClickListener(this);
        fan1.setOnClickListener(this);
        bulb1.setOnClickListener(this);
        ac1.setOnClickListener(this);

        tube2.setOnClickListener(this);
        fan2.setOnClickListener(this);
        bulb2.setOnClickListener(this);
        ac2.setOnClickListener(this);

        bulb3.setOnClickListener(this);

        bulb4.setOnClickListener(this);

        tube5.setOnClickListener(this);
        fan5.setOnClickListener(this);



//        l1 = findViewById(R.id.room1);
//        l2 = findViewById(R.id.room2);
//        l3 = findViewById(R.id.room3);
//        l4 = findViewById(R.id.room4);
//        l5_1 = findViewById(R.id.room5_1);
//        l5_2 = findViewById(R.id.room5_2);
//        l5_3 = findViewById(R.id.room5_3);




//        l1.setOnClickListener(this);
//        l2.setOnClickListener(this);
//        l3.setOnClickListener(this);
//        l4.setOnClickListener(this);
//        l5_1.setOnClickListener(this);
//        l5_2.setOnClickListener(this);
//        l5_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        switch (view.getId())
        {
            case R.id.bulb_1:
                if(bulb1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_off).getConstantState())
                    bulb1.setImageResource(R.drawable.bulb_on);
                else if(bulb1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_on).getConstantState())
                    bulb1.setImageResource(R.drawable.bulb_off);
                break;
            case R.id.tube_1:
                if(tube1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.tubelight_vertical_off).getConstantState())
                    tube1.setImageResource(R.drawable.tubelight_vertical_on);
                else if(tube1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.tubelight_vertical_on).getConstantState())
                    tube1.setImageResource(R.drawable.tubelight_vertical_off);
                break;
            case R.id.ac_1:
                if(ac1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ac_bottom_off).getConstantState())
                    ac1.setImageResource(R.drawable.ac_bottom_on);
                else if(ac1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ac_bottom_on).getConstantState())
                    ac1.setImageResource(R.drawable.ac_bottom_off);
                break;
            case R.id.bulb_2:
                if(bulb2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_off).getConstantState())
                    bulb2.setImageResource(R.drawable.bulb_on);
                else if(bulb2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_on).getConstantState())
                    bulb2.setImageResource(R.drawable.bulb_off);
                break;
            case R.id.tube_2:
                if(tube2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.tubelight_horizontal_off).getConstantState())
                    tube2.setImageResource(R.drawable.tubelight_horizontal_on);
                else if(tube2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.tubelight_horizontal_on).getConstantState())
                    tube2.setImageResource(R.drawable.tubelight_horizontal_off);
                break;
            case R.id.ac_2:
                if(ac2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ac_left_off).getConstantState())
                    ac2.setImageResource(R.drawable.ac_left_on);
                else if(ac2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ac_left_on).getConstantState())
                    ac2.setImageResource(R.drawable.ac_left_off);
                break;
            case R.id.bulb_3:
                if(bulb3.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_on).getConstantState())
                    bulb3.setImageResource(R.drawable.bulb_off);
                else if(bulb3.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_off).getConstantState())
                    bulb3.setImageResource(R.drawable.bulb_on);
                break;
            case R.id.bulb_4:
                if(bulb4.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_on).getConstantState())
                    bulb4.setImageResource(R.drawable.bulb_off);
                else if(bulb4.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.bulb_off).getConstantState())
                    bulb4.setImageResource(R.drawable.bulb_on);
                break;
            case R.id.tube_5:
                if(tube5.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.tubelight_vertical_on).getConstantState())
                    tube5.setImageResource(R.drawable.tubelight_vertical_off);
                else if(tube5.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.tubelight_vertical_off).getConstantState())
                    tube5.setImageResource(R.drawable.tubelight_vertical_on);
                break;




//            case R.id.room1:
//
//                Toast.makeText(MainActivity.this, "Room 1", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.room2:
//                Toast.makeText(MainActivity.this, "Room 2", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.room3:
//                Toast.makeText(MainActivity.this, "Room 3", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.room4:
//                Toast.makeText(MainActivity.this, "Room 4", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.room5_1:
//                Toast.makeText(MainActivity.this, "Room 5", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.room5_2:
//                Toast.makeText(MainActivity.this, "Room 5", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.room5_3:
//                Toast.makeText(MainActivity.this, "Room 5", Toast.LENGTH_SHORT).show();
//                break;

        }
    }
}
