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

## Lab #4, Multiple Networks

1. Create three networks.
2. Use three private network ranges for each network.
3. Each network must have at least 5 host devices (4 computers and 1 server).
4. Each device should be configured to automatically receive a proper IP address for its network from the local server's DHCP service.
5. Ensure that you can ping the servers remotely.
6. Find out the output of the `tracert` command from one machine to any other on another network. Explain the result.
7. Setup the HTTP server in one network. Try to access the intranet site from different networks.

## Lab #5

1. Leave only one server in 10.0.0.0 network.
2. Disable DHCP on that server.
3. Configure DHCP for three networks on the router from CLI.

## Lab #6

Create the following three networks

1. Network 1: 2 machines
2. Network 2: 5 machines
3. Network 3: 9 machines

You can only use the 192.168.0.0 private net for this task.

## Lab #7

1. Setup the DHCP on the Cisco router from the previous network.
2. Start using VLSM subnetting.

## Lab #8

1. Setup two local networks with at least one machines.
2. Connect the two networks with two routers.
3. Allow the packets to pass by configuring the static routes on the Cisco router.

You can use the following networks from class C.

* 192.168.0.0
* 192.168.1.0
* 192.168.2.0

## Lab #9

1. Modify the network from the previous lab to contain two additional routers in-between
   the existing two routers.
2. Setup RIP on all routers to do dynamic configuration and routing of packets.

You can use the following extra networks from class C.

* 192.168.3.0
* 192.168.4.0

## Lab #10

1. Modify the network from the previous lab to contain multiple routes between
   computers with different number of hops.
2. Analyze the routing tables of the routers and figure out the
   pass used between the computers.
   
### Usefull links

* [Private Networks](https://www.cisco.com/c/en/us/support/docs/ip/ip-multicast/13789-35.html)
* [IOS Configuration Basics](https://www.cisco.com/c/en/us/td/docs/switches/wan/mgx/mgx_8850/software/mgx_r3/rpm/rpm_r1-1/configuration/guide/appc.html)
* [IOS DHCP Configuration](https://www.cisco.com/c/en/us/td/docs/ios/12_2/ip/configuration/guide/fipr_c/1cfdhcp.html)
* [Subnetting in IOS](https://www.cisco.com/c/en/us/support/docs/ip/routing-information-protocol-rip/13788-3.html)
* [RIP configuration on IOS](https://www.cisco.com/c/en/us/td/docs/ios-xml/ios/iproute_rip/configuration/15-mt/irr-15-mt-book/irr-cfg-info-prot.html)

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
