package com.mediaground.yon_in;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MypagefixActivity  extends AppCompatActivity{
    EditText User_ID;
    EditText User_Nick;
    EditText User_Pw;
    TextView log_del;
    RadioButton RightHand;
    RadioButton LeftHand;
    Button bt_compl;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();

        setContentView(R.layout.my_page_fix);

        User_ID=(EditText)findViewById(R.id.Edit_ID);
        User_Nick=(EditText)findViewById(R.id.Edit_Nick);
        User_Pw=(EditText)findViewById(R.id.Edit_PW);
        RightHand=(RadioButton)findViewById(R.id.RightHand);
        LeftHand=(RadioButton)findViewById(R.id.LeftHand);
        bt_compl=(Button)findViewById(R.id.bt_compl);

        bt_compl.setOnClickListener((View.OnClickListener) this);
        log_del.setOnClickListener((View.OnClickListener) this);


    }

    public void onClick(View view){
        String Id=User_ID.getText().toString().trim();
        String Nick=User_Nick.getText().toString().trim();
        String Pw=User_Pw.getText().toString().trim();

        if (view==bt_compl){
            if(TextUtils.isEmpty(Id)){
                Toast.makeText(this, "ID를 입력해 주세요.", Toast.LENGTH_SHORT).show();
                return;
            }
            else if(TextUtils.isEmpty(Nick)){
                Toast.makeText(this, "닉네임을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                return;
            }
            else if(TextUtils.isEmpty(Pw)){
                Toast.makeText(this, "닉네임을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                return;
            }
            else{
                Intent intent =new Intent(getApplicationContext(), MypageActivity.class);
                startActivity(intent);
            }

        }
        /*if (view==log_del){

        }*/
    }

}
