# 1. Создание Jar файла в IntelliJ Idea
***
### 1.1.1 Выбираем пункт File -> Structure Project
    в пункте Artifacts выбираем Jar -> From modules with depencies..
### 1.1.2 в Main Class указываем главный класс: Main
    далее жмем Apply -> OK
### 1.2.1 выбираем пункт Build -> Build artefacts
    в появившемся окне выбираем Build
### 1.3.1 в папке Out -> artefacts -> находим исполнякмый файл с расширением jar.
***
# 2. Создание Jar файла в консоли
### 2.1 компилируем файл: javac Main.java
### 2.2 создание Manifest.txt файла, указываем в нем -> Main-Class: Main 
### 2.3 jar -cfmv app.jar[имя файла] Manifest.txt Main.class
## Запуск jar файла командой: java -jar app.jar[имя файла]
