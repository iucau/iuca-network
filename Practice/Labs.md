Lab Tasks
=========

You can use the AUCA server for this work through SSH at 'auca.space'. The login
has the format `<last name>_<first letter of the first name>`.

## Lab #1, EchoService

Create a classical 'hello, world' networking service in Java. The service consists from two programs. The client program can get user
input and send it to the server. The server can recive the text and repeat it by sending it back.

## Lab #2, Extend the EchoService

1. Move the server to `auca.space`
   and show that you can send
   and receive message from the
   client located on the local lab
   machine.

2. Create a duplicated project dir. Name it
   `TimeService`. Modify the server to send
   date and time info on every connection.

3. Create a duplicated project dir of the
   `EchoService`. Modify the server to
   accept multiple clients. Use the official
   Sockets tutorial from Oracle to do that.
   
### Documentation for Helpfull Unix Tools

    man scp

### Links

* [Oracle, All about Sockets in Java](https://docs.oracle.com/javase/tutorial/networking/sockets/index.html)

### Books

* _Introduction to Java Programming, Comprehensive, 8th Edition by Y. Daniel Liang_
