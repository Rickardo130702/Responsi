package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProyekAdapter extends RecyclerView.Adapter<ProyekAdapter.ProyekViewHolder> {
    private final LayoutInflater mInflater;
    private List<ProyekModel> proyekModelList;
    private LayoutInflater layoutInflater;
    private Context context;
    final ProyekAdapter.OnItemClickListener listener;

    public ProyekAdapter(List<ProyekModel> proyekModelList, Context context, AdapterView.OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.proyekModelList = proyekModelList;
        this.context = context;
        this.listener = listener;

    }

    public ProyekAdapter(List<ProyekModel> elemets, ProyekActivity context, OnItemClickListener onItemClickListener) {
    }

    @NonNull
    @Override
    public ProyekAdapter.ProyekViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_proyek,null);
        return  new ProyekAdapter.ProyekViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProyekViewHolder holder, int position) {
        holder.binData(proyekModelList.get(position));
    }

    @Override
    public int getItemCount(){
        return proyekModelList.size();
    }

    public void setItem(List<ProyekModel>items){
        proyekModelList = items;
    }

    public class ProyekViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaAolikasih, tvnamaKelompok;

        public ProyekViewHolder(@NonNull View itemView, TextView tvNamaAolikasih, TextView tvnamaKelompok) {
            super(itemView);
            this.tvNamaAolikasih = itemView.findViewById(R.id.tvitemnamaAplikasi);
            this.tvnamaKelompok = itemView.findViewById(R.id.tvitemnamaKelompok);
        }

        public  void binData (final ProyekModel item){
            tvnamaKelompok.setText(item.getNamaTeam());
            tvNamaAolikasih.setText(item.getNamaAplikasi());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });

        }


    }

    public interface OnItemClickListener {
        void onItemClick(ProyekModel item);
    }


}


