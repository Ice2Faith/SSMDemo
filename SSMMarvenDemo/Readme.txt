Marven下Web项目的创建：
1.File-New-Project-Marven
	-勾选Create from archetype
	-选择org.apache.maven.archetypes:maven-archetype-webapp
	-next-next-finish
	
配置国内镜像Marven仓库
2.项目创建之后-看到右方侧边栏-点开Marven-点击设置图标-Marven Settings
	-找到Maven home directory,这里就是你的Marven插件的路径
	-在电脑的文件夹中找到这个路径
	-进入conf文件夹
	-打开settings.xml文件
	-找到标签：<mirrors>
	-在这个标签下添加一下子标签，直接复制进去即可
		<mirror>  
		  <id>alimaven</id>  
		  <name>aliyun maven</name>  
		  <url>http://maven.aliyun.com/nexus/content/groups/public/</url>  
		  <mirrorOf>central</mirrorOf>          
		</mirror> 
	-保存，返回你的IDEA，直接退出IDEA
	-重新打开IDEA，也就是重启IDEA，让他再去读取Marven配置
	-同样右侧侧边栏打开Marven
	-点击刷新图标（Reload All Marven Projects）同步Marven
	-等待同步完成即可

项目路径配置
3.点开项目，你会发现只有src/main/webapp这样的目录，并没有写源代码的位置
	-右键main-New-Directory
	-Shift选中java和resources
	-回车确定
	-这时，你的java文件夹应该是天蓝色，resources文件夹右下角是几道橙杠
		-如果不能同时选中，那就分别创建这两个文件夹
		-如果颜色不对，那就
			-选择java文件夹-右键-mark directory as-Sources Root
			-同样，选择resources文件夹，改为Resources Root
	这样，你的*.xml文件全部放置到resources文件夹下
		你的*.java源代码全部放到java文件夹下面，也就是在java文件夹下面建包写源代码即可
		
最终目录参考(含IDEA生成目录)：
	项目名
		.idea
		src
			main
				java
					com
						二级包名
							controller
								xxxController.java
								...
							dao
								xxxDao.java
								...
							model/bean
								xxx.java
								...
							service
								xxxService.java
								...
						test
							xxxTest.java
				resources
					mapper
						xxxMapper.xml
						...
					db.properties
					ehcache.xml
					log4j.properties
					mybatis.xml
					spring-mvc.xml
					spring-mybatis.xml
					spring-trans.xml
					...
				webapp
					css
						xxx.css
						...
					js
						xxx.js
						...
					html
						xxx.jsp
						...
					images
						xxx.png
						...
					WEB-INF
						classes
							logging.properties
						web.xml
					index.jsp
		target
		pom.xml
		项目名.iml