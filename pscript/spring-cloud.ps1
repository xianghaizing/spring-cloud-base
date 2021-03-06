#查看powershell版本
$PSVersionTable.PSVersion
get-process java
stop-process -id id号 #关闭
stop-process -Name 'java' #关闭java
#关闭所有java进程
taskkill /f /im java.exe
#查看指定端口占用
netstat -aon|findstr "8888"
#强制杀死指定端口
taskkill /pid 1076 -t -f

#启动eureka服务 8761
e:
cd E:\xianghaizing\spring-cloud-base\eureka-server
mvn spring-boot:run

#启动hello-service
e:
cd E:\xianghaizing\spring-cloud-base\hello-service
mvn spring-boot:run

cd E:\xianghaizing\spring-cloud-base\hello-service
mvn package

cd E:\xianghaizing\spring-cloud-base\hello-service\target
java -jar hello-service-0.0.1-SNAPSHOT.jar --server.port=8081
java -jar hello-service-0.0.1-SNAPSHOT.jar --server.port=8082


#启动hystrix-client
e:
cd E:\xianghaizing\spring-cloud-base\hystrix-client
start mvn spring-boot:run

cd E:\xianghaizing\spring-cloud-base\hystrix-client
mvn package

cd E:\xianghaizing\spring-cloud-base\hystrix-client\target
java -jar hystrix-client-0.0.1-SNAPSHOT.jar --server.port=8091
java -jar hystrix-client-0.0.1-SNAPSHOT.jar --server.port=8092


#启动hystrix-dashboard 8010
e:
cd E:\xianghaizing\spring-cloud-base\hystrix-dashboard
mvn spring-boot:run

cd E:\xianghaizing\spring-cloud-base\hystrix-dashboard
mvn package

#启动zuul-proxy 8020
e:
cd E:\xianghaizing\spring-cloud-base\zuul-proxy 
mvn spring-boot:run

cd E:\xianghaizing\spring-cloud-base\zuul-proxy 
mvn package

#启动config-server 8888
e:
cd E:\xianghaizing\spring-cloud-base\config-server
mvn spring-boot:run

cd E:\xianghaizing\spring-cloud-base\config-server
mvn package

#启动config-client 8030
e:
cd E:\xianghaizing\spring-cloud-base\config-client
mvn spring-boot:run

cd E:\xianghaizing\spring-cloud-base\config-client
mvn package

cd E:\xianghaizing\spring-cloud-base\config-client\target
java -jar config-client-0.0.1-SNAPSHOT.jar --server.port=8031
java -jar config-client-0.0.1-SNAPSHOT.jar --server.port=8032

#启动config-client 8040
e:
cd E:\xianghaizing\spring-cloud-base\config-bus-client
mvn spring-boot:run

cd E:\xianghaizing\spring-cloud-base\config-bus-client
mvn package

cd E:\xianghaizing\spring-cloud-base\config-client\target
java -jar config-bus-client-0.0.1-SNAPSHOT.jar --server.port=8041
java -jar config-bus-client-0.0.1-SNAPSHOT.jar --server.port=8042

