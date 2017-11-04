package prenster;

import android.content.Context;

import bean.MyTwo;
import model.Mymodel;
import utils.Isuccess;
import view.Iview;

/**
 * Created by 白玉春 on 2017/11/3.
 */

public class MyPre {

    Mymodel mymodel;
    Context context;

    Iview iview;

    public MyPre(Context context, Iview iview) {
        this.context = context;
        this.iview = iview;
        mymodel = new Mymodel();
    }


    public void Get() {
        mymodel.Qinqiu(iview.s(), new Isuccess() {
            @Override
            public void Success(MyTwo two) {
                 iview.Gets(two);
            }
        });
    }
}
