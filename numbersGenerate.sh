#!/bin/bash

for (( count=1; count<=1000000; count++ ))
  do
    echo "$count" >> numbers.txt
  done