Marven��Web��Ŀ�Ĵ�����
1.File-New-Project-Marven
	-��ѡCreate from archetype
	-ѡ��org.apache.maven.archetypes:maven-archetype-webapp
	-next-next-finish
	
���ù��ھ���Marven�ֿ�
2.��Ŀ����֮��-�����ҷ������-�㿪Marven-�������ͼ��-Marven Settings
	-�ҵ�Maven home directory,����������Marven�����·��
	-�ڵ��Ե��ļ������ҵ����·��
	-����conf�ļ���
	-��settings.xml�ļ�
	-�ҵ���ǩ��<mirrors>
	-�������ǩ�����һ���ӱ�ǩ��ֱ�Ӹ��ƽ�ȥ����
		<mirror>  
		  <id>alimaven</id>  
		  <name>aliyun maven</name>  
		  <url>http://maven.aliyun.com/nexus/content/groups/public/</url>  
		  <mirrorOf>central</mirrorOf>          
		</mirror> 
	-���棬�������IDEA��ֱ���˳�IDEA
	-���´�IDEA��Ҳ��������IDEA��������ȥ��ȡMarven����
	-ͬ���Ҳ�������Marven
	-���ˢ��ͼ�꣨Reload All Marven Projects��ͬ��Marven
	-�ȴ�ͬ����ɼ���

��Ŀ·������
3.�㿪��Ŀ����ᷢ��ֻ��src/main/webapp������Ŀ¼����û��дԴ�����λ��
	-�Ҽ�main-New-Directory
	-Shiftѡ��java��resources
	-�س�ȷ��
	-��ʱ�����java�ļ���Ӧ��������ɫ��resources�ļ������½��Ǽ����ȸ�
		-�������ͬʱѡ�У��Ǿͷֱ𴴽��������ļ���
		-�����ɫ���ԣ��Ǿ�
			-ѡ��java�ļ���-�Ҽ�-mark directory as-Sources Root
			-ͬ����ѡ��resources�ļ��У���ΪResources Root
	���������*.xml�ļ�ȫ�����õ�resources�ļ�����
		���*.javaԴ����ȫ���ŵ�java�ļ������棬Ҳ������java�ļ������潨��дԴ���뼴��
		
����Ŀ¼�ο�(��IDEA����Ŀ¼)��
	��Ŀ��
		.idea
		src
			main
				java
					com
						��������
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
		��Ŀ��.iml