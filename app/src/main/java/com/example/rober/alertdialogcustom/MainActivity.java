package com.example.rober.alertdialogcustom;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button)findViewById(R.id.log_in);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLoginDialog();
            }
        });

        //Probando commits
        Log.d("git","prueba de commit");

    }
    private void showLoginDialog() {
        // layout and inflater
        LayoutInflater inflater = this.getLayoutInflater();
        View content = inflater.inflate(R.layout.dialog, null);

        AlertDialog.Builder dialog = new AlertDialog.Builder(new ContextThemeWrapper(this, android.R.style.Theme_Holo_Light));
        dialog.setTitle("titulo");
        dialog.setView(content);

        Button butLogin = (Button) content.findViewById(R.id.log_in);
        butLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Do your Login stuff here or all another method
                // does not close dialog
            }
        });

        Button butAccount = (Button) content.findViewById(R.id.create_account);
        butAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Do your Create Account stuff here or all another method
                // does not close dialog
            }
        });
        dialog.setNeutralButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        dialog.setNegativeButton("skip", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // do nothing, just allow dialog to close
            }
        });

        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                // do nothing, just allow dialog to close
                // this happens on back button getting hit
            }
        });

        dialog.show();
    }
}
