

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

  However, by default, the git repo won't save anything. The git repository creates a 'stage' with all the files
  that exist in this folder. This stage has information about which aren't tracked yet at all, which are tracked
  and have been changed, and which will be added/removed. We can always view the current status of the stage with
  the 'git status' command.


        If we want to save a file, we have to do two steps:
           - Add the file to the list of things from our stage that we want to commit.
           - Perform the actual commit.



    There are a few different ways to add the file. We can either use 'git add <file>' in the terminal, right click
    the file and select add, or go directly to the commit dialog and check all the checkboxes for the files we want
    to commit.

    Then, we can commit, either by typing 'git commit -m "<message>"', or by going to the Git menu and selecting the
    "Commit" option. In the commit dialog, we're able to write a helpful descriptive message of the changes we made.
      */



               /*

              Now, let's go take a look at our stage again.
              We can see that our VCS.java file appears in the list of unstaged changes. Let's take a look at what the file
              looks like when we view it.
              Our file is showing us line by line what changed in the file:
                 - Green lines are the 'new' version of the code.
                 - Grey are the 'old' version of the code.
                 - Red are lines REMOVED in the 'new' version.
            
                 
        In addition to viewing this in IntelliJ, we can view the same thing using the 'git diff' command.
        To save the changes and my second version of the command, I can just create a second commit.

        Now, let's go look at our log again.

        In the log, we can see that both changes are listed.
        If we right click on the files on the right of the panel, we can compare the version from any commit to the
        current version of the file. (we can also do this with git diff -c <commit_id>.)

                 */


              /*

        If we want to 'rewind' time, we are able to do that by 'checking out' to reload an earlier one of our save
        point commits. We can do this by right clicking the commit we want in the log, or performing 'git checkout <id>'.

        Before we do that, we should make sure we save everything we're working on right now to a commit!

        Once I checkout, I should also create a branch at that point and checkout that branch using the 'git branch <branch_name>' command.

        You can also list branches just by typing 'git branch' alone.


        Braches make it really easy to 'experiment' with different solutions, and test out which one is the best/preferred without losing
        all the other changes that you had made before.
        */



                 /*
                  
        What if we wanted to get the best of both worlds, and have all the changes from both branches of the history?
        We can do that with one final command for today: git merge. Git merging lets us take two different branches, and
        squash their changes together.
 

        Before we do that, we should make sure we save everything we're working on right now to a commit!

        Once I checkout, I should also create a branch at that point and checkout that branch using the 'git branch <branch_name>' command.

        You can also list branches just by typing 'git branch' alone.

        What if we wanted to get the best of both worlds, and have all the changes from both branches of the history?
        We can do that with one final command for today: git merge. Git merging lets us take two different branches, and
        squash their changes together.

        We can do this on the command line by switching to the branch that should "receive" the changes, and then using
        'git merge <other_branch>'.

        The panes on the left and right show us both timelines, and the middle shows the final result.
        Sometimes, you might have to make touch ups here when git can't figure out which copy of the code you want to
        use. However, everything looks good for us, so we're ready to commit!

        Git is an invaluable tool for helping us keep track of the way our code has changed over time. We can even use
        branches to carry out different 'experiments' on our code, and only keep those that work out!

        Next class, we'll see how git also has useful features for letting multiple people work together.
          */


    }

}