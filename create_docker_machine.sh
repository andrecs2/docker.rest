#!/bin/bash  
for i in 1 2 3; do docker-machine create --driver generic --generic-ip-address=192.168.0.15$i --generic-ssh-key ~/.ssh/id_rsa node-$i; done
echo "criados"
