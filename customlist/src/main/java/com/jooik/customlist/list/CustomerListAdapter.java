package com.jooik.customlist.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jooik.customlist.R;
import com.jooik.customlist.data.Customer;

import java.util.List;

/**
 * Customer list adapter implementation...
 */
public class CustomerListAdapter extends ArrayAdapter<Customer>
{
    private final Context context;
    private final List<Customer> customers;

    public CustomerListAdapter(Context context, int textViewResourceId, List<Customer> customers)
    {
        super(context, R.layout.customer_row, customers);
        this.context = context;
        this.customers = customers;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        Customer customer = customers.get(position);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.customer_row, parent, false);

        TextView tvFirstname = (TextView)rowView.findViewById(R.id.tv_firstname);
        TextView tvLastname = (TextView)rowView.findViewById(R.id.tv_lastname);
        ImageView ivImage = (ImageView)rowView.findViewById(R.id.iv_image);

        tvFirstname.setText(customer.getFirstname());
        tvLastname.setText(customer.getLastname());
        ivImage.setImageResource(customer.getDrawable());

        return rowView;
    }
}