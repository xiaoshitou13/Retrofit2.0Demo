package test.bwie.com.retrofit20demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adater.MyReAdater;
import bean.MyOne;
import bean.MyTwo;
import prenster.MyPre;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import utils.GetRequest_Interface;
import view.Iview;

public class MainActivity extends AppCompatActivity implements Iview{

    //String json1 = "http://news-at.zhihu.com";
    String json1 = "http://news-at.zhihu.com";
    private RecyclerView mRecy1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecy1 = (RecyclerView) findViewById(R.id.recy1);
        mRecy1.setLayoutManager(new LinearLayoutManager(this));
        MyPre myPre = new MyPre(this,this);
        myPre.Get();
    }
    @Override
    public String s() {
        return json1;
    }

    @Override
    public void Gets(MyTwo two) {
         MyReAdater myReAdater = new MyReAdater(two.getStories(),MainActivity.this);
        mRecy1.setAdapter(myReAdater);
    }


}
