package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.data.Item;

import java.util.ArrayList;

public class CatRecyclerViewAdapter extends RecyclerView.Adapter {
    private final ArrayList<Item> items;

    public CatRecyclerViewAdapter(ArrayList<Item> items){
        Log.d("a","durlsdfasdfasdf");
        this.items = items;
    }


    // List Item의 셀을 생성한다.
    // @NonNull은 애너테이션(annotation) 중 하나로, 특정 변수, 매개변수, 또는 반환값이 null이 될 수 없음을 명시적으로 나타내는 역할을 합니다.
    @NonNull  @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CatViewHolder catHolder = (CatViewHolder) holder;
//        catHolder.tv_profile.setImageResource(items.get(position).getIv_profile());
        catHolder.tv_name.setText(items.get(position).getTv_name());
        catHolder.tv_desc.setText(items.get(position).getTv_desc());
        catHolder.itemView.setTag(position);
        catHolder.itemView.setOnClickListener(v->{
            var name = catHolder.tv_name.getText();
            Toast.makeText(v.getContext(),name,Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        Log.d("item count", items.size() + "");
        return items.size();
    }
    static class CatViewHolder extends RecyclerView.ViewHolder {
        ImageView tv_profile;
        TextView tv_name;
        TextView tv_desc;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_profile = itemView.findViewById(R.id.tv_profile);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_desc = itemView.findViewById(R.id.tv_desc);
        }
    }
}
