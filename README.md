# javaPratise

everyday  java  practise

it is the beginning of learning java 

believe yourself!you can


安装：
Centos：
sudo yum install docker
 
ubuntu：
sudo apt-get update
sudo apt-get install docker.io docker
增加启动参数:
Centos: 
文件： /etc/sysconfig/docker 
增加一项： OPTIONS="--insecure-registry 0.0.0.0/0"
如果此文件内有代理配置，需注释!

Ubuntu: 
文件：/etc/default/docker 
增加一项：DOCKER_OPTS="--insecure-registry 0.0.0.0/0"
如果此文件内有代理配置，需注释!

注: 配置 --insecure-registry 0.0.0.0/0 启动参数可以支持域名和原配置临时域名同时docker login (推荐).
 
增加docker用户：
sudo usermod -aG docker $USER
 
重启docker:
sudo service docker restart 

注: ps -ef | grep docker 检查是否配置成功.
 
登陆仓库:
sudo docker login docker.zte.com.cn:5000 
Username: 工号 
Password: 密码 
Email: 邮箱 

注：邮箱可不填！！
##########################################这里是制作docker仅了解即可########################################
制作docker
wget -qO - https://get.docker.com/ | sh 下载docker
重启服务
sudo systemctl daemon-reload
sudo systemctl restart docker

sudo usermod -aG docker gituser 将gituser加入docker组，以后就无需sudo
要设置代理，不过192.168.180.15无需代理
docker search ubuntu
docker pull ubuntu:16.04 下载ubuntu 16.04
 启动docker
docker run -t -i ubuntu:16.04

安装环境参考ubuntu编译机搭建的docker部分
apt-get install samba system-config-samba libc6-dev cifs-utils flex bison gawk build-essential expect gettext patch openssh-server openssh-client network-manager-vpnc gparted gksu vim git-core gnupg gperf libesd0-dev zip curl zlib1g-dev gcc-multilib g++-multilib libc6-dev-i386 lib32ncurses5-dev lib32z1 lib32ncurses5 x11proto-core-dev libx11-dev python-markdown libxml2-utils xsltproc subversion vim xrdp libswitch-perl expat libxml-parser-perl autoconf autoconf2.59 ccache openjdk-8-jdk bindfs nfs-common nfs-kernel-server unzip lib32z1-dev python-pexpect bc genisoimage libssl-dev ntpdate tmpreaper mysql-client libmysqlclient-dev xmlstarlet locales

以后要改可以执行
docker run -t -i  docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1

另外还需要做一些额外事情，比如：
1、设置拉代码公钥私钥，以及拷贝repo至/usr/bin下。
2、时区设置为Shanghai，具体操作：
cp -f /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

docker ps  看哈希值，然后就能本地提交了
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' 70d7bdb65b58 ubuntu:16.04_jdk1.8_make4.1
86449e7b87e5cbecb1e0011a2171f0b0a5580cecdc0f108aa77611b2a1354e72
提交完打个tag，如果想覆盖则加-f
docker tag -f ubuntu:16.04_jdk1.8_make4.1 docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
推送公司的docker镜像服务器
docker push docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
########################################################################################################
使用者同样也要执行以下步骤：
服务器首先需要安装docker：
sudo apt-get update
sudo apt-get install docker.io docker

增加docker用户：
sudo usermod -aG docker $USER
 
增加启动参数:
Centos: 
文件： /etc/sysconfig/docker 
增加一项： OPTIONS="--insecure-registry 0.0.0.0/0"
如果此文件内有代理配置，需注释!

Ubuntu: 
文件：/etc/default/docker 
增加一项：DOCKER_OPTS="--insecure-registry 0.0.0.0/0"
如果此文件内有代理配置，需注释!
sudo vim /etc/default/docker 

注: 配置 --insecure-registry 0.0.0.0/0 启动参数可以支持域名和原配置临时域名同时docker login (推荐).
重启docker:
sudo service docker restart 
登陆仓库:
sudo docker login docker.zte.com.cn:5000 
Username: 工号 
Password: 密码 
Email: 邮箱 

