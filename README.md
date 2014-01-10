Android_custom_list
===================

A simple list (no UI eye-candy...) based on a custom domain object (for example Customer) rendering all domain object properties...

![ScreenShot](images/preview_s3_500.png)

## Quick introduction

Creating a default Android list based on a String[] is pretty straightforward - but as soon as it comes to the point of rendering "sophisticated" data (for example domain objects ;)) you start googling around, scrolling through stackoverflow threads and finally ending up with something that works but having several lines in your porject you do not dare to touch as you dont wanna break your whole running project.

You could head as well for the Android Studio Template based list component (new -> list fragment) but this results in messing up your project structure as Android Studio will start generating much more than you require in order to render a simple list of domain objects. If anyone from Google developing for the Android Studio project should come across this post: pleeeeeeeease smarten up your whole template generation stuff!!!! Currently it's simply non usable...

## Getting started...

### Domain object and corresponding service

Ok, let's finish Android Studio bashing and let's develop a nice list displayin several Simpsons characters (all images/sources etc. have been pushed to this repository).

We start with some basic stuff, somehwere in your project you should create a domain object which you aim to render and a service providing several domain objects:

```java
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
    
    ...
    ..
    .
}
```

And a very simple Java service providing some domain objects (in this case generated statically, no DB involved):

```java
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
        
        ...
        
        return customers;
    }
}
```

Ok, that's all we assume to be somewhere in your Android project, we usually create a service/data folder for this stuff, please see our dummy project structure within the screenshot below - feel free to adapt this structure or use an arbitrary structure chsoing on your own.

![Project Structure](images/structure.png)

```java
```


```java
```


```java
```
