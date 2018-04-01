package com.ace.deni.latihan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class InputActivity extends AppCompatActivity {

    EditText enama,euser,eemail,epassword,ephone,ealamat;
    String snama, suser, semail, spassword, sphpne, salamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        enama = findViewById(R.id.nama);
        euser = findViewById(R.id.user);
        eemail = findViewById(R.id.email);
        epassword = findViewById(R.id.password);
        ephone = findViewById(R.id.phone);
        ealamat = findViewById(R.id.alamat);
    }

    public void validasi(View view){
        boolean nama = enama.getText().toString().isEmpty();
        boolean user = euser.getText().toString().isEmpty();
        boolean email = eemail.getText().toString().isEmpty();
        boolean password = epassword.getText().toString().isEmpty();
        boolean phone = ephone.getText().toString().isEmpty();
        boolean alamat = ealamat.getText().toString().isEmpty();

        if (nama){
            enama.setError("nama harus diisi");
            enama.requestFocus();
        }else if(user){
            euser.setError("user harus diis");
            euser.requestFocus();
        }else if(email) {
            eemail.setError("Email harus diis");
            eemail.requestFocus();
        }else if(!Patterns.EMAIL_ADDRESS.matcher(eemail.getText().toString()).matches()){
            eemail.setText("");
            eemail.setError("Email harus diis");
            eemail.requestFocus();
        }else if(password){
            epassword.setError("Password harus diis");
            epassword.requestFocus();
        }else if(phone){
            ephone.setError("Phone harus diis");
            ephone.requestFocus();
        }else if(!Patterns.PHONE.matcher(ephone.getText().toString()).matches()) {
            ephone.setText("");
            ephone.setError("Nomer tidak valid");
            ephone.requestFocus();
        }else if(alamat){
            ealamat.setError("alamat harus diis");
            ealamat.requestFocus();
        }else {

                Toast.makeText(this, "oke", Toast.LENGTH_SHORT).show();
                snama = enama.getText().toString();
                suser = euser.getText().toString();
                spassword = epassword.getText().toString();
                sphpne = ephone.getText().toString();
                salamat = ealamat.getText().toString();
                semail = eemail.getText().toString();

//            new AlertDialog.Builder(this)
//                    .setIcon(R.drawable.android)
//                    .setTitle("Data Anda")
//                    .setMessage("Nama: " + snama + "\nUsername: " + suser + "\nEmail: " + eemail)
//                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//
//                        }
//                    }).create().show();
        }
    }

    public void hapus (View view){
        enama.setText("");
        ephone.setText("");
        eemail.setText("");
        ealamat.setText("");
        epassword.setText("");
        euser.setText("");
    }
}
