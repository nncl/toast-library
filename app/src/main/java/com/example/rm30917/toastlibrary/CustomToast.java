package com.example.rm30917.toastlibrary;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * Created by RM30917 on 17/12/2016.
 */
public class CustomToast {

    public static void showWarning(Activity activity, String texto) {
        showMessage(activity, R.layout.toast_atencao, texto);
    }

    public static void showInfo(Activity activity, String texto) {
        showMessage(activity, R.layout.toast_info, texto);
    }

    public static void showErro(Activity activity, String texto) {
        showMessage(activity, R.layout.toast_erro, texto);
    }

    private static void showMessage(Activity activity, int layout, String texto) {
        Context context = activity;
        LayoutInflater inflater = activity.getLayoutInflater();

        View customToastroot = inflater.inflate(layout, null);

        Toast customtoast = new Toast(context);

        customtoast.makeText(activity, texto, Toast.LENGTH_LONG);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL |
                Gravity.CENTER_VERTICAL, 0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }

}
