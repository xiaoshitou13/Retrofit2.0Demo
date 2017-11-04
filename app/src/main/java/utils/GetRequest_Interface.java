package utils;

import bean.MyOne;
import bean.MyTwo;
import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by 白玉春 on 2017/11/3.
 */

public interface GetRequest_Interface {

    @GET("/api/4/news/latest")
    Observable<MyOne> getClall();

    @GET("/api/4/news/before/20131119")
    Observable<MyTwo> getOb();
}
