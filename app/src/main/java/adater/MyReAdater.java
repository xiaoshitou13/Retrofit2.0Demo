package adater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import bean.MyOne;
import bean.MyTwo;
import test.bwie.com.retrofit20demo.R;

/**
 * Created by 白玉春 on 2017/11/3.
 */

public class MyReAdater extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<MyTwo.StoriesBean> list;
    Context context ;

    public MyReAdater(List<MyTwo.StoriesBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OneHoder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
           if(holder instanceof  OneHoder){
               ((OneHoder) holder).t1.setText(list.get(position).getTitle());

                 Glide.with(context).load(list.get(position).getImages().get(0)).into(((OneHoder) holder).i1);
           }
    }

    @Override
    public int getItemCount() {
        return list !=null ? list.size() : 0;
    }

    class OneHoder extends RecyclerView.ViewHolder{
        ImageView i1;
        TextView t1;
        public OneHoder(View itemView) {
            super(itemView);
            i1 = itemView.findViewById(R.id.image);
            t1 = itemView.findViewById(R.id.tv2);
        }
    }
}
