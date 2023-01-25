package org.example;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        File spoonJar = new File("src/main/resources/spoon-core-10.3.0-beta-11-jar-with-dependencies.jar");
        System.out.println("Spoon jar exists: " + spoonJar.exists());
        URLClassLoader classLoader = new URLClassLoader(new URL[] {spoonJar.toURI().toURL()}, Main.class.getClassLoader());

        Class<?> classToLoad = Class.forName("spoon.Launcher", true, classLoader);
        Method classParser = classToLoad.getMethod("parseClass", String.class);
        Object result = classParser.invoke(null, "class A {}");
        System.out.println(result);
    }
}
