package com.example.a38213.broadcastbestpractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestStaticRegister extends BroadcastReceiver {


    @Override
    public void onReceive(final Context context, Intent intent) {
        Toast.makeText(context,"网络发生了变化",Toast.LENGTH_SHORT).show();
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //Toast.makeText(context,"abcdasdf",Toast.LENGTH_SHORT).show();
        /*AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Warning");
        builder.setMessage("You are forced to be offline,Please try to login again.");
        builder.setCancelable(false);//返回键无效
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityCollector.finishAll();
                Intent intent = new Intent(context,LoginActivity.class);
                context.startActivity(intent);
            }
        });
        builder.show();

        Log.d(TAG, "onReceive: success");*/

    }
}

