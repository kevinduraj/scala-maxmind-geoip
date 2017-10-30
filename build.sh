#!/bin/bash

# curl -SsL http://geolite.maxmind.com/download/geoip/database/GeoLite2-City.mmdb.gz | gunzip -c > /tmp/GeoLite2-City.mmdb

sbt clean package
