# cs101f2020-lab04-starter

## DUE: October 15 by 3pm

[![Actions Status](../../workflows/build/badge.svg)](../../actions)

## Table of Contents

- [Objectives](#objectives)
- [Introduction](#introduction)
- [Continuous Learning](#continuous-learning)
- [System Commands](#system-commands)

  - [Using Docker](#using-docker)
  - [Using Gradle](#using-gradle)

- [Program Requirements](#program-requirements)

- [Expected Program Output](#expected-program-output)

- [Automated Checks with GatorGrader](#automated-checks-with-gatorgrader)

- [Using GitHub Actions CI](#using-github-actions-ci)

- [System Requirements](#system-requirements)

- [Reporting Problems](#reporting-problems)

- [Receiving Assistance](#receiving-assistance)

- [Project Assessment](#project-assessment)

- [Optional Bonus Challenge](#optional-bonus-challenge)

## Objectives

To continue to practice using GitHub to access the files for an assignment.<br>
You will complete a programming project using source code provided in the textbook, ultimately implementing and testing a complete solution for the sorting arrays containing two primitive types. You will also continue to learn how to implement and test a Java program and to write a Markdown file, practicing how to use an automated grading tool to assess your progress towards<br>
completing the project.Finally, you will practice using Docker containers to run programs like Gradle and GatorGrader.

## Introduction

Designed for use with [GitHub Classroom](https://classroom.github.com/) and [GatorGrader](https://github.com/GatorEducator/gatorgrader/), this repository contains the starter files for the fourth laboratory assignment in an introductory computer science class, Data Abstraction, that uses the Java programming language. The GitHub Actions CI builds for this repository will pass, as evidenced by a green ✔ instead of a red ✗ appearing in the commit logs.

This assignment requires a programmer to implement and test a Java program, called `InsertionSort`, that will produce four lines of output. More details about the source code needed for this program are also provided in the discussion of array sorting in Section 3.1.2 of the textbook. Please note that this program will also require you to read and modify another Java class that contains a test suite. The programmer is also responsible for learning how to run a test suite written in the JUnit testing framework, as explained in Section 1.9\. As verified by [Checkstyle](https://github.com/checkstyle/checkstyle), the source code for all Java files must adhere to all of the requirements in the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The programmer completing this assignment is also responsible for writing a multiple-paragraph reflection, stored in the file `writing/reflection.md`, that explains the challenges that you faced and the solutions you developed. This is a Markdown file that should adhere to the standards described in the [Markdown Syntax Guide](https://guides.github.com/features/mastering-markdown/). Remember, an individual completing this assignment can preview the contents of a comitted Markdown file by clicking on the name of the file in your GitHub repository. Don't forget that your `writing/reflection.md` file should adhere to the Markdown standards established by the [Markdown linting tool](https://github.com/markdownlint/markdownlint).

The source code in the `InsertionSort.java` file must also pass additional tests set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader). For instance, GatorGrader will check to ensure that `InsertionSort` produces exactly four lines of output and that you correctly perform the sort of the array. When you use the `git commit` command to transfer your source code to your GitHub repository, [GitHub Actions CI](https://docs.github.com/en/actions) will initialize a build of your assignment, checking to see if it meets all of the requirements. If both your source code and writing meet all of the established requirements, then you will see a green ✔ in the listing of commits in GitHub. If your submission does not meet the requirements, a red ✗ will appear instead. Please note that, at the option of the course instructor, some checks may be run in GitHub Actions CI that are not run locally by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader). Finally, the instructor will reduce a programmer's grade for this assignment if the red ✗ appears on the last commit in GitHub immediately before the assignment's due date.

## Continuous Learning

If you have not done so already, please read all of the relevant [GitHub Guides](https://guides.github.com/) that explain how to use many of the features that GitHub provides. In particular, please make sure that you have read the following GitHub guides: [Mastering Markdown](https://guides.github.com/features/mastering-markdown/), [Hello World](https://guides.github.com/activities/hello-world/), and [Documenting Your Projects on GitHub](https://guides.github.com/features/wikis/). Each of these guides will help you to understand how to use both [GitHub](http://github.com) and [GitHub Classroom](https://classroom.github.com/).

Students who want to learn more about how to use [Docker](https://www.docker.com) should review the [Docker Documentation](https://docs.docker.com/). Students are also encouraged to review the documentation for their text editor, which is available for text editors like [Atom](https://atom.io/docs) and [VS Code](https://code.visualstudio.com/docs). You should also review the [Git documentation](https://git-scm.com/doc) to learn more about how to use the Git command-line client. In addition to talking with the instructor and technical leader for your course, students are encouraged to search [StackOverflow](https://stackoverflow.com/) for answers to their technical questions.

To do well on this assignment, you should also review Chapter 3 of the course textbook, paying close attention to Sections 3.1 and 3.6 and the source code on page 111\. Please see the course instructor or one of the student technical leaders if you have questions about any of these reading assignments.

## System Commands

This project invites students to enter system commands into a terminal window. This assignment uses [Docker](https://www.docker.com) to deliver programs, such as `gradle` and the source code and packages needed to run [GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students' computer, thereby eliminating the need for a programmer to install them on their development workstation.

### Using Docker

Once you have installed [Docker Desktop](https://www.docker.com/products/docker-desktop), you can use the following `docker run` command to start `gradle grade` as a containerized application, using the [DockaGator](https://github.com/GatorEducator/dockagator) Docker image available on [DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current directory) as the project directory and `"$HOME/.dockagator"` as the cached GatorGrader directory. Please note that both of these directories must exist, although only the project directory must contain something. Generally, the project directory should contain the source code and technical writing of this assignment, as provided to a student through GitHub. Additionally, the cache directory should not contain anything other than directories and programs created by DockaGator, thus ensuring that they are not otherwise overwritten during the completion of the assignment. To ensure that the previous command will work correctly, you should create the cache directory by running the command `mkdir $HOME/.dockagator`.

If you are running your program on a Windows Operating System, you should run the following command instead, replacing the word "user" with the username of your machine:

```bash
docker run --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator
```

Here are some additional commands that you may need to run when using Docker:

- `docker info`: display information about how Docker runs on your workstation
- `docker images`: show the Docker images installed on your workstation
- `docker container list`: list the active images running on your workstation
- `docker system prune`: remove many types of "dangling" components from your workstation
- `docker image prune`: remove all "dangling" docker images from your workstation
- `docker container prune`: remove all stopped docker containers from your workstation
- `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

Since the above `docker run` command uses a Docker image that, by default, runs `gradle grade` and then exits the Docker container, you may want to instead run the following command so that you enter an "interactive terminal" that will allow you to repeatedly run commands within the Docker container.

In Linux and Mac OS:

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

In Windows OS (replace `user` with your machine's username):

```bash
docker run -it --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by typing the command `gradle grade` in your terminal. Running this command will produce a lot of output that you should carefully inspect. If GatorGrader's output shows that there are no mistakes in the assignment, then your source code and writing are passing all of the automated baseline checks. However, if the output indicates that there are mistakes, then you will need to understand what they are and then try to fix them.

You can also complete several important Java programming tasks by using the `gradle` tool. For instance, you can compile (i.e., create bytecode from the program's source code if it is correct) the program using the command `gradle build`. Here are some other commands that you can type:

- `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle run`: run the Java program in the command-line
- `gradle cleanTest`: clean the JUnit test suite of derived files
- `gradle test`: run the JUnit test suite and display the results
- `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base") directory for this assignment where the `build.gradle` file is located.

## Program Requirements

Please use a text editor to study the source code of the `InsertionSort` class, noticing that some of its methods are incomplete. Now, if you want to "build" your program you can type the command `gradle build` in your terminal, thereby causing the Java compiler to check your program for errors and get it ready to run. Ultimately, you will need to implement source code in both of the Java files wherever you see the "TODO" label. For instance, the `TestInsertionSort` requires you to implement two `isSorted` "helper" methods that determine if an array is sorted.

Next, you must implement an `InsertionSort.sort` method that follows the outline in CodeFragment 3.6 to sort an array of either type `int[]` or `char[]``. It is important to note that these methods should use the`System.arraycopy` method to construct a "shallow copy" of the array that is input to the sort method. Please refer to Section 3.6 and the referenced JavaDoc documentation to learn more about how this method works. Make sure that you understand how the use of a "shallow copy" would influence arrays containing either primitives or references in a different fashion! As you complete this laboratory assignment, your goal is to proceed incrementally, adding the required code and then checking to see if an additional test case passes. Once a new Java method is working, please make sure that you commit the code to your repository with a descriptive message.

Once the program runs and the tests pass, please reflect on this process. What step did you find to be the most challenging? Why? You should write your reflections in a file, called `writing/reflection.md`, that uses the Markdown writing language. You can learn more about Markdown by viewing the aforementioned GitHub guide. To complete this aspect of the assignment, you should write one high-quality paragraph that reports on your experiences. Your `writing/reflection.md` file should also contain answers to other questions about `InsertionSort`'s implementation and testing. For instance, can you explain how the `src/test/java/labfour/TestInsertionSort.java` uses the `isSortedmethod`? Can you also explain why the some of the tests in the JUnit suite use a `for` loop? Finally, can you say what characters and numbers are stored in the arrays used for testing?

## Expected Program Output

Typing the command `gradle run` in the terminal window should produce the following output for the completed version of `SentenceReverser`. As long as your program adheres to all of the requirements for the assignment and passes all of the verification checks, your version should produce similar output. With that said, program output may vary according to, for instance, the name of the programmer and the date on which you ran the program.

```
> Configure project :
Configured GatorGradle 0.4.4

> Task :run
Before: [C, E, B, D, A, I, J, L, K, H, G, F]
After : [A, B, C, D, E, F, G, H, I, J, K, L]
Before: [1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0]
After : [-10, 0, 1, 2, 3, 4, 4, 7, 8, 9, 10, 20]

BUILD SUCCESSFUL in 844ms
2 actionable tasks: 1 executed, 1 up-to-date
```

Running the command `gradle -q --console plain run` will suppress the display of Gradle's diagnostic information and produce output like the following.

```
Before: [C, E, B, D, A, I, J, L, K, H, G, F]
After : [A, B, C, D, E, F, G, H, I, J, K, L]
Before: [1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0]
After : [-10, 0, 1, 2, 3, 4, 4, 7, 8, 9, 10, 20]
```

## Automated Checks with GatorGrader

In addition to meeting all of the requirements outlined in the assignment sheet, your submission must pass the following checks that [GatorGrader](https://github.com/GatorEducator/gatorgrader) automatically assesses:

- Repository has at least 10 commit(s)
- The InsertionSort.java in src/main/java/labfour has at least 3 single-line Java comment(s)
- The InsertionSort.java in src/main/java/labfour has at least 4 of the `java.util.Arrays.toString` fragment
- The InsertionSort.java in src/main/java/labfour has at least 4 of the `println(` fragment
- The InsertionSort.java in src/main/java/labfour has exactly 0 of the `Add Your Name Here` fragment
- The InsertionSort.java in src/main/java/labfour has exactly 0 of the `TODO` fragment
- The InsertionSort.java in src/main/java/labfour has exactly 1 of the `package labfour` fragment
- The InsertionSort.java in src/main/java/labfour has exactly 4 multiple-line Java comment(s)
- The InsertionSort.java in src/main/java/labfour has exactly 4 of the `System.arraycopy` fragment
- The TestInsertionSort.java in src/test/java/labfour has at least 12 of the `@Test` fragment
- The TestInsertionSort.java in src/test/java/labfour has at least 9 multiple-line Java comment(s)
- The TestInsertionSort.java in src/test/java/labfour has exactly 0 of the `Add Your Name Here` fragment
- The TestInsertionSort.java in src/test/java/labfour has exactly 0 of the `TODO` fragment
- The TestInsertionSort.java in src/test/java/labfour has exactly 1 of the `package labfour` fragment
- The command `gradle -q --console plain run` executes correctly
- The command `gradle build` executes correctly
- The command `gradle test` executes correctlylete!
- The command output has exactly 2 of the `After` fragment
- The command output has exactly 2 of the `Before` fragment
- The command output has exactly 4 lines
- The file InsertionSort.java exists in the src/main/java/labfour directory
- The file TestInsertionSort.java exists in the src/test/java/labfour directory
- The file reflection.md exists in the writing directory
- The reflection.md in writing has at least 2 of the `code` tag
- The reflection.md in writing has at least 5 paragraph(s)
- The reflection.md in writing has at least 500 word(s) in total
- The reflection.md in writing has at least 8 of the `heading` tag
- The reflection.md in writing has exactly 0 of the `Add Your Name Here` fragment
- The reflection.md in writing has exactly 1 of the `list` tag
- The reflection.md in writing has exactly 2 of the `code_block` tag

If [GatorGrader's](https://github.com/GatorEducator/gatorgrader) automated checks pass correctly, the tool will produce the output like the following in addition to returning a zero exit code (which you can access by typing the command `echo $?`).

```
        ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
        ┃ Passed 30/30 (100%) of checks for cs101f2020-lab04! ┃
        ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
```

## Using Travis CI

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run [GatorGrader](https://github.com/GatorEducator/gatorgrader) and additional checking programs every time you commit to your GitHub repository. The checking will start as soon as you have accepted the assignment -- thus creating your own private repository -- and the course instructor and/or GitHub enables Travis for it. If you are using Travis for the first time, you will need to authorize Travis CI to access the private repositories that you created on GitHub. If you do not see either a yellow ● or a green ✔ or a red ✗ in your listing of commits, then please ask the instructor to see whether or not Travis CI was correctly enabled.

## Reporting Problems

If you have found a problem with this assignment's provided source code or documentation, then you can go to the [Computer Science 101 Fall 2020 Lab 04](https://github.com/Allegheny-Computer-Science-101-f2020/lab04-starter) repository and [raise an issue](https://github.com/Allegheny-Computer-Science-101f2020/lab04-starter/issues). If you have found a problem with the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks your assignment, then you can also [raise an issue](https://github.com/GatorEducator/gatorgrader/issues) in that repository. To ensure that your issue is properly resolved, please provide as many details as is possible about the problem that you experienced. If you discover a problem with the assignment sheet for this project, then please raise an issue in the GitHub repository that provides the assignment sheets for your course.

Whenever possible, individuals who find, and use the appropriate GitHub issue tracker to correctly document, a mistake in any aspect of this assignment will receive free [GitHub stickers](https://octodex.github.com/) and extra credit towards their grade for the project.

## Receiving Assistance

If you are having trouble completing any part of this project, then please talk with either the course instructor or a student technical leader during the course session. Alternatively, you may ask questions in the Slack workspace for this course. Finally, you can schedule a meeting during the course instructor's office hours.

## Lab Assessment

The grade that a student receives on this assignment will have the following components:

- **Percentage of Correct GatorGrader Checks [up to 70% of the lab grade]**: Students are encouraged to repeatedly try to implement a Java program that passes all of GatorGrader's checks by, for instance, creating a program that produces the correct output. Students should also repeatedly revise their technical writing to ensure that it also passes all of GatorGrader's checks about, for instance, the length of its content and its appropriate use of Markdown.

- **GitHub Actions CI Build Status [up to 10% of the lab grade]**: Since additional checks on the source code and/or technical writing may be encoded in GitHub Actions CI's actions and, moreover, all of the GatorGrader checks are also run in GitHub Actions CI, students will receive a checkmark grade if their last before-the-deadline build passes and a green ✔ appears in their GitHub commit log instead of a red ✗. As with the previous grading component, students are encouraged to repeatedly revise their source code and technical writing in an attempt to get their GitHub Actions CI build to pass.

- **Mastery of Technical Writing [up to 10% of the lab grade]**: Students will also receive a portion of their grade when the responses to the technical writing questions presented in the `writing/reflection.md` reveal a mastery of both writing skills and technical knowledge. To receive a checkmark grade, the submitted writing should have correct spelling, grammar, and punctuation in addition to following the rules of Markdown and providing technically accurate answers. Students are encouraged to ask the course instructor or a student technical leader to use the GitHub issue tracker to provide feedback on their mastery of technical writing skills.

- **Mastery of Technical Knowledge and Skills [up to 10% of the lab grade]**: Students will receive a part of their grade when their GitHub repository reveals that they have mastered all of the technical knowledge and skills developed during the completion of this project. As a part of this grade, the instructor will assess aspects of the project including, but not limited to, the use of effective source code comments and Git commit messages. Students are encouraged to ask the course instructor or a student technical leader to use the GitHub issue tracker to provide feedback on how well their work demonstrates mastery of the assignment's technical knowledge and skills.

All grades for the assignments in this course will be reported through Canvas. Feedback on lab assignments will be provided through a student's GitHub repository using the comment in the "Feedback" pull request.

## Optional Bonus Challenge

Apply your sorting solution to an array of Strings. Add JUnit test cases to check the correctness of sorting for the String objects.
