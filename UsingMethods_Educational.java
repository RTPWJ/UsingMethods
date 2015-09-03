/*
Name: Alexander Georgiadis (RezTech)
Date Started: 5/5/2015
Date Last Edited: 9/2/2015
Description: A small example of using methods with no returns, with a bit of a Christmas style
*/

import java.awt.*;
import hsa.Console;

public class UsingMethods_Educational
{
    static Console c; //Console
    static int runTime = 0; //Counter variable, declaired as an static int so it can be used in any method
    
    //Main Method  
    public static void main (String[] args)
    {
        c = new Console ();
        c.println ("We Wish You a Merry Christmas Lyrics:\n"); 

        //Begining Part
        merryChristmas ();
        happyNewYear ();
        ending ();

        //Seccond Part
        c.println (); //Print a line between each paragraph
        figgyPudding ();
        ending ();

        //Third Part
        c.println ();
        wontLeave ();
        bringIt ();
        ending ();

        //Forth Part
        c.println ();
        likeIt ();
        ending ();

        //Ending Part
        c.println ();
        merryChristmas ();
        happyNewYear (); //Only time it is repeated twice, so just call the method twice
        happyNewYear ();
        ending ();
    }

    //Merry Christmas Method
    public static void merryChristmas ()
    {
        while (runTime < 3) //Dam these save space xD
        {
            c.println ("We wish you a merry Christmas!");
            runTime++;
        }
        runTime = 0; //Reset it each time
    }

    //Happy New Year Method
    public static void happyNewYear ()
    {
        c.println ("And a happy New Year!");
    }

    //Ending Method (Ending of each paragrah)
    public static void ending () //Might as well put all three lines in it, they are always in this order
    {
        c.println ("Good tidings we bring for you and your kin;");
        c.println ("We wish you a merry Christmas");
        c.println ("And a Happy New Year!");

    }

    //Yay! Figgy Pudding Method
    public static void figgyPudding ()
    {
        while (runTime < 3)
        {
            c.println ("Now bring us some figgy pudding,");
            runTime++;
        }
        runTime = 0;
    }

    //Won't Leave Method
    public static void wontLeave ()
    {
        while (runTime < 3)
        {
            c.println ("We won't go until we get some");
            runTime++;
        }
        runTime = 0;
    }

    //Bring It Method
    public static void bringIt ()
    {
        c.println ("So bring it out here!");
    }

    //Like It Method
    public static void likeIt ()
    {
        while (runTime < 3)
        {
            c.println ("We all like our figgy pudding,");
            runTime++;
        }
        runTime = 0;
    }

    //Good Cheer Method
    public static void goodCheer ()
    {
        c.println ("With all its good cheer.");
    }
}
