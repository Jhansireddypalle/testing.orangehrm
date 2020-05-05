set projectLocation=H:\Selenium web drivers\eclipse-java-2020-03-R-win32-x86_64\javapractice
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
