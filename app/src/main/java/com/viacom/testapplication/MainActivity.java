package com.viacom.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Contains a Button that adds a certain amount of water to the water tank, a TextView that indicates
 * the current amount of water in the tank, and a CheckBox to indicate if the tank is full or not.
 */
public class MainActivity extends AppCompatActivity {

    private static final String STATE_WATER_TANK_CURRENT_AMOUNT_IN_LITERS = "currentAmountInLiters";

    private WaterTank waterTank;

    private TextView currentAmountInLitersView;

    private CheckBox tankIsFullIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int maxTankCapacity = getResources().getInteger(R.integer.max_tank_capacity);

        if (savedInstanceState != null) {
            waterTank = new WaterTank(maxTankCapacity, savedInstanceState.getInt(STATE_WATER_TANK_CURRENT_AMOUNT_IN_LITERS));
        } else {
            waterTank = new WaterTank(maxTankCapacity, 0);
        }

        currentAmountInLitersView = (TextView) findViewById(R.id.current_amount_in_liters);
        tankIsFullIndicator = (CheckBox) findViewById(R.id.tank_is_full_indicator);

        findViewById(R.id.add_water).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addWater();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_WATER_TANK_CURRENT_AMOUNT_IN_LITERS, waterTank.getCurrentAmountInLiters());
    }

    private void addWater() {
        int amountToAdd = getResources().getInteger(R.integer.amount_to_add);
        boolean isTankFull = waterTank.addWater(amountToAdd);
        tankIsFullIndicator.setChecked(isTankFull);
        currentAmountInLitersView.setText(String.valueOf(waterTank.getCurrentAmountInLiters()));
    }
}
