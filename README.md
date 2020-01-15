# active-mq
Implementation of apache mq in spring boot

----Installing Apache mq------

You can download apache mq from a link given below:

http://activemq.apache.org/activemq-5111-release.html

1). Once download is completed unzip the file

2). Traverse to apache-activemq-5.11.1-bin\bin\win64 and execute the acivemq.bat file.

3). Your apache mq server is up and running.

4). Open localhost:8161/admin.

5). Enter username and password as admin.


--------Running Project-----------------------------
1). Run project as java application

2). Open localhost:8080/send/write_your_message_here

3). Open localhost:8161/admin and go to queues you can verify that queue with name 
testqueue has been created and count for enqueue and dequeue is set one.
