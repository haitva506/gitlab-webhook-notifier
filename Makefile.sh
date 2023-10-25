#!/bin/bash
#step 1
docker build -f Dockerfile -t gitlab-webhook-notifier .
#step 2
docker-compose -f docker-compose.yml up -d