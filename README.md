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






```java
```
