# jersey-demo
# jersey 实现Hello World

## 配置环境 
1. 安装 Gradle `sudo apt install gradle`

##  运行 demo
1. [~] $: cd jersey-demo
2. [jersey-demo] $: gradle build
3. [jersey-demo] $: gradle -q run

此时，在控制台下应该可以看到类似如下的输出：
```shell
[jersey-demo]$ gradle jettyRun
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
> Building 75% > :jettyRun > Running at http://localhost:8080/jersey-demo
```
> 注意：
1. 在运行 `gradle build` 时，因为第一次下载依赖的 jar 包较慢，请耐心等候
2. 运行 `gradle jettyRun` 时，如果出现端口占用情况，请先将占用的端口的进程杀死再运行此命令

## 在浏览器中验证结果
打开浏览器，输入 `http://localhost:8080/jersey-demo/hello`
将看到页面打印出 `Hello, World!`



