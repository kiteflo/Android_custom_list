package com.jooik.customlist.data;

import com.jooik.customlist.R;

import java.util.ArrayList;
import java.util.List;

/**
 * DummyCustomer service returning a list of simpsons characters...
 */
public class CustomerService
{
    public List<Customer> findAllCustomers()
    {
        List<Customer> customers = new ArrayList<Customer>();

        // Bart Simpson
        Customer customer = new Customer("Bart","Simpson",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/bart.png",
                "Eldest child of Homer and Marge; brother of Lisa and Maggie.",
                R.drawable.bart_transparent);
        customers.add(customer);

        // Chief Clancy Wiggum
        customer = new Customer("Clancy","Wiggum",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/chief_clancy_wiggum.png",
                "Springfield Chief of Police.",
                R.drawable.chief_clancy_wiggum_transparent);
        customers.add(customer);

        // Homer Simpson
        customer = new Customer("Homer","Simpson",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/homer.png",
                "Husband of Marge; father of Bart, Lisa, and Maggie.",
                R.drawable.homer_transparent);
        customers.add(customer);

        // Krusty
        customer = new Customer("Krusty","the Clown",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/krusty.png",
                "TV show clown host, original name Herschel Shmoikel Pinchas Yerucham Krustofski",
                R.drawable.krusty_transparent);
        customers.add(customer);

        // Lisa Simpson
        customer = new Customer("Lisa","Simpson",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/lisa.png",
                "Middle child and oldest daughter of Homer and Marge; sister of Bart and Maggie.",
                R.drawable.lisa_transparent);
        customers.add(customer);

        // Maggie Simpson
        customer = new Customer("Maggie","Simpson",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/maggie.png",
                "Youngest child (the baby) and daughter of Homer and Marge; sister of Bart and Lisa.",
                R.drawable.maggie_transparent);
        customers.add(customer);

        // Marge Simpson
        customer = new Customer("Marge","Simpson",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/marge.png",
                "Wife of Homer; mother of Bart, Lisa, and Maggie.",
                R.drawable.march_transparent);
        customers.add(customer);

        // Patty Bouvier
        customer = new Customer("Patty","Bouvier",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/patty_bouvier.png",
                "Twin sister of Selma and older sister of Marge.",
                R.drawable.patty_bouvier_transparent);
        customers.add(customer);

        // Ralph Wiggum
        customer = new Customer("Ralph","Wiggum",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/ralph_wiggum.png",
                "Son of Police Chief Clancy Wiggum.",
                R.drawable.ralph_wiggum_transparent);
        customers.add(customer);

        // Snowball
        customer = new Customer("Snowball",null,
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/snowball.png",
                "The Simpson family's pet cats.",
                R.drawable.snowball_transparent);
        customers.add(customer);

        // TIngeltangel Bob
        customer = new Customer("Tingeltangel","Bob",
                "https://dl.dropboxusercontent.com/u/33720504/github/Android_custom_list/simpsons/tingeltangel_bob.png",
                "Criminal mastermind and Krusty the Clown Show ex-operator and sidekick.",
                R.drawable.tingeltangel_bob_transparent);
        customers.add(customer);

        return customers;
    }
}
