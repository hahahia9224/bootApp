#!/usr/bin/env bash

docker run -d --name some-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD='qwe123!@#' -e MYSQL_DATABASE='testdatabase' mysql:5.7