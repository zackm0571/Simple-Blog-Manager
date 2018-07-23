package com.zackmatthews.bloglistmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

public class DataStore {
    private static DataStore instance;
    private BlogListAdapter adapter;

    public static DataStore getInstance() {
        if(instance == null) instance = new DataStore();
        return instance;
    }

    @Nullable
    public BlogListAdapter getAdapter() {
        return adapter;
    }

    public BlogListAdapter getAdapterAndCreateIfNull(@NonNull Context context, @NonNull List<Blog> items){
        if(adapter == null){
            adapter = new BlogListAdapter(context, items);
        }
        return adapter;
    }

    public void addBlog(Blog blog){
        adapter.add(blog);
    }
    public void removeBlog(int i){
        adapter.remove(i);
    }
}
