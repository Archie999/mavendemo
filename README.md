标准的maven工程

**mvn生命周期:编译--》测试--》打包--》部署**

mvn拥有三套生命周期:clean,default,site

clean生命周期:pre-clean执行一些清理前的工作,clean清理上一次构建生成的文件,post-clean执行一些清理后的构建

default生命周期:命令	说明
            validate	
            generate-sources	
            process-sources	
            generate-resources	
            process-resources	复制并处理资源文件，至目标目录，准备打包。
            compile	编译项目的源代码。
            process-classes	
            generate-test-sources	
            process-test-sources	
            generate-test-resources	
            process-test-resources	复制并处理资源文件，至目标测试目录。
            test-compile	编译测试源代码。
            process-test-classes	
            test	使用合适的单元测试框架运行测试。这些测试代码不会被打包或部署。
            prepare-package	
            package	接受编译好的代码，打包成可发布的格式，如 JAR 。
            pre-integration-test	
            integration-test	
            post-integration-test	
            verify	
            install	将包安装至本地仓库，以让其它项目依赖。
            deploy	将最终的包复制到远程的仓库，以让其它开发人员与项目共享。

site生命周期:建立和发布项目站点,pre-site,执行生成站点前的工作,site生成站点文档,post-site执行生成站点后的工作,site-deploy将站点发布到服务器上

命令行与生命周期的关系:
mvn clean :处于clean阶段
mvn test:defalut生命周期阶段



**mvn常用指令**
mvn编译: mvn clean compile 

mvn执行测试: mvn clean test
mvn生成骨架项目:mvn archetype:generte
mvn打包: mvn clean package
mvn INSTALL: mvn clean install
mvn 解析依赖:mvn dependency:list
mvn 依赖查看树:mvn dependency:tree
mvn跳过测试:mvn package-DskipTests

**pom.xml元素介绍**

scope介绍:指的是当前依赖的范围
  compile：编译依赖范围,默认的,对于编译,测试,运行三种都有效
  test: 测试依赖范围,只对于测试的classpath有效,比如JUNIT只有在编译测试的时候才用到
  provided:已提供依赖范围,对于编译和测试有效,但是运行时无效
  runtime：运行时依赖范围,对于测试和运行都有效,但是编译主代码时无效
  system:系统依赖范围,通常是指定本地依赖地址
  

mvn 版本发布
mvn release:prepare 准备版本发布
mvn release:rollback回退版本
mvn release:perform 生成源代码并且构建到仓库

