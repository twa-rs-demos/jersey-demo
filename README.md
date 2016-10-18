# jersey-demo

## 配置环境
1. 安装JDK  
  `sudo apt-get update`　  
  `sudo apt-get install openjdk-8-jdk`

##  运行 demo
1. [~] $: cd jersey-demo
2. [jersey-demo] $: ./gradlew jettyRun

此时，在控制台下应该可以看到类似如下的输出：
```shell
[jersey-demo]$ gradle jettyRun
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
> Building 75% > :jettyRun > Running at http://localhost:8080/jersey-demo
```
> ***注意***：第一次运行 `gradlew jettyRun` 时，会下载 `gradle` 以及相关的依赖文件，需要耐心等待

## 在浏览器中验证结果
打开浏览器，输入 `http://localhost:8080/jersey-demo/hello`
将看到页面打印出 `Hello, World!`



