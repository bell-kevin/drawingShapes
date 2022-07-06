# drawing Shapes
This project does not require a class, because we aren’t going to instantiate any objects. It uses class methods, specifically the main method plus a few more. Create a project named “Ch7Draw”. You will add class methods above the main method. Remember that class methods need the keyword “static” in the heading.  

To draw a bar of asterisks across a line, we will use a method named “drawBar”. It needs to know how many times an asterisk should appear on the line, so it needs an integer parameter. In your project, create a class method named “drawBar”.

This method uses a FOR loop to print a single asterisk character repeatedly, the number of times passed in to the method. After the loop completes, the System.out.println() command ends the line and positions the cursor at the left edge of the next line on the screen.  

The main method tests this drawBar method. 

Here, there is another FOR loop that calls the drawBar() method with different values for the argument. The first time, the index is 1, so drawBar(1) prints a single asterisk on the line. The second time through the loop, the index is 2, so drawBar(2) prints two asterisks on the line. This continues for 6 lines, because that was hard-coded into the For loop.  

Run the project to make sure it works so far. 

Now, modify the program to be able to draw a box. That requires 2 values, length across the line (width) and number of lines (height). Create a class method named “drawBox” that accepts those 2 parameters. We already have a method that can draw a line across the page, to the width specified. We need to repeat that action for the number of lines or height specified, so the drawBox method will need to call the drawBar method multiple times. 

Now that the basic project exists, you need to modify it to ask the user how big a box to draw, and also to ask if they want the default marker (asterisk or *) or if they want to specify the marker.  

Create another drawBar method that adds a parameter for the marker, and another drawBox method that adds a parameter for the marker. This overloads both methods. In the main method, after the code already written to test the drawing methods, ask the user for the dimensions of the box, then ask if they want the default marker or if they want to specify the marker. Use Y or N for the answer, but allow the user to type it in upper or lower case. Then call the method that will draw such a box, with the default marker (the code you already have) or one with a new specific marker (the new methods that overloaded the previous methods). 

Note that if the user said to use the default marker, the code should call the existing method that displays the box with asterisks – no change from the previous version of the code. If the user said to use a specific marker, the code should call the overloaded versions of the methods that have that specified marker passed in as one of the parameters.  

Run the program -- you may use any width and height values you choose, and any character to draw the box. Take a screenshot of the results.  

Next, modify the project so that it does not draw the right triangle or the box with the hard-coded measurements. Now, the project should ask the user if it should draw a box, and if the answer is yes, ask for the needed parameters and draw that box. Repeat, so that the project can draw more than one box, until the user says to stop. 

Run your program and test the Y and N responses to both questions, as you see above, using whatever box measurements you wish. Be sure to request a box with the default marker and another box with a specific marker. Take a screenshot of the results.     

Submission: the specified screenshots, and the root folder for the project     

Pay careful attention to the rubric for this assignment. Remember the standards that apply to every project.  

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