注：邮箱可不填！！
 
 
下载docker：
sudo docker pull docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
（L M老项目用：sudo docker pull  docker.zte.com.cn:5000/10128835/ubuntu:15.04-jdk1.7-make-bash-repo）
 
 
加载本地目录/home下面的内容到docker内部的/home目录中：
sudo docker run -t -i -v  /home:/home -v /opt:/opt docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
sudo docker run -t -i -v  /home:/home -v /opt:/opt docker.zte.com.cn:5000/10128835/ubuntu:15.04-jdk1.7-make-bash-repo  (L&M 项目的加载方法)
然后就可以编了，用户用的是root。
记得编译前执行一把export USER=$(whoami)，否则可能报错。

 
############################################SCM请看这里##################################################
条件要求：
1、服务器用户名必须是zte
2、 /home/zte/.exversion个/home/zte/loginfo必须存在
 
执行脚本使用~/.exversion/jenkins_build_docker.sh代替原来的~/.exversion/jenkins_build.sh

 
 
如果想手动编，则手动进入docker
sudo docker run -t -i -v -v /home:/home  docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
export USER=$(whoami)
cp -f /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
 
 
遇到的问题：
1、在docker和持续集成CI结合时遇到了一个问题，手动执行OK
sudo docker pull docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
脚本执行却失败，报Cannot connect to the Docker daemon.
重启了下服务器就好了。
 
#########################################################docker版本更新历史记录########################################################################
docker ps 看哈希值
===========================================15.04=======================================
sudo docker run -t -i docker.zte.com.cn:5000/10128835/ubuntu:15.04-jdk1.7-make-bash-repo
docker commit -m='create 15.04 new docker for sw1' --author='ZhangChun' e49cdbae4cbe ubuntu:15.04-jdk1.7-make-bash-repo
6e118d384bfc4d40a95500f892b639bc97d284db97041401e8c5ec4b626c98bf 主要调整~/.ssh/config Host *
docker commit -m='create 15.04 new docker for sw1' --author='ZhangChun' a4277c1a7787 ubuntu:15.04-jdk1.7-make-bash-repo
61e03a3774fb142dd5907ddbbd853016486239fe4508716c8e317529197e0083 更新repo程序至1.23，以及增加免ssh握手。
docker tag -f ubuntu:15.04-jdk1.7-make-bash-repo docker.zte.com.cn:5000/10128835/ubuntu:15.04-jdk1.7-make-bash-repo
docker push docker.zte.com.cn:5000/10128835/ubuntu:15.04-jdk1.7-make-bash-repo
sudo docker pull docker.zte.com.cn:5000/10128835/ubuntu:15.04-jdk1.7-make-bash-repo
===========================================16.04========================================

docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' d5e54373873d ubuntu:16.04_jdk1.8_make4.1
7a002993ef02a10604aa7d73ca20328802b9094515a8c58a87b0821da0c6dac4
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' 70d7bdb65b58 ubuntu:16.04_jdk1.8_make4.1
86449e7b87e5cbecb1e0011a2171f0b0a5580cecdc0f108aa77611b2a1354e72
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' 16fe1e7cec94 ubuntu:16.04_jdk1.8_make4.1
b020cafb420b4445a9d473b39f23ccbbab62dd88971af49deed40d7d24e063c4 加入repo
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' 89c7206c8a90 ubuntu:16.04_jdk1.8_make4.1
bf84bb9243851613a74a5dde0d867cd701d053508af6b2e55af1f565d04e1653 加入locales
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' 1283f7a0f744 ubuntu:16.04_jdk1.8_make4.1
23c3689a59b6b83dd4d4968413f41d74c0d3813aed638b693efa444a0b0d62b6 设置时区
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' 732ccc58d183 ubuntu:16.04_jdk1.8_make4.1
0742318da1f8ac145d644dc53527089608e829e6976a129ac8e5ef65be1a6bd2 加入soft1-codecheck账户，对持续集成CI支持。
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' f30682da27e4 ubuntu:16.04_jdk1.8_make4.1
cfdc7054747cd24a2d27096112951beb06b7dbe8c2be8b625a7a78ad35999cdf 加入老曾在持续集成上需要的clone技术的lsof
docker commit -m='create 16.04 new docker for sw1' --author='ZhangChun' 4727f554aefd ubuntu:16.04_jdk1.8_make4.1
f5576218e8e63abd9c215042d6a744cbab6a7cc4bfd79a16eb3f7a2ed781e13e config文件host改为*
docker tag -f ubuntu:16.04_jdk1.8_make4.1 docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
docker push docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
sudo docker pull docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1

sudo docker run -t -i -v /home:/home docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
集群
docker run -t -i -v /home:/home -v /opt:/opt docker.zte.com.cn:5000/10128835/ubuntu:16.04_jdk1.8_make4.1
