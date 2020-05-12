package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        int n1=size*2;
        mOut.print("+");
        for(int i=0;i<n1;i++)
            mOut.print("-");
        mOut.println("+");
        int n2=size;
        int n3=size-1;
        int j=0,c=0;
        while(n2>0)
        {mOut.print("|");
            if(n2==1)
            {
                mOut.print("<");
                for(int i=0;i<j;i++) {
                    if(c%2==1)
                        mOut.print("-");
                    else
                        mOut.print("=");
                }
                mOut.print(">");
            }
            else
            {
                for(int i=0;i<n3;i++)
                    mOut.print(" ");
                mOut.print("/");
                for(int i=0;i<j;i++) {
                    if(c%2==0)
                        mOut.print("=");
                    else
                        mOut.print("-");
                }

                mOut.print("\\");
                for(int i=0;i<n3;i++)
                    mOut.print(" ");
            }
            n3--;
            j+=2;
            c++;
            n2--;
            mOut.println("|");

        }
        n2=size-1;
        n3=1;
        c=c-1;
        j=j-4;
        while(n2>0)
        {mOut.print("|");
            for(int i=0;i<n3;i++)
                mOut.print(" ");
            mOut.print("\\");
            for(int i=0;i<j;i++)
            {
                if(c%2==1)
                    mOut.print("=");
                else
                    mOut.print("-");
            }
            mOut.print("/");
            for(int i=0;i<n3;i++)
                mOut.print(" ");
            mOut.println("|");
            j-=2;
            c++;


            n2--;
            n3++;
        }

        mOut.print("+");
        for(int i=0;i<n1;i++)
            mOut.print("-");
        mOut.print("+");


    }


}
