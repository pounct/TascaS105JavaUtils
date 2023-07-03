1. PURPOSE OF THIS SOFTWARE PACKAGE

Una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

2. WHAT YOU GET

The user interface is formed by the following script files:

	llistaDirectori(String dir)

3. HOW TO USE IT

3.1 cd path to app

	...>cd C:\Users\user\eclipse-workspace\TascaS105JavaUtils
	
result :
C:\Users\user\eclipse-workspace\TascaS105JavaUtils>

3.2 Compilar el script
C:\Users\user\eclipse-workspace\TascaS105JavaUtils>javac -d .\target\classes\ .\src\main\java\n1exercici1\Servicio.java
3.3 Ejecutar el script
C:\Users\user\eclipse-workspace\TascaS105JavaUtils>java -cp .\target\classes\ n1exercici1.N1Exercici1  .\src\main\java\n1exercici1

result:
directori
N1Exercici1.java
readme.txt
Servicio.java

///////////////////////////
/////////  tree  //////////
PS C:\Users\HP_mini\eclipse-workspace\TascaS105JavaUtils> tree /f
Listado de rutas de carpetas
El número de serie del volumen es 42F3-3115
C:.
│   .classpath
│   .gitignore
│   .project
│   pom.xml
│
├───.settings
│       org.eclipse.jdt.core.prefs
│       org.eclipse.m2e.core.prefs
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───n1exercici1
│   │   │       │   N1Exercici1.java
│   │   │       │   readme.txt
│   │   │       │   Servicio.java
│   │   │       │
│   │   │       └───directori
│   │   │           │   file1.txt
│   │   │           │   file2.txt
│   │   │           │
│   │   │           ├───subdir1
│   │   │           └───subdir2
│   │   └───resources
│   └───test
│       ├───java
│       └───resources
└───target
    ├───classes
    │   ├───META-INF
    │   │   │   MANIFEST.MF
    │   │   │
    │   │   └───maven
    │   │       └───TascaS104Testing
    │   │           └───TascaS104Testing
    │   │                   pom.properties
    │   │                   pom.xml
    │   │
    │   └───n1exercici1
    │       │   N1Exercici1.class
    │       │   readme.txt
    │       │   Servicio.class
    │       │
    │       └───directori
    │           │   file1.txt
    │           │   file2.txt
    │           │
    │           ├───subdir1
    │           └───subdir2
    └───test-classes
    
///////////////////////////////////////////////////////////////////////////////////   
///////////// test on other directori   src\main\java\n1exercici1\directori //////

//// sample .\src\main\java\n1exercici1\directori directory in args[] as parameter

PS C:\Users\HP_mini\eclipse-workspace\TascaS105JavaUtils> java -cp .\target\classes\ n1exercici1.N1Exercici1  .\src\main\java\n1exercici1\directori

Result:
file1.txt
file2.txt
subdir1
subdir2


