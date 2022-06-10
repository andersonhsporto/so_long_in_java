FROM postgres:14-alpine

ENV POSTGRES_USER pleiades
ENV POSTGRES_PASSWORD 1234
ENV POSTGRES_DB dailydb

ADD initdb.sql /docker-entrypoint-initdb.d/

EXPOSE 5432

