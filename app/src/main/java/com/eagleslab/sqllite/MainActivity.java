package com.eagleslab.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnadd) Button mBtnAdd;
    @BindView(R.id.btnview_all) Button mBtnViewAll;
    @BindView(R.id.customer_list_view) ListView mCustomerListView;
    @BindView(R.id.etAge) EditText mEtAge;
    @BindView(R.id.etName) EditText mEtName;
    @BindView(R.id.switch_act) Switch  mSwitchAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    CustomerModel customerModel = new CustomerModel(-1, mEtName.getText().toString(),Integer.parseInt(mEtAge.getText().toString()),mSwitchAct.isChecked());

                    Toast.makeText(MainActivity.this,customerModel.toString(),Toast.LENGTH_LONG).show();


                }
                catch (Exception e) {

                    Toast.makeText(MainActivity.this,"Error Creating new customer",Toast.LENGTH_LONG).show();

                }


            }
        });

        mBtnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"View All",Toast.LENGTH_LONG).show();

            }
        });

    }
}