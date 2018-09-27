Lab Tasks
=========

You can use the AUCA server for this work through SSH at `auca.space`. The login
has the format `<last name>_<first letter of the first name>`.

## Lab #0, Introduction to the Development Environment

1. Connect to `auca.space`.
2. Create a directory for this course.
3. Name the directory `networks`.
4. Rename the directory to `iuca-networks`.
5. Move into the directory.
6. Create a `Readme.txt`.
7. Modify the file. Write the full name of the course and save the file.
8. Create `Lab00.java` (it should be just a plain 'hello, world' program).
9. Compile the program.
10. Run the program.
11. Delete the class file.

## Lab #1, EchoService

Create the classical 'hello, world' networking service in Java. The service consists of two programs. The client program can get user
input and send it to the server. The server can receive the text and repeat it by sending it back.

## Lab #2, Extend the EchoService

1. Move the server to `auca.space`
   and show that you can send
   and receive messages from the
   client located on the local lab
   machine.

2. Create a duplicated project dir. Name it
   `TimeService`. Modify the server to send
   date and time info on every connection.

3. Create a duplicated project dir of the
   `EchoService`. Name it `Chat`. Modify
   the server and the client to send and
   receive messages to one another.

3. Create a duplicated project dir of the
   `EchoService`. Modify the server to
   accept multiple clients. Use the official
   Sockets tutorial from Oracle to do that.

## Lab #3, Intro to Packet Tracer

1. Download Packet Tracer, create a Cisco account, and log in.

2. Create a simple network from two computers. Study the Packet Tracer UI.

3. Add a server. Try to connect both the machines to the server.

4. Use a switch to connect all the machines together. Configure the machines
   and use the `ping` utility to check connections on all nodes.

5. Try to replace the switch with a hub. Analyze the network.

6. Return back using the switch. Setup the server to assign ip addresses automatically.

7. Add another network of machines. Try to connect it to the current network.

### Documentation for Helpfull Unix Tools

    man ls
    man pwd
    man touch
    man nano
    man cp
    man mv
    man rm
    man scp
    man ping
    man tracepath

### Links

* [Oracle, All about Sockets in Java](https://docs.oracle.com/javase/tutorial/networking/sockets/index.html)
* [Unix Environment](https://drive.google.com/open?id=0B85z_dQxOMgLNDN3QTFrSmYxZm8)

### Books

* _Introduction to Java Programming, Comprehensive, 10th Edition by Y. Daniel Liang_
