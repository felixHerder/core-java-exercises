/*
 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
 * write a method that returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object.
 * Repeat with a method expression and an anonymous inner class.
 *
 * Using the list(FilenameFilter) method of the java.io.File class,
 * write a method that returns all files in a given directory with a given extension.
 * Use a lambda expression, not a FilenameFilter. Which variable from the enclosing scope does it capture?
 *
 * Given an array of File objects, sort it so that directories come before files,
 * and within each group, elements are sorted by path name.
 * Use a lambda expression to specify the Comparator.
 * */

package org.example.ch03interfaces;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

public class Ex11ListFiles {
    public static void main(String[] args) {
        String path = "../";
//        File[] files = getFiles(path);
//        for (File f : files) {
//            System.out.println(f.getName());
//        }

//        String fileExtension = ".zip";
//        File[] files2 = getFiles(path, fileExtension);
//        for (File f : files2) {
//            System.out.println(f.getName());
//        }

        File file = new File(path);

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            sortFiles(files);
            for (File f : files) {
                System.out.println(f.getName());
            }
        }

    }

    private static File[] getFiles(String path) {
        File file = new File(path);

        if (file.isDirectory()) {
//            return file.listFiles((f) -> !f.isDirectory());
            return file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return !f.isDirectory();
                }
            });
        }
        return null;
    }

    private static File[] getFiles(String path, String extension) {
        File file = new File(path);

        if (file.isDirectory()) {
            return file.listFiles((dir, name) -> !new File(dir,name).isDirectory() && name.endsWith(extension));

        }
        return null;
    }

    private static void sortFiles(File[] files) {
        Comparator<File> comp = Comparator.reverseOrder();
        Arrays.sort(files, (a,b) -> a.isDirectory() ? b.isDirectory() ? a.getPath().compareTo(b.getPath()) : -1 : 1);
    }
}
