package com.zackmatthews.bloglistmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class BlogListAdapter extends BaseAdapter{
    private Context context;
    private List<Blog> data;

    public BlogListAdapter(@NonNull Context context, @NonNull List<Blog> data) {
        this.context = context;
        this.data= data;
    }

    public void add(@NonNull Blog blog){
        data.add(blog);
        notifyDataSetChanged();
    }

    public void remove(int i){
        data.remove(i);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Blog getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        Blog blog = getItem(i);
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.blog_item, null);
            TextView title = view.findViewById(R.id.title);
            TextView description = view.findViewById(R.id.description);
            TextView link = view.findViewById(R.id.link);
            viewHolder = new ViewHolder(title, description, link);
            view.setTag(viewHolder);
        }

        viewHolder = (ViewHolder)view.getTag();
        viewHolder.title.setText(blog.getTitle());
        viewHolder.description.setText(blog.getDescription());
        viewHolder.link.setText(blog.getLink());

        return view;
    }

    static class ViewHolder{
        public TextView title, description, link;

        public ViewHolder(TextView title, TextView description, TextView link) {
            this.title = title;
            this.description = description;
            this.link = link;
        }
    }
}
