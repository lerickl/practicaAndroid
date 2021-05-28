package com.example.videojuegos.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.videojuegos.Anime;
import com.example.videojuegos.R;

import java.util.List;


public class StringAdapter extends RecyclerView.Adapter<StringAdapter.StringViewHolder> {

    private List<Anime> mData;


    public StringAdapter(List<Anime> getAnim) {
        mData=getAnim;

    }

    public class StringViewHolder extends RecyclerView.ViewHolder {
        private View mview;
        public StringViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
        }
    }

    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater mLayoutInflater=LayoutInflater.from(parent.getContext());
        View view= mLayoutInflater.inflate(R.layout.item_string, parent , false);
        return new StringViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder holder, int position) {
        //lleno los datos

        TextView mTextViewNombre = holder.mview.findViewById(R.id.tvNombre);
        TextView mTextViewDescripcion = holder.mview.findViewById(R.id.tvDescription);
        ImageView avatar= (ImageView)holder.mview.findViewById(R.id.imageviewAvatar);
        ImageView star=(ImageView)holder.mview.findViewById(R.id.imageViewStar);

        Anime text=mData.get(position);

        mTextViewNombre.setText(text.nombre);
        mTextViewDescripcion.setText(text.Descripcion);

        star.setImageResource( R.drawable.ic_baseline_star_24);
        avatar.setImageResource(text.avatar);


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
