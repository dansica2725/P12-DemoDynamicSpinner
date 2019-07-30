package c346.rp.edu.sg.demodynamicspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import c346.rp.edu.sg.dynamicspinner.R;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1, spinner2;
    Button updateBtn;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);

        updateBtn = findViewById(R.id.updateBtn);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:

                        // Adding Even Number Array to an Adapter using Simple Spinner Layout
                        adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.even_numbers, android.R.layout.simple_spinner_item);

                        // Specify the layout to use when the list of choices appears
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        // Apply the adapter to the spinner
                        spinner2.setAdapter(adapter);

                        spinner2.setSelection(2);
                        break;
                    case 1:

                        // Adding Even Number Array to an Adapter using Simple Spinner Layout
                        adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.odd_numbers, android.R.layout.simple_spinner_item);

                        // Specify the layout to use when the list of choices appears
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        // Apply the adapter to the spinner
                        spinner2.setAdapter(adapter);

                        spinner2.setSelection(1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (spinner1.getSelectedItemPosition()) {
                    case 0:

                        // Adding Even Number Array to an Adapter using Simple Spinner Layout
                        adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.even_numbers, android.R.layout.simple_spinner_item);

                        // Specify the layout to use when the list of choices appears
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        // Apply the adapter to the spinner
                        spinner2.setAdapter(adapter);
                        break;
                    case 1:

                        // Adding Even Number Array to an Adapter using Simple Spinner Layout
                        adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.odd_numbers, android.R.layout.simple_spinner_item);

                        // Specify the layout to use when the list of choices appears
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        // Apply the adapter to the spinner
                        spinner2.setAdapter(adapter);
                        break;
                }
            }
        });

    }
}
