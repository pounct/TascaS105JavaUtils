1. PURPOSE OF THIS SOFTWARE PACKAGE

Una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

2. WHAT YOU GET

The user interface is formed by the following script files:

	treeLlistaDirectori(String filename)

3. HOW TO USE IT

3.1 cd path to app

	...>cd C:\Users\user\eclipse-workspace\TascaS105JavaUtils
	
result :
C:\Users\user\eclipse-workspace\TascaS105JavaUtils>

3.2 Compilar el script
PS C:\Users\HP_mini\eclipse-workspace\TascaS105JavaUtils> javac -d .\target\classes\ .\src\main\java\n1exercici2\Servicio.java
3.3 Ejecutar el script
PS C:\Users\HP_mini\eclipse-workspace\TascaS105JavaUtils> java -cp .\target\classes\ n1exercici2.N1Exercici2  .\src\main\java\n1exercici1\directori

result:
.\src\main\java\n1exercici1\directori(D)  Ultima data de modificacio: 2023-07-02T12:49:43.3857834Z
.\src\main\java\n1exercici1\directori\file1.txt(F)  Ultima data de modificacio: 2023-07-02T12:48:50.8663135Z
.\src\main\java\n1exercici1\directori\file2.txt(F)  Ultima data de modificacio: 2023-07-02T12:49:06.2031022Z
.\src\main\java\n1exercici1\directori\subdir1(D)  Ultima data de modificacio: 2023-07-02T12:49:29.1702455Z
.\src\main\java\n1exercici1\directori\subdir2(D)  Ultima data de modificacio: 2023-07-02T12:49:43.3857834Z

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
│   │   │   ├───n1exercici1
│   │   │   │   │   N1Exercici1.java
│   │   │   │   │   readme.txt
│   │   │   │   │   Servicio.java
│   │   │   │   │
│   │   │   │   └───directori
│   │   │   │       │   file1.txt
│   │   │   │       │   file2.txt
│   │   │   │       │
│   │   │   │       ├───subdir1
│   │   │   │       └───subdir2
│   │   │   └───n1exercici2
│   │   │       │   N1Exercici2.java
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
    │   ├───n1exercici1
    │   │   │   N1Exercici1.class
    │   │   │   readme.txt
    │   │   │   Servicio.class
    │   │   │
    │   │   └───directori
    │   │       │   file1.txt
    │   │       │   file2.txt
    │   │       │
    │   │       ├───subdir1
    │   │       └───subdir2
    │   └───n1exercici2
    │       │   N1Exercici2.class
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

PS C:\Users\HP_mini\eclipse-workspace\TascaS105JavaUtils> java -cp .\target\classes\ n1exercici2.N1Exercici2  .\src

Result:
.\src(D)  Ultima data de modificacio: 2023-07-01T15:50:15.5717379Z
.\src\main(D)  Ultima data de modificacio: 2023-07-01T15:50:15.572732Z
.\src\main\java(D)  Ultima data de modificacio: 2023-07-02T14:35:54.9623813Z
.\src\main\java\n1exercici1(D)  Ultima data de modificacio: 2023-07-02T14:37:07.6950995Z
.\src\main\java\n1exercici1\directori(D)  Ultima data de modificacio: 2023-07-02T12:49:43.3857834Z
.\src\main\java\n1exercici1\directori\file1.txt(F)  Ultima data de modificacio: 2023-07-02T12:48:50.8663135Z
.\src\main\java\n1exercici1\directori\file2.txt(F)  Ultima data de modificacio: 2023-07-02T12:49:06.2031022Z
.\src\main\java\n1exercici1\directori\subdir1(D)  Ultima data de modificacio: 2023-07-02T12:49:29.1702455Z
.\src\main\java\n1exercici1\directori\subdir2(D)  Ultima data de modificacio: 2023-07-02T12:49:43.3857834Z
.\src\main\java\n1exercici1\N1Exercici1.java(F)  Ultima data de modificacio: 2023-07-02T14:37:07.6776463Z
.\src\main\java\n1exercici1\readme.txt(F)  Ultima data de modificacio: 2023-07-02T14:34:00.042715Z
.\src\main\java\n1exercici1\Servicio.java(F)  Ultima data de modificacio: 2023-07-02T14:37:07.7020791Z
.\src\main\java\n1exercici2(D)  Ultima data de modificacio: 2023-07-02T14:39:29.6572005Z
.\src\main\java\n1exercici2\directori(D)  Ultima data de modificacio: 2023-07-02T14:40:38.8628627Z
.\src\main\java\n1exercici2\directori\file1.txt(F)  Ultima data de modificacio: 2023-07-02T12:48:50.866Z
.\src\main\java\n1exercici2\directori\file2.txt(F)  Ultima data de modificacio: 2023-07-02T12:49:06.203Z
.\src\main\java\n1exercici2\directori\subdir1(D)  Ultima data de modificacio: 2023-07-02T14:40:20.687068Z
.\src\main\java\n1exercici2\directori\subdir2(D)  Ultima data de modificacio: 2023-07-02T14:40:38.8628627Z
.\src\main\java\n1exercici2\N1Exercici2.java(F)  Ultima data de modificacio: 2023-07-02T16:18:53.0483191Z
.\src\main\java\n1exercici2\readme.txt(F)  Ultima data de modificacio: 2023-07-02T15:45:07.7137403Z
.\src\main\java\n1exercici2\Servicio.java(F)  Ultima data de modificacio: 2023-07-02T16:22:28.5715752Z
.\src\main\resources(D)  Ultima data de modificacio: 2023-07-01T15:50:15.572732Z
.\src\test(D)  Ultima data de modificacio: 2023-07-01T15:50:15.5737307Z
.\src\test\java(D)  Ultima data de modificacio: 2023-07-01T15:50:15.5717379Z
.\src\test\resources(D)  Ultima data de modificacio: 2023-07-01T15:50:15.5737307Z


