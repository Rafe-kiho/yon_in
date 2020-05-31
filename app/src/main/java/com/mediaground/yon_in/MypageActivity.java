package com.mediaground.yon_in;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class MypageActivity  extends AppCompatActivity {
    TextView User_ID;
    TextView User_Nick;
    TextView User_Pw;
    TextView log_out;
    RadioButton RightHand;
    RadioButton LeftHand;
    Button bt_compl;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();

        setContentView(R.layout.my_page);

        User_ID= (TextView)findViewById(R.id.User_ID);
        User_Nick=(TextView)findViewById(R.id.User_Nick);
        User_Pw=(TextView)findViewById(R.id.User_Pw);

        RightHand=(RadioButton)findViewById(R.id.RightHand);
        LeftHand=(RadioButton)findViewById(R.id.LeftHand);
        bt_compl=(Button)findViewById(R.id.bt_compl);
        bt_compl.setOnClickListener((View.OnClickListener) this);
        log_out.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View view){
        if (view==bt_compl){
            Intent intent =new Intent(getApplicationContext(), MypagefixActivity.class);
            startActivity(intent);
        }
        /*if (view==log_out){

        }*/
    }
}
