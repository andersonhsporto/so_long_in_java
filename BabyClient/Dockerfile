FROM ubuntu:20.04

RUN ["apt-get", "update", "-y"]
RUN ["apt-get", "install", "nginx", "-y"]

COPY . /var/www/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]