REM
REM This script creates and run the project.
REM

REM create artifacts using maven
call mvnw.cmd clean package

REM create dist folder
rmdir dist /s /q
mkdir dist
mkdir dist\lib

REM copy artifacts to dist folder
xcopy app\target\app-*.jar dist /s /i
xcopy plugins\plugin-one\target\plugin-one-*.jar dist\lib /s
xcopy plugins\plugin-two\target\plugin-two-*.jar dist\lib /s

cd dist

REM unzip app
REM unzip app-*.zip
REM rm app-*.zip

REM run application
java -Dloader.path="lib/" -jar app-0.0.1-SNAPSHOT.jar
cd ..
