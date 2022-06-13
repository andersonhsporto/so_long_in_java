# syntax=docker/dockerfile:1.4
FROM ubuntu:20.04
WORKDIR /home/app

RUN ["apt-get", "update", "-y"]
RUN ["apt-get", "install", "openjdk-17-jdk", "curl", "-y"]

ENV url="https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz"
ENV install_dir="/opt/maven"

COPY . .
COPY <<EOF /etc/profile.d/maven.sh
#!/bin/sh
export MAVEN_HOME="$install_dir"
export M2_HOME="$install_dir"
export M2="$install_dir"/bin
export PATH="$install_dir"/bin:$PATH
EOF

RUN mkdir "$install_dir" \
&& curl -fsSL "$url" | tar zx --strip-components=1 -C "$install_dir" \
&& . /etc/profile.d/maven.sh \
&& mvn package

CMD java -jar ./target/BabyServer-0.0.1-SNAPSHOT.jar
EXPOSE 4242
