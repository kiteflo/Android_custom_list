package com.jooik.customlist.data;

/**
 * Customer domain representataion...
 */
public class Customer
{
    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------

    private String firstname;
    private String lastname;
    private String imagepath;
    private String description;
    private int drawable;

    // ------------------------------------------------------------------------
    // constructors
    // ------------------------------------------------------------------------

    public Customer(String firstname, String lastname, String imagepath,
                    String description,int drawable)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.imagepath = imagepath;
        this.description = description;
        this.drawable = drawable;
    }

    // ------------------------------------------------------------------------
    // GETTER & SETTER
    // ------------------------------------------------------------------------

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public int getDrawable()
    {
        return drawable;
    }

    public void setDrawable(int drawable)
    {
        this.drawable = drawable;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getImagepath()
    {
        return imagepath;
    }

    public void setImagepath(String imagepath)
    {
        this.imagepath = imagepath;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
