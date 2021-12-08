package com.example.currencyconverter; 
  
import android.support.v7.app.AppCompatActivity;  
import android.os.Bundle;  
import android.widget.Toast;  
  
public class MainActivity extends AppCompatActivity {  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
      //
       //Displaying Toast with Hello message  
        Toast.makeText(getApplicationContext(),"Hello Message",Toast.LENGTH_SHORT).show(); 
  
        
    }  
}  
