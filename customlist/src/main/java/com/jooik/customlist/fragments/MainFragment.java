package com.jooik.customlist.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jooik.customlist.R;
import com.jooik.customlist.data.Customer;
import com.jooik.customlist.data.CustomerService;
import com.jooik.customlist.list.CustomerListAdapter;

import java.util.List;

/**
 * MainFragment adapter...
 */
public class MainFragment extends Fragment
{
    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------

    private View view;
    private CustomerService customerService = new CustomerService();

    // ------------------------------------------------------------------------
    // constructors
    // ------------------------------------------------------------------------

    public MainFragment()
    {
        // Required empty public constructor
    }

    // ------------------------------------------------------------------------
    // fragment/user interaction
    // ------------------------------------------------------------------------

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);

        // fetch customers...
        List<Customer> allCustomers = customerService.findAllCustomers();

        CustomerListAdapter cla = new CustomerListAdapter(inflater.getContext(),
                R.layout.customer_row,
                allCustomers);

        // fetch UI container and mixin contents...
        ListView lvCustomers = (ListView)view.findViewById(R.id.lv_customers);
        lvCustomers.setAdapter(cla);

        return view;
    }
}
