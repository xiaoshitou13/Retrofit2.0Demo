package model;

import adater.MyReAdater;
import bean.MyTwo;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.bwie.com.retrofit20demo.MainActivity;
import utils.GetRequest_Interface;
import utils.Isuccess;

/**
 * Created by 白玉春 on 2017/11/3.
 */

public class Mymodel implements Imodel{
    @Override
    public void Qinqiu(String url, final Isuccess isuccess) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())  //结合 rxjava
                .build();
        GetRequest_Interface anInterface = retrofit.create(GetRequest_Interface.class);
        Observable<MyTwo> oneObservable = anInterface.getOb();
        oneObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MyTwo>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                    }
                    @Override
                    public void onNext(MyTwo tow) {
                        isuccess.Success(tow);
                    }
                });
    }
}
