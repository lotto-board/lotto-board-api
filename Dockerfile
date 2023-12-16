# Docker 이미지의 기반이 될 이미지를 선택합니다.
FROM mysql:8.0

# 환경 변수 설정
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=lotto
ENV MYSQL_USER=lotto
ENV MYSQL_PASSWORD=lotto
ENV LANG=C.UTF-8
ENV TZ=Asia/Seoul

# 한글 설정 추가
COPY ./my.cnf /etc/mysql/conf.d/my.cnf
# 포트 설정
EXPOSE 3306

# Docker 컨테이너가 시작될 때 실행할 SQL 스크립트를 복사합니다.
COPY ./sql-scripts/ /docker-entrypoint-initdb.d/