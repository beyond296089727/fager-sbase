package com.example.root;

import java.io.DataOutputStream;
import java.lang.Runtime;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.Toast;

public class RootActivity extends Activity {
	Process process = null;  
    DataOutputStream os = null; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        
        Button bt=(Button) findViewById(R.id.button1);
        Button powerOFF=(Button) findViewById(R.id.button2);
        powerOFF.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) 
			{
				String pkgCodePath = null ;
			       // Log.d(TAG, "pkgCodePath=" + pkgCodePath);  
			        Process process = null;  
			        DataOutputStream os = null;  
			        try {  
			            String cmd = "poweroff";  
			            process = Runtime.getRuntime().exec("su"); //«–ªªµΩroot’ ∫≈  
			            os = new DataOutputStream(process.getOutputStream());  
			            os.writeBytes(cmd + "\n");  
			            os.writeBytes("exit\n");  
			            os.flush();  
			            process.waitFor();  
			        } catch (Exception e) {  
			           // Toast.makeText(this, "root error!" + pkgCodePath, Toast.LENGTH_SHORT).show();  
			            e.printStackTrace();  
			            return;  
			        } finally {  
			            try {  
			                if (os != null) {  
			                    os.close();  
			                }  
			                process.destroy();  
			  
			  
			            } catch (Exception e) {  
			            }  
			        }  
			        Toast.makeText(RootActivity.this, "root success!" + pkgCodePath, Toast.LENGTH_SHORT).show();  
			        return;  
			      
				
			}
        });
        bt.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) 
			{
				String pkgCodePath = null ;
			       // Log.d(TAG, "pkgCodePath=" + pkgCodePath);  
			        Process process = null;  
			        DataOutputStream os = null;  
			        try {  
			            String cmd = "reboot";  
			            process = Runtime.getRuntime().exec("su"); //«–ªªµΩroot’ ∫≈  
			            os = new DataOutputStream(process.getOutputStream());  
			            os.writeBytes(cmd + "\n");  
			            os.writeBytes("exit\n");  
			            os.flush();  
			            process.waitFor();  
			        } catch (Exception e) {  
			           // Toast.makeText(this, "root error!" + pkgCodePath, Toast.LENGTH_SHORT).show();  
			            e.printStackTrace();  
			            return;  
			        } finally {  
			            try {  
			                if (os != null) {  
			                    os.close();  
			                }  
			                process.destroy();  
			  
			  
			            } catch (Exception e) {  
			            }  
			        }  
			        Toast.makeText(RootActivity.this, "root success!" + pkgCodePath, Toast.LENGTH_SHORT).show();  
			        return;  
			      
				
			}
        });
        
    }
    
}
