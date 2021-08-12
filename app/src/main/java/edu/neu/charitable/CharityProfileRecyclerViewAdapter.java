package edu.neu.charitable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharityProfileRecyclerViewAdapter extends RecyclerView.Adapter<CharityProfileRecyclerViewHolder> {

    private ArrayList<EventCard> cardList;
    private CharityProfileRecyclerViewHolder recyclerViewHolder;

    public CharityProfileRecyclerViewAdapter(ArrayList<EventCard> cardList) {
        this.cardList = cardList;
    }

    public CharityProfileRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {                  // Create a Recycler View Holder for a new card.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donation_card,        // Inflate the layout to set up the view.
                parent,
                false);
        this.recyclerViewHolder = new CharityProfileRecyclerViewHolder(view);
        return this.recyclerViewHolder;                                         // Return a new RecyclerViewHolder with the inflated view and listener.
    }

    @Override
    public void onBindViewHolder(CharityProfileRecyclerViewHolder viewHolder, int position) {
        EventCard currentCard = this.cardList.get(position);                                         // Get a reference to the current card at the given position.
        viewHolder.eventName.setText(currentCard.getName());                                     // Pass the given View Holder the current card's name.

        // Pass the given View Holder the current card's description.
        viewHolder.eventDescription.setText(currentCard.getDescription());
    }


    @Override
    public int getItemCount() {
        // Return the number of cards in the list.
        return this.cardList.size();
    }

    public CharityProfileRecyclerViewHolder getRecyclerViewHolder() {
        return this.recyclerViewHolder;
    }


}
