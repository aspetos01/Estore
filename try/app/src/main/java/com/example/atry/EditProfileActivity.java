package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class EditProfileActivity extends AppCompatActivity {
     
    EditText username, email, phonenb, address;
    Button save;
    DBHelper DBB; 
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        
        
        username = (EditText) findViewById(R.id.user_name);
        email = (EditText) findViewById(R.id.user_email);
        phonenb = (EditText) findViewById(R.id.PhoneNumber);
        address = (EditText) findViewById(R.id.address);
        save = (Button) findViewById(R.id.save);
        DBB = new DBHelper(this);
        
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String mail = email.getText().toString();
                String phone = phonenb.getText().toString();
                String adr = address.getText().toString();
                
                if(user.equals("")||pass.equals("")||repass.equals("")||repass.equals(""))
                    Toast.makeText(EditProfileActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                 Boolean checkuser = DB.checkusername(user);
                if(checkuser==false){
                            Boolean insert = DB.insertData(user, mail, phone, adr);
                            if(insert==true){
                                Toast.makeText(EditProfileActivity.this, "Data saved!", Toast.LENGTH_SHORT).show();}
                                else{
                                Toast.makeText(EditProfileActivity.this, "Error occured!", Toast.LENGTH_SHORT).show();}
                                }
        
    }

    public void LaunchHome(View v) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }

    public void LaunchShoppingCart(View v) {
        Intent i = new Intent(this, ShoppingCartActivity.class);
        startActivity(i);
    }
}
