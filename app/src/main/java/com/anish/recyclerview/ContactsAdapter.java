package com.anish.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
Context mContext;
List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contacts,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
Contacts contacts=contactsList.get(position);
holder.ivkroos.setImageResource(contacts.getImageId());
holder.tvContact.setText(contacts.getName());
holder.tvPhone.setText(contacts.getPhoneNo());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        ImageView ivkroos;

        TextView tvContact,tvPhone;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            ivkroos=itemView.findViewById(R.id.imageView);
            tvContact=itemView.findViewById(R.id.textView3);
            tvPhone=itemView.findViewById(R.id.textView4);
        }



    }

}
