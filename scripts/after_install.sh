#!/bin/bash
cd /root/codecommit-demo
sudo mvn clean install
cp /root/codecommit-demo/target/ccdemo.war /usr/share/tomcat/webapps/
