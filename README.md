## Spring-boot를 활용한 TO-DO List

### SKill stack
- JDK 1.8
- Spring boot 2.0.6
- Cent OS 7
<br><br>

### basic set up and installation
- kernel update

```
sudo yum update
```

- basic settings

```
# user 추가
adduser devfon

# user 비밀번호 변경
passwd devfon

# 추가한 user 계정으로 이동
cd /home/devfon

# 추가한 user 계정에 sudoer 권한 부여 (그림 1) 참조
vi /etc/sudoers

# UTF-8 인코딩 설정
sudo localectl set-locale LANG=ko_KR.utf8

# .bash_profile에 LANG 정보 추가 (그림 2) 참조
vi .basn_profile 
source .bash_profile
```

- install JDK

```
# JDK 설치
sudo yum install java-1.8.0-openjdk-devel.x86_64
rpm -qa java*jdk-devl

# JAVA path 설정
vi .bash.profile
source .bash_profile

# java version 확인
javac -version

```

- insatll git

```
# 의존 패키지 설치
yum install curl-devel expat-devel gettext-devel \
  openssl-devel zlib-devel

# git 설치
sudo yum install git

# git version 확인
git --version

```

- install mysql

```
yum install mysql-server


```


<br><br>

### git
```
```

<br><br>


### MySQL 
```
# MySQL 로그인
mysql -u root -p
Enter password: 

# Database 생성
CREATE DATABASE HUFFON;
```

<br><br>

### 참조 그림
- (그림 1)

- (그림 2)
