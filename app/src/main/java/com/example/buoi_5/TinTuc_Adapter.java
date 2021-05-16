package com.example.buoi_5;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class TinTuc_Adapter extends BaseAdapter {
    Context context;
    List<Tin_tuc> tin_tucList;
    String rss_name;

    public TinTuc_Adapter(Context context, List<Tin_tuc> tin_tucList, String rss_name) {
        this.context = context;
        this.tin_tucList = tin_tucList;
        this.rss_name = rss_name;
    }

    @Override
    public int getCount() {
        return tin_tucList.size();
    }

    @Override
    public Object getItem(int position) {
        return tin_tucList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public static class ViewHoler{
        TextView tv_link;
        TextView tv_title;
        TextView tv_des;
        TextView tv_pubDate;
        ImageView img_tin_tuc;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoler viewHoler;
        if (convertView == null){
            viewHoler = new ViewHoler();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.show_tin_tuc , null);

            viewHoler.tv_link = convertView.findViewById(R.id.tv_id);
            viewHoler.tv_title = convertView.findViewById(R.id.tv_title);
            viewHoler.tv_des = convertView.findViewById(R.id.tv_des);
            viewHoler.tv_pubDate = convertView.findViewById(R.id.tv_pubDate);
//            viewHoler.img_tin_tuc = convertView.findViewById(R.id.imv_tin_tuc);

            convertView.setTag(viewHoler);
        }else {
            viewHoler = (ViewHoler) convertView.getTag();
        }
//        viewHoler.tv_link.setText(tin_tucList.get(position).getLink());
        viewHoler.tv_link.setText(rss_name);

        viewHoler.tv_title.setText(tin_tucList.get(position).getTitle());

//        viewHoler.tv_des.setText(tin_tucList.get(position).getDes());
        viewHoler.tv_des.setText("");

        viewHoler.tv_pubDate.setText(tin_tucList.get(position).getPubDate());

/*        try {
            Picasso.with(context)
                    .load("https://banner2.cleanpng.com/20180711/cyx/kisspng-smiley-computer-icons-pero-5b46cd0ce6c057.5018290915313666689452.jpg")
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.drawable.ic_launcher_background)
                    .into(viewHoler.img_tin_tuc);
            Log.e("\t\t---------------------" , "\t\t\t da load anh ");
        } catch (Exception ex){
            Log.e("\t\t---------------------" , ex.toString());
        }*/
        return convertView;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
