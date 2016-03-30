package com.steve.creact.library.viewholder;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @author:YJJ
 * @date:2015/10/15
 * @email:yangjianjun@117go.com
 */
public class BaseRecyclerViewHolder<T> extends RecyclerView.ViewHolder {
    public BaseRecyclerViewHolder(View itemView) {
        super(itemView);
    }

    public Context getContext() {
        return itemView.getContext();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        itemView.setOnClickListener(listener);
    }

    public void setData(T data) {
    }

    protected void setListener() {
    }

    protected void initView() {
    }

    protected <T extends View> T findView(@IdRes int id) {
        return (T) itemView.findViewById(id);
    }



    public View getView() {
        return itemView;
    }
}