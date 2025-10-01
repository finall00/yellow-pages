FROM ubuntu:latest
LABEL authors="finall"

ENTRYPOINT ["top", "-b"]