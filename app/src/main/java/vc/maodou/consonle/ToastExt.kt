package vc.maodou.consonle

import android.content.Context
import android.widget.Toast

/**
 * Created by Administrator on 2017/5/19 0019.
 */
fun Context.toast(mess: String,length : Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, mess, length).show()
}