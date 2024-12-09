

/*
Objectives for Today

By the end of today, you will:
   * Understand how Version Control Systems allow us to save "checkpoints" as we work through writing code.
   * Define common terms associated with version control.
   * Identify ways to interact with the VCS "git" from the command line and through the IDE.
 */



 /*
 Vocabulary for the Day

 Version Control System - A Version Control System (VCS) is a piece of software that is able to keep track of a history
 of changes. VCS software comes in two major variants: centralized version control, which keeps track of a linear
 history on a single server, and distributed version control, which keeps track of separate timelines each place the
 software is duplicated.

 Commit - The smallest unit of change in a VCS is called a "commit". A commit is stored as a list of differences between
 a previous version and the new current version, along with metadata about who made a change and when.

 Repository - A repository is the name for an entire commit history related to a particular software project.

 Branch - A series of commits that form a linear timeline is called a 'branch'. All branches of the same repository
 share a single common ancestor.

*/


public class VCS {


    public static void main(String[] args) {



      /*
      As we write code, we often find situations where we are afraid to make a change because we're not entirely sure
      of its effects.


     Often, this ends up incentivizing us to create many copies of our code, or many copies of entire files with
     version information in the filename.
      */


    /*
    Instead of keeping our old copies of the code in the file, we can use a "version control system" to track all
    our changes over time.

    This version control software lets us save 'checkpoints' in the code called commits, and at any point we're
    able to compare different checkpoints or restore a previous point in our history.

    There are many different VCS products out there, but we are going to use one of the most popular, called 'git'.

    We have two ways to interact with git:
       - We can use the command line interface
       - We can use a GUI tool, either in our IDE or standalone.

  To create a new repository for our code, the first thing we need to do is initialize a repository in our current
  folder. If we're in a command prompt, we can do this by typing the words:

           git init



    */

    }

}