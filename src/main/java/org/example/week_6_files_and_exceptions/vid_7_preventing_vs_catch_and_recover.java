/* Prevention is (usually) better than cure (slide 51)

It's usually better to prevent exceptions
Exception handling is slow - typically slower than checking for the issue

****When these method are called with a null string, the code on the left (just below), with the try-catch,

public static int countCharacters (String str) {
    try {
        return str.length();
    } catch (NullPointerException npe) {
        return 0;
    }
}

*****is about 40 times slower than code on the right (just below):

public static int countCharacters (String str) {
    if(str == null) {
        return 0;
    }
    return str.length();
}

But, when called with a non-null string, the code on the left is 30% faster than the code on
    the right because no str==null check is made.

TimingExceptions.java in the example repo

***Prevention vs Cure
(slide 52):

-Generally, it's advised to write code that checks for possible error conditions to avoid causing exceptions
-However, consider a scenario where the check is relatively slow, and exceptions are relatively unlikely -
    what's the best approach now?
-Clarity of code is also important

Also remember there are cases where you don't have control over everything, e.g. reading from a file and what
    if the file has been moved? You need exception handling in these cases

 */

package org.example.week_6_files_and_exceptions;

public class vid_7_preventing_vs_catch_and_recover {
}
